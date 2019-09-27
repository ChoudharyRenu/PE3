package com.stackroute.pe3;
import java.io.*;
import java.util.*;
public class StudentMarks {
    private int NumberOfStudents;
    private int[] StudGrades;
    public void setNumberOfStudents(int NumberOfStudents){
        this.NumberOfStudents=NumberOfStudents;
    }
    public void setStudGrades(){
        Scanner sc = new Scanner(System.in);
        StudGrades =new int[NumberOfStudents];
        System.out.println("enter the students grades:-");
        for(int i=0;i<NumberOfStudents;i++){
            System.out.println("enter the grades for student "+ (i+1)+":");
            StudGrades[i]=sc.nextInt();
            if(StudGrades[i]>100 || StudGrades[i]<0){
                try {
                    throw new Exception("demo");
                }
                catch (Exception e){
                    System.out.println("Invalid Grades");
                }
            }

        }
    }
    public static void main(String[] args){
        StudentMarks s=new StudentMarks();
        s.setNumberOfStudents(10);
        s.setStudGrades();
    }

    }

