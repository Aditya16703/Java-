 class Solution {
        public static void main (String[] arge){
            int[] arr ={3,0,1};
            int target = missingNumber(arr);
            System.out.println(target);
        }
        static int missingNumber(int[] arr) {
            int i=0;
            while(i<arr.length){
                int correct = arr[i];
                if(arr[i]<arr.length && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
            //search for first misssing number
            for(int index =0;index<arr.length;index++){
                if(arr[index]!=index){
                    return index;
                }
            }
            return arr.length;
    
            
        }
    
        static void swap(int[] arr , int first, int Second){
            if(arr[Second]<arr[first]){
                int temp = arr[first];
                 arr[first]=arr[Second];
                 arr[Second]=temp;
            }
        }
    }
    

