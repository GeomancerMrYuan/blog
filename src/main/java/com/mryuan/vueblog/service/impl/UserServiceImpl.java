package com.mryuan.vueblog.service.impl;

import com.mryuan.vueblog.entity.User;
import com.mryuan.vueblog.mapper.UserMapper;
import com.mryuan.vueblog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
