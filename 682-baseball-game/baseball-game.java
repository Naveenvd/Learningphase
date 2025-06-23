class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<String> st=new Stack<>();
        for(String s:operations)
        {
           if(s.equals("C"))
           {
              st.pop();
           }
           else if(s.equals("D"))
           {
            int val=Integer.parseInt(st.peek());
            // st.pop();
            st.push(Integer.toString(val*2));
           }
           else if(s.equals("+") && !st.isEmpty())
           {
            int val1=Integer.parseInt(st.peek());
            
            if(!st.isEmpty())
            {
                String ele=st.peek();
                st.pop();
                int val2=Integer.parseInt(st.peek());
                st.push(ele);
                st.push(Integer.toString(val1+val2));
            }
           
            else
            {
                st.push(s);
            }
            
            
           }
           else
           {
            st.push(s);
           }

        }
        System.out.print(st);
        int sum=0;
        for(String str:st)
        {
            sum+=Integer.parseInt(str);
        }
        return sum;
        
    }
}