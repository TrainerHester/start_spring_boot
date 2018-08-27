package com.alipay.test.start_spring_boot.mapper;

import com.alipay.test.start_spring_boot.entity.UserLowCarbon;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("insert into user_low_carbon(seq, user_id, data_dt, low_carbon) values(#{seq}, #{userId}, #{dataDt}, #{lowCarbon}) ")
    int insertUserLowCarbon(UserLowCarbon userLowCarbon);

}
