package com.example.mybatis.repository;

import com.example.mybatis.domain.Students;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    int countStudents();

    List<Students> findStudents(@Param("id") Long id);

    void saveStudents(Students students);
}