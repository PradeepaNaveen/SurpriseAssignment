package SurpriseAssignment;
import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args) {
        DivisibleByFive divisible  =new DivisibleByFive();
        divisible.isDivisible();
    }
    public void isDivisible()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int arraySize = input.nextInt();
        System.out.println("Enter k:");
        int k = input.nextInt();
        int[] array = new int[arraySize];
        int sum=0;
        for(int i=0;i<arraySize;i++)
        {
            array[i] = input.nextInt();
        }
        for(int i=0;i<arraySize;i++)
        {
           for(int j=i+1;j<arraySize;j++)
           {
               sum = array[i] + array[j];
               if(sum%k ==0)
                   System.out.println((i+1) + " " +(j+1));
           }
        }
    }
}
