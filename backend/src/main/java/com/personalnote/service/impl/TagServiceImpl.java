package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Tag;
import com.personalnote.service.TagService;
import com.personalnote.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【tag(标签表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




