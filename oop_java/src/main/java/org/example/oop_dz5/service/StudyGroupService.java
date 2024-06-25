package org.example.oop_dz5.service;

import org.example.oop_dz5.model.Student;
import org.example.oop_dz5.model.StudyGroup;
import org.example.oop_dz5.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> list){
        return new StudyGroup(teacher,list);
    }
}
