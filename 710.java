import java.util.*;

class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    Random rand = new Random();
    int len;

    public Solution(int n, int[] blacklist) {
        len = n - blacklist.length;

        Set<Integer> set = new HashSet<>();

        for (int num : blacklist) {
            set.add(num);
        }

        int last = len;

        for (int num : blacklist) {
            if (num < len) {
                while (set.contains(last)) {
                    last++;
                }

                map.put(num, last);
                last++;
            }
        }
    }

    public int pick() {
        int num = rand.nextInt(len);
        return map.getOrDefault(num, num);
    }
}


// MY SOLUTION ------>>
  
 class Solution {
    int arr[];
    List<Integer> li = new ArrayList<>();
    int len;
    int m = 0;
    public Solution(int n, int[] blacklist) {
        for(int num: blacklist)
        {
            li.add(num);
        } 
        int idx = 0;
        int l = blacklist.length;
        len = n - l;
        arr = new int[len];
        for(int i = 0 ; i < n; i++)
        {
            if(!li.contains(i))
            arr[idx++] = i;
        }
        
    }
    
    public int pick() {
        if(m == len)
        m = 0;
        return arr[m++];
        
    }
}
 
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */
