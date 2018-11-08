import java.util.*; 
import java.io.*;

/*
loops through the string from last letter to first letter
*/

class FirstReverse {  
  public static String FirstReverse(String str) { 
    
    String answer = "";
    for(int i = str.length()-1; i >= 0; i--){
        answer = answer + str.charAt(i);
    }
    str = answer;
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
