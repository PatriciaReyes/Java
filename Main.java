/*
* Author: Patricia Reyes
*/
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Main {

  public static void main(String Args[]){
    String namefile;
    int[] numbers;
    int[] results;
    int elements = 0;
    int total = 0;
    int test = 0;
    int cases = 0;
    
    // GET INPUT FROM A FILE
    //if (Args.length > 1 ) namefile = Args[0];
    //else namefile = "System.in";
    
    // Read from Standard in
    //try{
      BufferedReader in = new BufferedReader( new InputStreamReader(System.in) );
      String s;
      String[] tok;
            
      // Read number of cases
      try{
        if( (s = in.readLine()) != null ){
          tok = s.split("\\b\\s");
          cases = Integer.parseInt(tok[0].trim());
        }
      }
      catch(IOException e){
        e.printStackTrace();
      }
      
      results = new int[cases];
      
      // Test cases
      for (int i = 0; i < cases; i++){
        
        // Get total of elements
        try{
          if( (s = in.readLine()) != null ){
            tok = s.split("\\b\\s");
            elements = Integer.parseInt(tok[0].trim());
            
            if (elements > 0) total = 1;
            else total = 0;
          }
        }
        catch(IOException e){
          e.printStackTrace();
        }
        
        // Get elements
        try{
          if( (s = in.readLine()) != null ){
            tok = s.split("\\b\\s");
            numbers = new int[elements];
            for (int j = 0; j < elements; j++){
              numbers[j] = (new Integer(tok[j].trim())).intValue();
            }
            
            // Count groups
            test = numbers[0];
            for (int j = 1; j < elements; j++){
              if ( test > numbers[j] ){
                total++;
              }
            }
            // Print total of groups in this case.
            results[i] = total;
          }
        }
        catch(IOException e){
          e.printStackTrace();
        }
      }
      for (int i = 0; i < cases; i++){
        System.out.println(results[i]);
      }
    //}  
    //catch(FileNotFoundException fnfe){
    //  System.out.println(fnfe.getMessage());
    //}
  }
}