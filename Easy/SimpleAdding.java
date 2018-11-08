import java.util.*; 
import java.io.*;

/*
Simply loops through from 0 up to num
*/

class SimpleAdding {  
  public static int SimpleAdding(int num) { 
  
    int sum = 0;
    for(int i = 0; i<=num; i++){
        sum=sum+i;
    }
    num = sum;
    return num;    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(s.nextLine())); 
  }   
  
}
