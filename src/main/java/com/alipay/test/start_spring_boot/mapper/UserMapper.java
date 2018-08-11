package com.alipay.test.start_spring_boot.mapper;

import com.alipay.test.start_spring_boot.entity.UserLowCarbon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dly on 2018/7/13
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user_low_carbon WHERE user_id = #{user_id}")
    List<UserLowCarbon> findByUserId(@Param("user_id") String userId);
}
