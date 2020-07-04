package com.mryuan.system.service.impl;

import com.mryuan.system.entity.User;
import com.mryuan.system.mapper.UserMapper;
import com.mryuan.system.service.UserService;
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
