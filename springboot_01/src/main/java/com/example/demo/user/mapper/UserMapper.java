package com.example.demo.user.mapper;

import com.example.demo.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-01-15
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();

}
