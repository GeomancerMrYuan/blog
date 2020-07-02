package com.mryuan.vueblog.service.impl;

import com.mryuan.vueblog.entity.Blog;
import com.mryuan.vueblog.mapper.BlogMapper;
import com.mryuan.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuanpeng
 * @since 2020-07-02
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
