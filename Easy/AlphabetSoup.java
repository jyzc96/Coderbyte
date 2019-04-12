import java.util.*;
import java.io.*;

class Main {
  public static String AlphabetSoup(String str) {

    char[] strArray = str.toCharArray();
    for(int i = 0; i < str.length()-1; i++){
      System.out.println("In for 1");

            int min_index = i;
            for (int j = i+1; j < str.length()-1; j++) {
              System.out.println("in for 2");

                if (strArray[j] < strArray[min_index]){
                  System.out.println("in if");
                min_index = j;
                }

            char temp = strArray[min_index];
            strArray[min_index] = strArray[i];
            strArray[i] = temp;
            }
    }
    str = String.valueOf(strArray);
    return str;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine()));
  }

}
