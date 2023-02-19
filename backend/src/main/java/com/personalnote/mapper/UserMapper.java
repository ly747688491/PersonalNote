package com.personalnote.mapper;

import com.personalnote.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
* @author LY
* @description 针对表【user(用户表信息)】的数据库操作Mapper
* @createDate 2023-02-18 16:42:14
* @Entity generator.domain.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {

    @MapKey("id")
    Map<String , Object> selectMapById(long id);

}



