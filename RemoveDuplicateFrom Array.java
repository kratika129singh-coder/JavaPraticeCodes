class Solution 
{
    public int removeDuplicates(int[] nums)
     {    if(nums.length==0)
          {
            return 0;
           }
       int end=0;
       for(int start=0;start<nums.length;start++)
       {
         if(nums[start]!=nums[end])
         {
          end++;
          nums[end]=nums[start];Added
         }
       
       }
          return end+1;
        
    }
}