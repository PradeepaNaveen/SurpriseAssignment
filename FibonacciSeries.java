package SurpriseAssignment;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        series.findFibonacci();
    }
    public void findFibonacci()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = input.nextInt();
        int a=1,b=2,c=0;
        int result;
        System.out.println("1");
        while(c<=range)
        {
            c = a+b;
            result = findPrime(c);
            if(result == 0) {
                System.out.println(c);
            }
            a=b;b=c;
        }
    }
    public int findPrime(int c)
    {
        for(int i=2;i<=c/2;i++)
        {
            if(c%i != 0)
                return 0;
        }
        return 1;
    }
}
