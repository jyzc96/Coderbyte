import java.util.*; 
import java.io.*;

/*
- Answer-string stores the answer
- Starts by capitalizing the first character in the string
- Loops through the string and copies the current character into the answer-string
  - If the current character is a blank space, the space is added to the answer-string,
    also adds the capitalized version of the string after the space,
    i++ jumps over the next character which we already added
*/

class LetterCapitalize {  
  public static String LetterCapitalize(String str) { 
  
    String answer = "";
    answer = answer + Character.toUpperCase(str.charAt(0));
    for(int i = 1; i<=str.length()-1; i++){
        if(str.charAt(i) == ' '){
            answer += str.charAt(i);
            answer = answer+ Character.toUpperCase(str.charAt(i+1));
            i++;
        } else {
            answer += str.charAt(i);
        }
    }
    str = answer;
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}
