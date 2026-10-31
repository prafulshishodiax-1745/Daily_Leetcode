import java.util.*;

class Solution {
    public String frequencySort(String s) {
        
        int[] freq = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        } // Storing the frequency

        // PriorityQueue storing HashMaps (Max-Heap based on frequency)
        PriorityQueue<Map<Character , Integer>> pq = new PriorityQueue<>((map1, map2) -> {
            // Extract values and keys from the maps to compare
            var entry1 = map1.entrySet().iterator().next();
            var entry2 = map2.entrySet().iterator().next();
            
            int val1 = entry1.getValue();
            int val2 = entry2.getValue();
            
            if (val2 != val1) {
                return Integer.compare(val2, val1); // Descending order of frequency (Max-Heap)
            }
            return Character.compare(entry2.getKey(), entry1.getKey()); // Secondary sort by character
        });

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                char ch = (char) i;
                
                // Create a different/separate HashMap for this character
                Map<Character, Integer> charMap = new HashMap<>();
                charMap.put(ch, freq[i]);
                
                // Store the HashMap in the Priority Queue
                pq.offer(charMap);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map<Character, Integer> curr = pq.remove();
            
            // Extract the character and its frequency from the map
            Map.Entry<Character, Integer> entry = curr.entrySet().iterator().next();
            char ch = entry.getKey();
            int count = entry.getValue();
            
            // Append the character 'count' times to the result string
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
