package com.company;

import com.company.task1.Student;
import com.company.task2.Triangle;
import com.company.task3.Rectangle;
import com.company.task4.Average;
import com.company.task5.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // task 1
        Student first = new Student();
        first.setName("Алиса");
        first.setSurname("Смит");
        first.setAddress("Коктем-2");
        first.setId(24);

        Student second = new Student("Азамат", "Азаматулы", "New York", 1);
        Student third = new Student("Кристина", "Азаматулы", "New York", 3);
        System.out.println(second.toString());
        System.out.println(third.toString());
        System.out.println(first.toString());

        // task 2
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());

        //task 3
        Rectangle rectangle = new Rectangle(5, 9);
        System.out.println("Rectangle Area: " + rectangle.returnArea());
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println("Rectangle Area: " + rectangle2.returnArea());

        //task 4


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        Average average = new Average(list);

        System.out.println("Average: " + average.returnAverage());

        //task 5

        Movie movie = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie( "Главный герой", "20th Century Studios");

        System.out.println(movie.toString());
        System.out.println(movie2.toString());

    }
}
