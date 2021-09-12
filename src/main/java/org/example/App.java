package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        String name;
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println(name + " has " + name.length() + " characters.");
    }
}
