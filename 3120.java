class Solution {
    public int numberOfSpecialChars(String word) {
        int uppercase[] = new int[26];
        int lowercase[] = new int[26];

        for(char ch : word.toCharArray())
        {
            if(ch < 92)
            uppercase[ch - 'A']++;
            else
            lowercase[ch - 'a']++;
        }
        int count = 0;
        for(int i = 0 ; i < 26 ; i++)
        {
            if(uppercase[i] >= 1 && lowercase[i] >= 1)
            count++;
        }
        return count;
    }
}
