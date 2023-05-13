package org.rpc.docker;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {

    @Select("SELECT * from docker.book where Id = #{Id}")
    Book getBookById(@Param("Id")Integer id);
}
