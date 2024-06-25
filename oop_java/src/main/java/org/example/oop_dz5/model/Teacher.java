package org.example.oop_dz5.model;

public class Teacher extends User{
    private long teacherId;

    public Teacher(String firstName, String lastName, String middleName, long teacherId) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public long getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", middleName='" + getMiddleName() + '\'' +
                '}';
    }
}
