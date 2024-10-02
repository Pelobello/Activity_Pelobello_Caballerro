/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_pelobello_caballero;

/**
 *
 * @author Calyle
 */
public class mean {

    public mean() {
        
    }
    public double  mean (double[] data){
        int i;
        double sum = 0;
        for(i = 0; i < data.length; i++){
            sum += data[i];
        }
        return sum/data.length;
    }
    
    
}
