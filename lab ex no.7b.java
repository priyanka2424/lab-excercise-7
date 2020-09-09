/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.*;


public class arraylist2 {
   public static void main(String[] args){
     ArrayList<Student> list=new ArrayList<>();
    Student obj[];
    obj=new Student[20];
    for(int i=0;i<20;i++)
    {
        obj[i]=new Student();
    }
    for(int i=0;i<20;i++)
    {
        list.add(obj[i]);
    }
    Collections.sort(list,new sortbyname());
    System.out.println("Sorted list by name in descending:");
    System.out.println(list);
   
}   
}
class Student
{
    String name;
    String rollno;
    int cgpa;
    Student()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.println("enter the rollno:");
        rollno=obj.next();
        System.out.println("Enter cgpa:");
        cgpa=obj.nextInt();
    }

    

    @Override
    public String toString() {
        return "\n name:"+name+"\t rollno:"+rollno+"\t cgpa:"+cgpa;
    }

    
}
class sortbyname implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
    
    
}