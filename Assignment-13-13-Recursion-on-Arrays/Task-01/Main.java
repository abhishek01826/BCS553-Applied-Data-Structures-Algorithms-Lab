/*
 * Name: Abhishek Agnihotri
 * Roll No: 2410303049
 * Student ID: BCS2024011
 * Email: agnihotriabhishek425@gmail.com
 * GitHub: https://github.com/abhishek01826
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 13
 * Task: 1
 */

public class Main {
    static int sum(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sum(a, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(sum(a, 0));
    }
}
