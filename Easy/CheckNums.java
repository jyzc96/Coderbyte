import java.util.*; 
import java.io.*;

/*
Pretty self-explanatory
*/

class CheckNums {  
  public static String CheckNums(int num1, int num2) { 
    
    String answer = "";
    if(num2 > num1){
        answer = "true";
    } else if(num1 == num2){
        answer = "-1";
    } else {
        answer = "false";
    }       
    return answer;    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CheckNums(s.nextLine())); 
  }   
  
}
