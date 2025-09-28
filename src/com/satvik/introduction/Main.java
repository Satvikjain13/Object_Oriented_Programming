package com.satvik.introduction;

public class Main {
    public static void main(String[] args) {
        //store 5 roll no.
        int[] numbers=new int[5];

        // store 5 names
        String[] names=new String[5];

        //Data of 5 students : {roll no,name ,marks}
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

        Student[] students=new Student[5];
//        Student satvik;
//        satvik=new Student();

        Student satvik=new Student(128,"Satvik Jain",85.6f);
//        satvik.changeName("Tree Carer");
//        satvik.greeting();
//        satvik.rno=128;
//        satvik.name="Satvik Jain";
//        satvik.marks=89.5f;
//        satvik.salary;



        System.out.println(satvik.rno);
        System.out.println(satvik.name);
        System.out.println(satvik.marks);
        System.out.println("-----------------------------------");
        Student random=new Student(satvik);
        System.out.println(random.name);

        Student random2=new Student();
        System.out.println(random2.name);

        Student one=new Student();
        Student two=one;

        one.name="Something Something";
        System.out.println(two.name);

    }
}
//for every single student
class Student{
    int rno;
    String name;
    float marks=90;

    void greeting(){
        System.out.println("Hello ! My name is "+this.name);
    }
     void changeName(String newName){
        name=newName;
    }

    Student(Student other){  //Constructor Overload8ing
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

//    Student(){
//        this.rno=128;
//        this.name="Satvik Jain";
//        this.marks=89.5f;
//    }

    Student(){
        //this is how you call a constructor from another constructor
        //internally: new St5udent();
        this(13,"default name",100.8f);
    }

//    Student(int rno,String name,float marks){
//        rno=rno;
//        name=name;
//        marks=-marks;
//    }

    //Student arpit=new Studnent(17,"Arpit",89.7);
    //here arpit ius replaced with this

    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}
