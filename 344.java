class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char temp;
        int m = n - 1;
        for(int i = 0; i < (n/2); i++)
        {
            temp = s[i];
            s[i]  = s[m];
            s[m] = temp;
            m--;
        }
        
    }
}
