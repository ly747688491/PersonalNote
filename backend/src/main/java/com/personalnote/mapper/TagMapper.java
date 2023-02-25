package com.personalnote.mapper;

import com.personalnote.domain.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author LY
* @description 针对表【tag(标签表)】的数据库操作Mapper
* @createDate 2023-02-25 18:13:20
* @Entity com.personalnote.domain.Tag
*/
@Repository
public interface TagMapper extends BaseMapper<Tag> {

}




