import java.util.*;
public class Asgn8 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n and x ");
        int x = sc.nextInt() ; 
        int n = sc.nextInt () ; 
        int power = 1 ; 
        for(int i = 1 ; i<=n ; i++){
            power = power * x ; 
        }
        System.out.println("The power is : "+power);
    }
}
