import java.util.*;
public class FindAllMissing {

    public List<Integer> findDisapperaredNumbers(int[] nums){
        int i=0;
          while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
          }
          // just find missing numbers 

          List<Integer> ans = new ArrayList<>();
          for(int index = 0 ; index < nums.length; index++){
             if ( nums[index] != index+1){
                ans.add(index +1);

             }
          } 

       return ans;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
    
}
  

class Solution {
    public List<Integer> findDisapperaredNumbers(int[] nums){
        int i=0;
        int n = nums.length;
        if (n < 2) return new ArrayList<Integer>(1);
          while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                if(correct<n){
                swap(nums,i,correct);
            } else {
                i++;
            }else{
                i++;
            }
          }
          // just find missing numbers 

          List<Integer> ans = new ArrayList<>();
          for(int index = 0 ; index < nums.length; index++){
             if ( nums[index] != index + 1){
                ans.add(index + 1);

             }
          }
          

       return ans;
    }

      void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
     
    }
}