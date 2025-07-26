class Solution {
    public int findJudge(int n, int[][] trust) 
    {
        int[] arr=new int[n+1];
        for(int[] p:trust)
        {
            int others=p[0];
            int judge=p[1];
            arr[others]--;
            arr[judge]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==n-1)
            {
                return i;
            }
        }
        return -1;
        
    }
}