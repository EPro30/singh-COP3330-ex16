/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exAgeValidation {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        String str = age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(str);
    }
}
