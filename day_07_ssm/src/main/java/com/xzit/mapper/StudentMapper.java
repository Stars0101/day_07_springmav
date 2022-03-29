package com.xzit.mapper;

import com.xzit.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    @Insert("insert into Student values(null,#{name},#{age},#{gender})")
    void save(Student student);
    @Select("select * from student ")
    List<Student> selectList();
    @Delete("delete from student where id=#{id}")
    void delete(int id);
}
