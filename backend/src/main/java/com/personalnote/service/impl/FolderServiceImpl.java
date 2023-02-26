package com.personalnote.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Folder;
import com.personalnote.result.ErrorCodeEnum;
import com.personalnote.service.FolderService;
import com.personalnote.mapper.FolderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【folder(文件夹表信息)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class FolderServiceImpl extends ServiceImpl<FolderMapper, Folder>
    implements FolderService{
    @Autowired FolderMapper folderMapper;

    @Override
    public ErrorCodeEnum addFolder(Folder folder) {
        QueryWrapper<Folder> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",folder.getUserId());
        wrapper.eq("folder_name",folder.getFolderName());
        if(this.count(wrapper)>0){
            return ErrorCodeEnum.USER_ERROR_A0200;
        }
        if (folderMapper.insert(folder) == 1){
            return ErrorCodeEnum.SUCCESS;
        }
        else {
            return ErrorCodeEnum.USER_ERROR_A9999;
        }
    }
}




