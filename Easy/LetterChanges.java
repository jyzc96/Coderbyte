import java.util.*; 
import java.io.*;

/*
Loops through the string.
- Answer-strign which stores the resulting answer
- IF the current character is a letter
  - when the character matches with the alphabet-string, the next letter in the alphabet is added to the answer-string
  - takes into account if the current letter is the last in the laphabet
- ELSE adds whatever the input string contains to the answer-string and breaks from the current loop
*/

class Main {  
  public static String LetterChanges(String str) { 
    str = str.toLowerCase();
    String alphabet = "AbcdEfghIjklmnOpqrstUvwxyz";
    String answer = "";

    for (int i = 0; i<=str.length()-1; i++){
        for (int j=0; j<=alphabet.length()-1; j++){
          if(Character.isLetter(str.charAt(i))){

            if(str.charAt(i) == Character.toLowerCase(alphabet.charAt(j))){
                if(j == alphabet.length()){
                    answer = answer + alphabet.charAt(0);
                } else {
                    answer = answer + alphabet.charAt(j+1);
                }
            }

          }else{
            answer += str.charAt(i);
            break;
          }
        }
    }
    str = answer;
    return str;
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
