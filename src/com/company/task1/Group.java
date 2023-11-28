package com.company.task1;

public class Group implements Cloneable{
    private int groupNumber;

    public Group(int groupNumber) {
        setGroupNumber(groupNumber);
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Group clone() throws CloneNotSupportedException{
        return (Group) super.clone();
    }
 }
