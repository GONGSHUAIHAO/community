package com.gqq.community.mapper;

import com.gqq.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: UserMapper
 * @description: TODO
 * @author: GQQ
 * @create: 2020/1/3 1:43
 * @Version: 1.0
 **/
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) " +
            "values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
