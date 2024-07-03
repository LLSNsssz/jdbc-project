package com.example.mybatis.sevice;

import com.example.mybatis.domain.Students;
import com.example.mybatis.repository.StudentMapper;
import com.example.mybatis.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public int countStudent() {
        return studentRepository.countStudents();
    }

    public List<Students> getStudents(Long id) {
        return studentRepository.findStudents(id);
    }

    public void saveStudents(Students students) {
        studentMapper.saveStudents(students);
    }
}
