/**
 * 
 */
package com.wipro.java;

class MyClass {
    int num = 5;
 
    public void changeValue(int num) {
        this.num = num;
    }
 
    public static void main(String[] args) {
//    	creating the object for the class named MyClass
        MyClass obj = new MyClass();
//      now calling the changeValue() method by passing 10 as parameter
        obj.changeValue(10);
//      printing the value in variable num
        System.out.println(obj.num);
    }
}