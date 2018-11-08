import java.util.*;
import java.io.*;

/*
- If the current number is already below 60, then use it as min
- Else, loop through it until num is below 60
  - saves the remainder of (num/60) in minInt
  - divids nums with 60 such that we get the current number we are working with
  - for each loop, also increase time counting for number og hours
*/

class TimeConvert {
  public static String TimeConvert(int num) {

    String time = "";
    String min = "";
    int minInt = 0;
    String hour = "0";
    int hourInt = 0;

    if(num < 60){
        min = Integer.toString(num);
    } else {
        while(num >= 60){
            minInt = (num % 60);
            num = (num-60);
            hourInt++;
        }
        min = Integer.toString(minInt);
        hour = Integer.toString(hourInt);
    }
    time = hour + ":" + min;
    return time;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine()));
  }

}

//Possibly the worst way to solve this exercise
