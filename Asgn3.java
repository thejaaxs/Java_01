import java.util.*;
public class Asgn3 {
    public static void greatOfTwo(int a , int b){
        if(a==b){
            System.out.println("Tie");
            return ; 
        }
        else if(a>b){
            System.out.println(a+" is greater than "+b);
            return ;
        }
        else{
            System.out.println(b+" is greater than "+a);
            return ;
        } 
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The result is :");
        greatOfTwo(a,b);
    }
}
