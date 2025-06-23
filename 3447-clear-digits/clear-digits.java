class Solution {
    public String clearDigits(String s) 
    {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(!Character.isDigit(ch))
            {
                st.push(ch);
            }
            else
            {
                st.pop();
            }
        }
        if(st.isEmpty())
        {
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st)
        {
            sb.append(c);
        }
        return sb.toString();
    }

}