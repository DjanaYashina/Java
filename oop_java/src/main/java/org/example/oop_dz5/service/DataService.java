package org.example.oop_dz5.service;

import org.example.oop_dz5.model.Student;
import org.example.oop_dz5.model.Teacher;
import org.example.oop_dz5.model.Type;
import org.example.oop_dz5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> userList = new ArrayList<>();

    public void create(String firstName, String lastName, String middleName, Type type){
        long id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(firstName, lastName, middleName,id);
            userList.add(student);
        }
        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(firstName, lastName, middleName,id);
            userList.add(teacher);
        }

    }

    public User getUserById(Type type, long id){
        boolean istStudent = Type.STUDENT == type;
        User currentuser = null;

        for (User user: userList){
            if(user instanceof Teacher && !istStudent && ((Teacher)user).getTeacherId() == id){
                currentuser = user;
            }
            if (user instanceof Student && istStudent && ((Student) user).getStudentID() == id){
                currentuser = user;
            }
        }
        return currentuser;
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }
    public List<Teacher> getAllTeacher(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Teacher){
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    private long getFreeId(Type type){
        boolean istStudent = Type.STUDENT == type;
        long lastId = 1;
        for (User user: userList){
            if(user instanceof Teacher && !istStudent){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && istStudent){
                lastId = ((Student) user).getStudentID() + 1;
            }
        }
        return lastId;
    }
}
