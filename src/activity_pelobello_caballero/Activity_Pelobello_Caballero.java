/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_pelobello_caballero;

import java.util.ArrayList;
import java.util.List;


public class Activity_Pelobello_Caballero {

    
    public static void main(String[] args) {
      List<Student>list = new ArrayList<>();
        Calculator calculator = new Calculator();
        
        System.out.println(calculator.calculate(10, 2, 3,5));
        System.out.println("");
        mean Mean = new mean();
        double data[] = {1,2,3,4,5};
        Mean.mean(data);
        Student student = new Student("Dazzle Pelobello", 20, 1.5);
        Student student1 = new Student("Dazzle Pelobello", 20, 1.5);
        Student student2 = new Student("Dazzle Pelobello", 20, 1.5);
       
        
        list.add(student);
        list.add(student1);
        list.add(student2);
        
        
        System.out.println("Student Data");
        for (Student studentdata : list) {
            
            System.out.println("FullName: "+studentdata.getFullName()+"\n"+"Age: " +studentdata.getAge() +"\n"+"Grade Level: "+studentdata.getGraderLevel()+"\n");
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
