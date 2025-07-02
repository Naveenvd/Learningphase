class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        csum(candidates,0,target,list,ans);
        return ans;
    }
    public static void csum(int[] arr,int ind,int k,ArrayList<Integer> list,List<List<Integer>> ans)
    {
        if(ind>=arr.length || k<0)
        {
            if(k==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return ;
        }
        list.add(arr[ind]);
        csum(arr,ind,k-arr[ind],list,ans);
        list.remove(list.size()-1);
        csum(arr,ind+1,k,list,ans);
       
    }
}