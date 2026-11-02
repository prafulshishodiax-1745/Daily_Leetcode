class Solution {
    public String reverseVowels(String s) {
        // 1. MUST convert to char array to use [] notation and modify characters
        char[] arr = s.toCharArray(); 
        
        int left = 0;
        int right = arr.length - 1; // Use array length
        
        // 2. Change to '<' to safely prevent infinite loops
        while (left < right) { 
            // Check if left pointer points to a vowel
            if (arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u' ||
                arr[left] == 'A' || arr[left] == 'E' || arr[left] == 'I' || arr[left] == 'O' || arr[left] == 'U') {
                
                // Check if right pointer points to a vowel
                if (arr[right] == 'a' || arr[right] == 'e' || arr[right] == 'i' || arr[right] == 'o' || arr[right] == 'u' ||
                    arr[right] == 'A' || arr[right] == 'E' || arr[right] == 'I' || arr[right] == 'O' || arr[right] == 'U') {
                    
                    // Correct swap using your temp variable logic
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    
                    right--;
                    left++;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        
        // 3. Convert the character array back into a Java String
        return new String(arr); 
    }
}
