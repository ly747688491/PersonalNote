package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Photo;
import com.personalnote.service.PhotoService;
import com.personalnote.mapper.PhotoMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【photo(头像表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo>
    implements PhotoService{

}




