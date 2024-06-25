package org.example.oop_dz5.model;

public class Student extends User{

    private long studentID;

    public Student(String firstName, String lastName, String middleName, long studentID) {
        super(firstName, lastName, middleName);
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", middleName='" + getMiddleName() + '\'' +
                '}';
    }
}
