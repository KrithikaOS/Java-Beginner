import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
         char[] arr= w.toCharArray();
         int index=0;
         int index2=0;
         char temp='*';
         char temp2='*';
         char high=Character.MAX_VALUE;
         boolean flag=false;
         for(int itr= arr.length-1;itr>0;itr--)
           {
               if(arr[itr]>arr[itr-1])
                 {
                     flag=true;
                     index=itr-1;
                     temp=arr[itr-1];
                     break;
                 }
                
           }
           if(flag){
           for(int itr=index+1;itr<arr.length;itr++)
              {if(high>arr[itr] && arr[itr]>temp)
                  {
                      index2= itr;
                      temp2=arr[itr];
                }
               }
            arr[index]=temp2;
            arr[index2]=temp;
            for(int itr=index+1;itr<arr.length-1;itr++)
              {
                  if(arr[itr]>arr[itr+1])
                    {
                     high=arr[itr];
                     arr[itr]=arr[itr+1];
                     arr[itr+1]=high; 
                     itr=index;
                    }
               }
               String st=new String(arr);
             return st;
           }else{
               return "no answer";
           }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
