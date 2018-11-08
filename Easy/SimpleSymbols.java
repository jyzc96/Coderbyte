import java.util.*; 
import java.io.*;

/*
- IF either the first or the last character is a latter, it will be false
- ELSE loops through the string until it finds a character
  - If the character before and after the current character is a '+', set true
  - If either the character before or after isn't a '+', set false and breaks
*/

class SimpleSymbols {  
  public static String SimpleSymbols(String str) { 
 
    String answer = "";
    if(Character.isLetter(str.charAt(0)) || Character.isLetter(str.charAt(str.length()-1))){
      answer = "false";
    } else {
      for(int i = 0; i<=str.length()-1; i++){
        if(Character.isLetter(str.charAt(i))){
          if((str.charAt(i-1) == '+') && (str.charAt(i+1) == '+')) {
            answer = "true";
          } else {
            answer = "false";
            break;
          }
        }
      }
    }
    str = answer;
    return str;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }   
  
}
