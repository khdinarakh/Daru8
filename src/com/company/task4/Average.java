package com.company.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Average {
    private List<Integer> list = new ArrayList<>();

    public Average() {

    }

    public Average(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> digits) {
        this.list = digits;
    }

    public double returnAverage() {
        double sum = 0;
        for (Integer list1 : list) {
            sum += list1;
        }
        return sum / list.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Average)) return false;
        Average average = (Average) o;
        return getList().equals(average.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getList());
    }

    @Override
    public Average clone() throws CloneNotSupportedException{
        return (Average) super.clone();
    }
}
