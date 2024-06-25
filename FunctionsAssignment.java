import java.util.*;
public class FunctionsAssignment{
//     public static void isPrime(int n){
//     if(n<=0){
//         System.out.println("Invalid");
//         return ; 
//     }
//     else if(n==1){
// System.out.println("Either Prime or composite ");
// return ;
//     }
//     else {
//         for(int i = 2 ; i<=n/2 ; i++){
//             if(n%i==0){
//                 System.out.println("Not Prime");
//                 return ;
//             }
//             else {
//                 System.out.println("Prime");
//                 return ; 
//             }
//         }
//     }
// }
// public static void main (String args []){
//  int n = 1 ;
//  isPrime(n);
// }

// public static void isEvenOrOdd (int n ){
//         if(n%2==0){
//             System.out.println("Even");
//             return ; 
//         }
//         else{
//             System.out.println("Odd");
//             return ;
//         }
//     } 
//     public static void main (String args []){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt() ; 
//         System.out.println("The Result is : ");
//         isEvenOrOdd(n);
//     }

public static void printTable (int n){
    for(int i = 1 ; i<=10 ; i++){
        System.out.println(n+" X "+i+" = "+ (n*i));
    }
    return ; 
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number : ");
    int n = sc.nextInt(); 
    System.out.println("The Table Displayed is : ");
    printTable(n);
    sc.close();

}
}