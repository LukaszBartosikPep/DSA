import java.util.ArrayList; 
import java.util.Arrays; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int indexLengthList=0;
        int test=0;
        int firstLength=0;
        int secondLength=0;
        int l=0;
        int p=0;


        // System.out.println(s);

        String[] strSplit=s.split("");
        ArrayList<String> strList=new ArrayList<String>(
            Arrays.asList(strSplit)
        );
        
        List<String> lengthList=new ArrayList<>();
    

        for(int i=0; i<strList.size();i++){
            
            lengthList.add(strList.get(i));
            if(lengthList.contains(strList.get(i+1))){
                
            firstLength=lengthList.size();
            // lengthList.clear();
            l=lengthList.size();
            break;
            
            }
        }

        for(int x=3;x<strList.size();x++){    ///Should be 5
            lengthList.clear();
            lengthList.add(strList.get(x));  ///Should start from 3 to 8

             if(lengthList.contains(strList.get(x+1))){    
                
            secondLength=lengthList.size();
            // lengthList.clear();
            p=lengthList.size();
            break;
            
            }
            


        }






    //    for (String value : lengthList) {
    //         System.out.println(value);
    //         }
       System.out.println(firstLength);
       System.out.println(secondLength);
        return test;
        
    }
}
