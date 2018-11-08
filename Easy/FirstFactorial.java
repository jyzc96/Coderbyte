import java.util.*; 
import java.io.*;

/*
Loops through all the numbers from num to 0 and multiples them
*/

class FirstFactorial {  
  public static int FirstFactorial(int num) { 
  
    int result = num;
    for(int i = (num-1); i > 0; i--){
        result = result * i;
    }
    num = result;
    return num;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }   
  
}
