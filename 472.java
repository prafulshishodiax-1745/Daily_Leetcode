// NOT ALL CASES VERIFIED -->

class Solution {
    Set<String> list;

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> res = new ArrayList<>();

        list = new HashSet<>();

        for (String word : words) {
            list.add(word);
        }
         
         for (String word : words)
         {
            if (isConcat(word)) {
                res.add(word);
            }
        } 

        return res;
    }

    private boolean isConcat(String word) {
        int len = word.length();

        for (int i = 1; i < len; i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (list.contains(prefix) &&
                (list.contains(suffix) || isConcat(suffix))) {
                return true;
            }
        }

        return false;
    }
}
