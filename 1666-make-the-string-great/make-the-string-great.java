class Solution {
    public String makeGood(String s) 
    {
        Stack<Character> st=new Stack<>();
       for(char ch:s.toCharArray())
       {
            if(st.isEmpty()) st.push(ch);
            else if(ch == st.peek()) st.push(ch);
           else if(Character.isUpperCase(ch) && ch == Character.toUpperCase(st.peek())
            || Character.isUpperCase(st.peek()) && st.peek() ==Character.toUpperCase(ch))
           {
            st.pop();
           }
           else
           {
            st.push(ch);
           }

       }
       StringBuilder sb=new StringBuilder();
       for(char c:st)
       {
        sb.append(c);
       }
       return sb.toString();
       
    }
}