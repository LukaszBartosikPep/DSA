import java.util.ArrayList; 
import java.util.Arrays; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
       int result=0;

            String[] strSplit=s.split("");
        ArrayList<String> strList=new ArrayList<String>(
            Arrays.asList(strSplit)
        );
        List<String> lengthList=new ArrayList<>();

        List<Integer> ListOfLenghts=new ArrayList<>();

        for(int i=0; i<strList.size()-1;i++){
            
            lengthList.add(strList.get(i));   //this should be the window
            if(lengthList.contains(strList.get(i+1))){
                int index=lengthList.size();
                lengthList.remove(0);
                
                ListOfLenghts.add(index);
            
        
            
            
           
             }
            }




         Collections.sort(ListOfLenghts);


        for(int value:ListOfLenghts){

            System.out.print(value);
            result=value;
        }

        return result;
        
    }
}
