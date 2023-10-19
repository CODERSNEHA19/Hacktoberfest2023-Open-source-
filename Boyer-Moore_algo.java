class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {

        int ele1=-1,ele2=-1,c1=0,c2=0,i=0;
        while(i<nums.length)
        {
            if(nums[i]==ele1)
                c1++;
            else if(nums[i]==ele2)
                c2++;
            else if(c1==0)
            {
                ele1=nums[i];
                c1++;
            }
            else if(c2==0)
            {
                ele2=nums[i];
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }

            i++;
        }

        c1=0;
        c2=0;
        List<Integer> l=new ArrayList<Integer>();
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==ele1)
                c1++;
            else if(nums[i]==ele2)
                c2++;
        }

        if(c1>nums.length/3)
            l.add(ele1);
        if(c2>nums.length/3)
            l.add(ele2);

        return l;
        
    }
}
