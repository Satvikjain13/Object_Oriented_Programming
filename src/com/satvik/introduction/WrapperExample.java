package com.satvik.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a=10;//It is primitive
        int b=20;
        Integer num=new Integer(15);//It is an Object

        Integer num1=120;
        Integer num2=128;

        final A satvik=new A("Satvik Jain");
        satvik.name="Other name";

        //When  a non primitive is final ,you cannot reassign it.
//        satvik=new A("new Object");

        A obj;

        for (int i=0;i<100000;i++){
            obj=new A("Random name");
        }

        //        a.
//        num.

        swap(a,b);
//        System.out.println(a + "    " +b);

        swap2(num1,num2);
        System.out.println(num1 +" "+num2);

        final int BONUS=2;
//        BONUS=3;
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static void swap2(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}

class A{
     final int num=10;
     String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
