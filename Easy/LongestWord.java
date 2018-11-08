import java.util.*;
import java.io.*;

/*
- Creates two strings, one to hold the longest word and one to hold the current word
- Loops through the string until it finds a character which is either a letter or a number
  - Adds the current character to the current-string
  - Checks if the current character is the last character in the string,
    or if the nexts character is neither a letter nor a number,
    this means we have reached the end of the current word
    - if the current word is longer than the longest word, then sets the longest word to be the current word
  - resets the current word to be empty again
*/

class LongestWord {
  public static String LongestWord(String sen) {
    String longest = "";
    String current = "";

    for(int i = 0; i<= sen.length()-1; i++){
        if((Character.isLetter(sen.charAt(i))) || (Character.isDigit(sen.charAt(i)))){
            current = current+sen.charAt(i);
            if( (i == (sen.length()-1)) || ( (Character.isLetter(sen.charAt(i+1)) == false) && (Character.isDigit(sen.charAt(i+1)) == false) )){
                if(current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
    }
    sen = longest;
    return sen;

  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord("Hello World"));
  }

}
