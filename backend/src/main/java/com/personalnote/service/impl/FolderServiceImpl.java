package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Folder;
import com.personalnote.service.FolderService;
import com.personalnote.mapper.FolderMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【folder(文件夹表信息)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class FolderServiceImpl extends ServiceImpl<FolderMapper, Folder>
    implements FolderService{

}




