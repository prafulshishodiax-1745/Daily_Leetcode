class Solution {
    public boolean canAliceWin(int n) {
        int arr[] = {10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1};
        int i;
        for( i = 0; i < 10 ; i++)
        {
           n = n - arr[i];
           if(n < 0)
           break;
        }
        if(i % 2 == 0)
        return false;
        else return true;
    }
}
