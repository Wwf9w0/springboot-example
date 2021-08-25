package com.frixie0.springboot.rest.example.springboot2myBatiswithh2.student;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMyBatisRepository {

    @Select("select * from student")
    public List<Student> findAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    public Student findById(Long id);

    @Delete("DELETE FROM student WHERE id = #{id}")
    public int deleteById(Long id);

    @Insert("INSERT INTO student(id, name, psport) VALUES (${id}, #{name}, #{passport})")
    public int insert(Student student);

    @Update("Update student set name=${name}, passport=#{passport}, where id=#{id}")
    public int update(Student student);
}
