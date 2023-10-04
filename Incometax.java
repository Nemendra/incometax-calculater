import java.util.*;
public class incometax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double tax = 0, income ;
        System.out.println("Enter income");
        income = sc.nextDouble();
        if(income <= 250000){
            tax = 0;
        }
        else if (income <= 500000){
            tax = 0.5 * (income - 250000);
        }
        else if(income <= 1000000){
            tax = 0.2 *(income - 500000) + (0.5 * 250000);
        }
        else {
            tax = 0.3 * (income - 1000000) + (0.2 * 500000) + (0.5 * 250000);
        }
        System.out.println("Tax ="+ tax);
    }
}
 
    

