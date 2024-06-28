// import java.util.*;
// public class Asgn9 {
    


// // public class Solutions {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();


//        while(n1 != n2) { 
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is : "+ n2);
//    }   
// }

import java.util.* ; 
public class Asgn9{
    public static void printGcd(int a , int b){
        while(a!=b){
            if(a>b){
                a = a - b ;
            }
            else {
                b = b - a ; 
            }
        }
System.out.println("GCD is " +a);
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the values of a and b :");
        int a = sc.nextInt() ; 
        int b = sc.nextInt() ; 
        printGcd(a, b);

    }
}

