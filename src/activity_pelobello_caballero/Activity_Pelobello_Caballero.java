/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_pelobello_caballero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Activity_Pelobello_Caballero {

    
    public static void main(String[] args) {
      List<Student>list = new ArrayList<>();
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        
        System.out.println(calculator.calculate(10, 2, 3,5));
        System.out.println("");
        mean Mean = new mean();
        double data[] = {1,2,3,4,5};
        Mean.mean(data);
       
       
        
           while (true) {            
            System.out.print("Enter Student Full Name: ");
            String studentFullName = scan.nextLine();
            
            int studentAge = 0;
            int studentGradeLvl = 0;
            boolean validInput = false;
            
          
            while (!validInput) {
                System.out.print("Enter Student Age: ");
                if (scan.hasNextInt()) {
                    studentAge = scan.nextInt();
                    scan.nextLine();  
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for age.");
                    scan.nextLine(); 
                }
            }
            
          
            validInput = false;
            
          
            while (!validInput) {
                System.out.print("Enter Student Grade Level: ");
                if (scan.hasNextInt()) {
                    studentGradeLvl = scan.nextInt();
                    scan.nextLine();  
                    System.out.println("");
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for grade level.");
                    scan.nextLine(); 
                }
            }

            // Create student object and add to list
            Student student = new Student(studentFullName, studentAge, studentGradeLvl);
            list.add(student);

            // Print student data
            for (Student studentData : list) {
                System.out.println("FullName: " + studentData.getFullName().toUpperCase() + "\n" +
                                   "Age: " + studentData.getAge() + "\n" +
                                   "Grade Level: " + studentData.getGraderLevel() + "\n");
            }
             
             
             
        }

        
    }
  
}
   class Calculator{
         public int calculate(int fnum,int snum,int tnum,int fonum){
        
        int total = fnum + snum -tnum;
       
        int totalthree = total/ fonum;
        return totalthree;
         }
      
         
    }
