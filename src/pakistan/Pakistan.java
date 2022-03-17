/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakistan;

import java.util.Scanner;

/**
 *
 * @author Raffay
 */
public class Pakistan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
    String[] name;
    Double[] marks;
name = new String[3];
marks = new Double[3];
    System.out.println("Enter the name of Student 1");
    name[0]=input.next();
    System.out.println("Enter the marks of English");
    marks[0]=input.nextDouble();
    System.out.println("Enter the marks of Urdu");
    marks[1]=input.nextDouble();
    System.out.println("Enter the marks of maths ");
    marks[2]=input.nextDouble();
   Double sum = marks[0]+marks[1]+marks[2];
    System.out.printf("Total marks are %f",sum );
    
    
    Double[] marks2=new Double[3];
    System.out.println(" \nEnter the name of student 2 ");
    name[1]=input.next();
    System.out.println("Enter the marks of English");
    marks2[0]=input.nextDouble();
    System.out.println("Enter the marks of Urdu");
    marks2[1]=input.nextDouble();
    System.out.println("Enter the marks of maths ");
    marks2[2]=input.nextDouble();
    
     Double sum1 = marks2[0]+marks2[1]+marks2[2];
    System.out.printf("Total marks are %f",sum1 );
    
    Double[] marks3=new Double[3];
     System.out.println("\nEnter the name of student 3 ");
    name[2]=input.next();
    System.out.println("Enter the marks of English");
    marks3[0]=input.nextDouble();
    System.out.println("Enter the marks of Urdu");
    marks3[1]=input.nextDouble();
    System.out.println("Enter the marks of maths ");
    marks3[2]=input.nextDouble();
   
     Double sum2 = marks3[0]+marks3[1]+marks3[2];
    System.out.printf("Total marks are %f",sum2 );
    
    
    if(sum > sum1&& sum > sum2 ){
    System.out.println("\nStudent 1 has hightest marks ");
    }
    else if(sum1 > sum && sum1>sum2){
    System.out.println("\nStudent 2 has hightest marks ");
    }
    else{
    System.out.println("\nStudent 3 has hightest marks ");
    }
    
    
        
        
    }
    
}
