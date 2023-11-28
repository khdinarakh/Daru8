package com.company.task1;

import java.util.Objects;

public class Student implements Cloneable{

    private Integer id;
    private String name;
    private String surname;
    private String address;
    private Group group;


    public Student(){

    }

    public Student(Integer id, String name, String surname, String address, Group group) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getName().equals(student.getName()) && getSurname().equals(student.getSurname()) && getAddress().equals(student.getAddress()) && getId().equals(student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAddress(), getId());
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        Student newStudent = (Student) super.clone();
        Group group = (Group) this.getGroup().clone();
        newStudent.setGroup(group);
        return newStudent;
    }
}
