/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_pelobello_caballero;


public class Student {

  
    public String getFullName() {
        return fullName;
    }

  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        this.age = age;
    }

  
    public int getGraderLevel() {
        return graderLevel;
    }

    public Student(String fullName, int age, int graderLevel) {
        this.fullName = fullName;
        this.age = age;
        this.graderLevel = graderLevel;
    }

  
    
    public void setGraderLevel(int graderLevel) {
        this.graderLevel = graderLevel;
    }

    public Student() {
    }
   private String fullName;
   private int age;
   private int graderLevel;
}
