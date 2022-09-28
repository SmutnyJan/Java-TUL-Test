/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.itj0hnny.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author smutn
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + b + " " + a * b);      
        //System.out.format("%d %d", a+b, a*b); druhá možnost
    }
}
