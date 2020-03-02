package calculater;

import java.util.Scanner;

public class calculater {

    /**
     * @param args the command line arguments
     */
    
        
public double add(double a,double b) {
        
        double first = a;
       
        double second = b ;
        double result;
        char operator='+';
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            default:
                System.out.printf("the operater enterd is not valid");
                return 0;
        }

        return result;
    }
//public static void main(String[] args) {
	
	
//}
}

