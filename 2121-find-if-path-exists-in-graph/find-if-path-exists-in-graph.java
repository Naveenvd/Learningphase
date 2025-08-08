class Solution 
{
    public int[] parent;
    public int[] rank;
    public boolean validPath(int n, int[][] edges, int source, int destination)
    {
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
            rank[i]=0;
        }


        for(int[] edge:edges)
        {
            union(edge[0],edge[1]);
        }

        return find(source)==find(destination);
    }
    public int find(int x)
    {
        if(parent[x]!=x)
        {
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }

    public void union(int u,int v)
    {
        int pu=find(u);
        int pv=find(v);

        if(pu==pv)
        {
            return;
        }

        if(rank[pu]<rank[pv])
        {
            parent[pu]=pv;
        }
        else if(rank[pu]>rank[pv])
        {
            parent[pv]=pu;
        }
        else
        {
            parent[pv]=pu;
            rank[pu]++;
        }
    }
}