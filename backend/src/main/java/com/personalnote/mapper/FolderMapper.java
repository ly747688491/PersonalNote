package com.personalnote.mapper;

import com.personalnote.domain.Folder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author LY
* @description 针对表【folder(文件夹表信息)】的数据库操作Mapper
* @createDate 2023-02-25 18:13:20
* @Entity com.personalnote.domain.Folder
*/
@Repository
@Mapper
public interface FolderMapper extends BaseMapper<Folder> {

}




