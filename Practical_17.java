// WAP to check whether the number is Armstrong or not 
import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
      Scanner k = new Scanner(System.in); 
       int n, temp, rem, res = 0;
      System.out.println("Enter a number:");
      n=k.nextInt();  
        temp = n;

        while (temp != 0)
        {
            rem = temp % 10;
            res += Math.pow(rem, 3);
            temp /= 10;
        }

        if(res == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
