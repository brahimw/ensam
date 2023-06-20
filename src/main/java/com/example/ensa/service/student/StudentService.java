package com.example.ensa.service.student;


import com.example.ensa.dto.SingleStudentDto;
import com.example.ensa.dto.StudentDto;
import com.example.ensa.response.GeneralResponse;

import java.util.List;

public interface StudentService {
    GeneralResponse addStudent(StudentDto studentDto,Long userId);

    List<StudentDto> getAllStudents();

    GeneralResponse updateStudent(Long studentId, StudentDto studentDto);

    SingleStudentDto getStudentById(Long studentId);

    void deleteStudent(Long studentId);

    List<StudentDto> searchStudentByName(String title);
}
