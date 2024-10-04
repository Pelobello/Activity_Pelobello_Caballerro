
package activity_pelobello_caballero;


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
