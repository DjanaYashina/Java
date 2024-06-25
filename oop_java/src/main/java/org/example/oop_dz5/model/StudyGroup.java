package org.example.oop_dz5.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private final Teacher teacher;
    private final List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
