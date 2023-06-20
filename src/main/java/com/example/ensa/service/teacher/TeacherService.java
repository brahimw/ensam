package com.example.ensa.service.teacher;

import com.example.ensa.dto.SingleTeacherDto;
import com.example.ensa.dto.TeacherDto;
import com.example.ensa.response.GeneralResponse;

import java.util.List;

public interface TeacherService {
    GeneralResponse addTeacher(Long userId, TeacherDto teacherDto);

    List<TeacherDto> getAllTeachers();

    void deleteTeacher(Long teacherId);

    GeneralResponse updateTeacher(Long teacherId, TeacherDto teacherDto);

    SingleTeacherDto getTeacherById(Long teacherId);
}
