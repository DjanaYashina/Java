package org.example.oop_dz5.controller;

import org.example.oop_dz5.model.Student;
import org.example.oop_dz5.model.StudyGroup;
import org.example.oop_dz5.model.Teacher;
import org.example.oop_dz5.model.Type;
import org.example.oop_dz5.service.DataService;
import org.example.oop_dz5.service.StudyGroupService;
import org.example.oop_dz5.view.StudentView;
import org.example.oop_dz5.view.StudyGroupView;
import org.example.oop_dz5.view.TeacherView;

import java.util.List;

public class Controller {

    private final DataService dataService = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    private final StudentView view = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView studyGroupView = new StudyGroupView();


    public void createStudent(String firstName, String lastName, String middleName){
        dataService.create(firstName,lastName,middleName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String lastName, String middleName){
        dataService.create(firstName,lastName,middleName, Type.TEACHER);
    }

    public void getAllStudent(){
        List<Student> userList = dataService.getAllStudent();
        for (Student student : userList){
            view.printOnConsole(student);
        }
    }
    public void getAllTeacher(){
        List<Teacher> userList = dataService.getAllTeacher();
        for (Teacher teacher : userList){
            teacherView.printOnConsole(teacher);
        }
    }

    public void createStudyGroup(){
        StudyGroup studyGroup = studyGroupService.createStudyGroup(
                (Teacher) dataService.getUserById(Type.TEACHER,1),
                dataService.getAllStudent()
        );
        studyGroupView.printOnConsole(studyGroup);
    }


}
