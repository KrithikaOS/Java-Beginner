import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheBirthdayBar {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int[] a=new int[100];
         int flag=0;
        for (int i =0; i < s.size(); i++) 
           a[i] = s.get(i);
        for (int i =0; i < s.size(); i++) 
           {     int k=i;
                 int count=a[i];
               for(int j=0;j<m-1;j++)
                 {
                     count+=a[k+1];
                     k++;
                 }
                if(count==d)
                {// System.out.println(count);
                  flag=flag+1;
                } 
           }
            
       //System.out.println(flag);
       return flag;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
