import java.util.*; 
import java.io.*;

/*
- Saves the number of hours with numer/60
- Saves the number of mins with number modulo 60
- Converts them into strings before adding them together to the time-string
*/

class Main {  
  public static String TimeConvert(int num) {   
  
    String time = "";
    String min = "";
    int minInt = 0;
    String hour = "0";
    int hourInt = 0;
    
    hourInt = (num/60);
    minInt = (num % 60);
    hour = Integer.toString(hourInt);
    min = Integer.toString(minInt);
    time = hour + ":" + min;
    
    return time;    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}
