import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int a,b,i;
     Scanner input = new Scanner(System.in);
     a = input.nextInt();
     for(i = 1;i <= a;i = i + 2)
     {
         System.out.printf("%d\n", i);
     }
   } 
}
