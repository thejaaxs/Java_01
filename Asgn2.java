import java.util.*;
public class Asgn2 {
    public static void oddNum (int n){
        int odd = 0;
        for(int i=1;i<=n;i++){
        if(i%2!=0){
            odd = odd + i ;  
        }
    }
        System.out.println(odd);
        return ;
    }
    public static void main (String args []){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
System.out.println("The sum is : ");
oddNum(n);
    }
}
