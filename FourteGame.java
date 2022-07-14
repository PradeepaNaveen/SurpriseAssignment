package SurpriseAssignment;
import java.util.*;
public class FourteGame
 {
     public static void main(String[] args) {
         FourteGame gameApplication = new FourteGame();
        gameApplication.fourteGameDeveloping();
    }
    public void fourteGameDeveloping()
    {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queueIndex = new LinkedList();
        Stack<Character> stackIndex = new Stack<>();
        System.out.println("Instructions to the gamer:");
        System.out.println("First enter the four numbers that it is from 0-9 and then enter the four operators i.e +-*/ and resultant target number will be given sum up accordingly..");
        int[] inputArray = new int[5];
        char[] operationPerform = new char[4];
        queueIndex.add(11);
        queueIndex.add(7);
        for(int i=0;i<operationPerform.length;i++)
            stackIndex.push(operationPerform[i]);
        System.out.println("Fourte Game opens now...........");
        System.out.println("Ready to play....Its now get started........" );
        int matrix1[][] = {{4,1},{9,7}};
        int matrix2[][] = {{5,4},{3,1}};
        int k=0;
        int numberOfAttempts = 0;
        int score = 0;
        HashMap<Integer,int[][]> mapIndex = new HashMap<>();
        while(k<queueIndex.size()) {
            if (queueIndex.isEmpty())
            {
                System.out.println("Game is over........");
                System.out.println("Your score point is:" +score);
                break;
            }
            else
            {
                System.out.println("Ouput is:" +"9-4+7-1");
            }
            mapIndex.put(queueIndex.peek(), matrix1);
            for(int i=0;i<matrix1.length;i++)
            {
                if(stackIndex.pop()!= '+')
                {
                    stackIndex.pop();
                }
            }
            System.out.println("HAshMAp is" + mapIndex);
            queueIndex.poll();
            mapIndex.put(queueIndex.peek(), matrix2);
            queueIndex.poll();
            k++;
            score++;
        }
    }
}

