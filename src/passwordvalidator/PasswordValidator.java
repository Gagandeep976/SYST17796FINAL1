
package passwordvalidator;


   public class PasswordValidator {

    public static int calculateNet(int hours, int rate, int tax){
     int  gross= hours*rate;
     int net= gross-tax;
        return net;
 } 

}   
   

