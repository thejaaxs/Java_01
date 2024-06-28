import java.util.* ; 
public class Asgn11 {
    public static void main (String args []){
        // Scanner s = new Scanner (System.in);
        // int n1 = 0 ; 
        // int n2 = 1 ; 
        // System.out.println("Enter The number :");
        // int n3 = s.nextInt() ; 
        // int n = 9 ; 
        // System.out.print(n1+" "+n2);
        // for(int i = 2 ; i<n ; i++){
        //     n3 = n1 + n2 ; 
        //     System.out.print(" "+n3);
        //     n1 = n2 ; 
        //     n2 = n3 ;
        // }

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt() ; 
        int a = 0 ; 
        int b = 1 ; 
        System.out.print(a+"");
        for(int i = 2 ; i<=n;i++){
            System.out.print(" "+b);
            int temp = b ;
            b = a+b;
            a = temp ; 
        }
        System.out.println();
    }
}