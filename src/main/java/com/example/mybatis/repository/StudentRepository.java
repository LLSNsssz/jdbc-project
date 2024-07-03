package com.example.mybatis.repository;

import com.example.mybatis.domain.Students;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private final StudentMapper studentMapper;

    public StudentRepository(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

//    @Autowired private StudentMapper studentMapper;

    public int countStudents() {
        return studentMapper.countStudents();
    }

    public List<Students> findStudents(Long id) {
        return studentMapper.findStudents(id);
    }
}
