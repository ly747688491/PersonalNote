package com.personalnote.service;

import com.personalnote.domain.Folder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.personalnote.result.ErrorCodeEnum;

/**
* @author LY
* @description 针对表【folder(文件夹表信息)】的数据库操作Service
* @createDate 2023-02-25 18:13:20
*/
public interface FolderService extends IService<Folder> {

    ErrorCodeEnum addFolder(Folder folder);
}
