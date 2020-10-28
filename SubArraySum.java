import java.util.HashMap;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
         int count = 0;
         
         HashMap<Integer, Integer> value_map = new HashMap<Integer,Integer>();
         value_map.put(0,1);
         
         int sum = 0;
         
         int a_length = nums.length;
         
         for(int i=0; i< a_length; i++){
             sum += nums[i];
             
             if(value_map.containsKey(sum-k))
                 count += value_map.get(sum-k);
             value_map.put(sum, value_map.getOrDefault(sum, 0) +1);
         }
         return count;
     }

     public static void main(String[] args) {
         int[] nums =  {1,1,1};
         int k = 2;
         SubArraySum sum = new SubArraySum();

         System.out.println("# of sub arrays that equal to k  " + k + " are : " + sum.subarraySum(nums, k));


         
     }
 }