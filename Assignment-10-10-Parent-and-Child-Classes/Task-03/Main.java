/*
 * Name: Abhishek Agnihotri
 * Roll No: 2410303049
 * Student ID: BCS2024011
 * Email: agnihotriabhishek425@gmail.com
 * GitHub: https://github.com/abhishek01826
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 10
 * Task: 3
 */

class Person {
    String name;
    void greet() { System.out.println("Hello, " + name); }
}
class Teacher extends Person { }
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}
