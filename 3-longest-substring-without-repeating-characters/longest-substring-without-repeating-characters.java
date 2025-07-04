class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max_len=0;
        Set<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max_len=Math.max(max_len,set.size());
        }
        return max_len;
    }
}