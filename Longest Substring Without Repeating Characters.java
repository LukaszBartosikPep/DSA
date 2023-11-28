import java.util.ArrayList; 
import java.util.Arrays; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
         for(int i=0; i<strList.size()-1;i++){
            
            lengthList.add(strList.get(i));
            if(lengthList.contains(strList.get(i+1))){
            
            firstLength=lengthList.size();
            ListOfLengths.add(firstLength);
            // l=lengthList.size();
            lengthList.clear();
            // break;
             }
            }
        Collections.sort(ListOfLengths);

       for (int value : ListOfLengths) {
            System.out.println(value);
            result=value;

            }

        return test;
        
    }
}
