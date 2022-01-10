package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //Constructor
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    static void change() {
        college = "CODEGYM";
    }

    void display(){
        System.out.println("Học sinh số "+rollno+" tên "+name+" trường "+college);
    }
}
