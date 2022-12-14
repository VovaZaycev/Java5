package com.chnulabs.lab_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNamber;

    public Student(String name, String groupNamber){
        this.name = name;
        this.groupNamber = groupNamber;
    }
    public String getName() {
        return name;
    }
    public String getGroupNamber(){
        return groupNamber;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Зеленський Володимир","301"),
                    new Student("Коваленко Костантин","301"),
                    new Student("Бондаренко Анна","302"),
                    new Student("Магомедова Ірина","302"),
                    new Student("Мороз Богдан","308"),
                    new Student("Костенко Ілля","308"),
                    new Student("Шевченко Ольга","308"),
                    new Student("Василенко Данило","309"),
                    new Student("Швець Єлизавета","309")
            )
    );
    public static  ArrayList<Student> getStudents(String groupNamber){
        ArrayList<Student> stList = new ArrayList<>();
        for(Student s: students) {
            if (s.getGroupNamber().equals(groupNamber)){
                stList.add(s);
            }
        }
        return stList;
    }
}