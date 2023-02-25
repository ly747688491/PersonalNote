package com.personalnote.mapper;

import com.personalnote.domain.Photo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author LY
* @description 针对表【photo(头像表)】的数据库操作Mapper
* @createDate 2023-02-25 18:13:20
* @Entity com.personalnote.domain.Photo
*/
@Repository
public interface PhotoMapper extends BaseMapper<Photo> {

}




