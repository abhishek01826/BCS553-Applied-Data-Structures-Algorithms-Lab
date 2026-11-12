/*
 * Name: Abhishek Agnihotri
 * Roll No: 2410303049
 * Student ID: BCS2024011
 * Email: agnihotriabhishek425@gmail.com
 * GitHub: https://github.com/abhishek01826
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 12
 * Task: 2
 */

public class Main {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
