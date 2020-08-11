package com.personal.erdc.trash;

import java.util.ArrayList;
class StringHandling {
  public static String longestAlpabeticalSubstring(String text) {
      // Your code here
      ArrayList<String> al = new ArrayList<>();
      int longestSoFar = 0;
      StringBuilder tempSb = new StringBuilder();
      tempSb.append(text.charAt(0));
      System.out.println("tempSB should be first element " + tempSb );
      for(int i = 1; i<text.length(); i++){
        System.out.println(text.charAt(i-1) < text.charAt(i));
        
        
        
        System.out.println("length of sb is  " + tempSb.length() + " whose contents are: " + tempSb);
        System.out.println();
        System.out.println();
        System.out.println("Longest length so far is: " + longestSoFar);
          if(text.charAt(i-1) <= text.charAt(i)){
            tempSb.append(text.charAt(i));
            System.out.println("temporary sb so far   " + tempSb.toString());
            if(i == text.length()-1) {//if its last char meeting requirements, we need to append it
                if(tempSb.length() > longestSoFar){
                    System.out.println("Longest is being updated to '" + tempSb.toString() +  "' substring ");
                    longestSoFar = tempSb.length();
                    System.out.println("longest so far should be new..." + longestSoFar);
                    al.add(tempSb.toString());

                  }
                  tempSb.delete(0, tempSb.length());
                  tempSb.append(text.charAt(i));//started buffer over at this new character
            }
          }
          else{
            //alphabetical order not achieved, store this substring
            System.out.println("value of i was greater than i-1");
            System.out.println("length of sb is  " + tempSb.length() + " whose contents are: " + tempSb);
            System.out.println();
            System.out.println();
            System.out.println("Longest length so far is: " + longestSoFar);
            if(tempSb.length() > longestSoFar){
              System.out.println("Longest is being updated to '" + tempSb.toString() +  "' substring ");
              longestSoFar = tempSb.length();
              System.out.println("longest so far should be new..." + longestSoFar);
              al.add(tempSb.toString());

            }
            tempSb.delete(0, tempSb.length());
            tempSb.append(text.charAt(i));//started buffer over at this new character

          }

        
      }
    
//     for(String ele: al){
//       System.out.println("each ele in al: " + ele);
//     }
      System.out.println("alsize-1 should be last element added" + (al.size()-1));
      return al.get(al.size()-1);
  }
}