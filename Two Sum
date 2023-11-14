import java.util.Hashtable;


class Solution {
    public int [] twoSum(int[] nums, int target) {
        
        int indexh=0;
        int index=0;
        int indexOne=0;
        int indexTwo=0;
        int index1=0;
        int index2=0;
            
            

            int end=nums.length;
            // int doce=end*(end-1);
            int sum=0;
            String temp="";
            int [] tempArr=new int[end-1];
            int sumation=0;
            for(int i=1;i<end;i++){
                    tempArr[index++]=i;
                    
                   }


            for(int i=0;i<tempArr.length;i++){
                
                    sumation+=tempArr[i];
                    

                
                    
            }
            // System.out.println("sum"+sumation);
            // String clues="";
            int clues=0;
            int clues2=0;
            int [] sumArray=new int[sumation];

            
            
            // System.out.println(end);
            for(int i=0;i<end-1;i++){

            

                for(int j=i+1;j<=end-1;j++){
                // if(i>2){j++}
                    if(sum==target){
                        
                
                    break;
                    }
                
                sum=nums[0+i]+nums[j];
                // System.out.println(sum);
                 clues=nums[0+i]; 
                 clues2=nums[j];
                
                sumArray[indexh++]=sum;
               
               
                }
                
                }
            
            
            System.out.println(clues);
            System.out.println(clues2);

            if(clues!=clues2){
           for (int h = 0; h < nums.length; h++) {
                if (nums[h] == clues) {
                     indexOne=h;
                    //  System.out.println(indexOne);
                     break;
                     
            }
           
            }
            for (int b = 0; b < nums.length; b++) {
                if (nums[b] == clues2) {
                     indexTwo=b;
                    //  System.out.println(indexTwo);
                     break;
                     
            }
           
            }
            }else if(clues==clues2){
                for (int c = 0; c < nums.length; c++) {
                if (nums[c] == clues) {
                     index1=c;
                     nums[c]=0;   //Zamiana pierwszej liczby na 0
                    //  System.out.println("Activity");
                    //  System.out.println(Arrays.toString(nums));
                     
                     
            }else if (nums[c] == clues) {
            //    nums[c]=clues;
                index2=c;
                
                break;
            }

           
            }

            }

            
            // System.out.println(indexTwo);
            
            if(clues==clues2){
                indexOne=index1;
                indexTwo=index2;
            }
            int[] wynik={indexOne, indexTwo};

            // for (int value : sumArray) {
            // System.out.println(value);
            // }
    return wynik;
    }
}
