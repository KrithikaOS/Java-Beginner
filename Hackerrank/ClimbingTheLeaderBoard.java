import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClimbingTheLeaderBoard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int scoreslen= scores.length;
        int alicelen= alice.length;
        int alicerank[]=new int[alicelen];
        int playersrank[]=new int[scoreslen];
        int rank=2;
        playersrank[0]=1;
        for(int i=1;i<scoreslen;i++,rank++)
           {
               if(scores[i]==scores[i-1])
                 {
                     playersrank[i]=playersrank[i-1];
                     rank=rank-1;
                 }

                else
                {
                    playersrank[i]=rank;
                }
           }

        for(int i=0;i<alicelen;i++)
          {    
              
               if(alice[i]<scores[scoreslen-1])
               { 
                      alicerank[i]= playersrank[scoreslen-1]+1;
                      continue;
               }
               else if (alice[i]==scores[scoreslen-1])
               {
                    alicerank[i]= playersrank[scoreslen-1];
                    continue;
               }
               else if (alice[i]>=scores[0])
               {
                   alicerank[i]= playersrank[0];
                   continue;
               }
              for(int j=scoreslen-1;j>0;j--)
                    {
                        if(alice[i]>scores[j] && alice[i]<scores[j-1])
                             {
                                 alicerank[i]=playersrank[j-1]+1;
                                 break; 
                             }
                           
                        else if(alice[i]==scores[j])
                           {
                               alicerank[i]=playersrank[j];
                               break;
                           }

                    }
          }
   
      return alicerank;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
