class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];

        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (j == 0 || i == m - 1) {
                    sb.append('.');
                } else {
                    sb.append('#');
                }
            }

            arr[i] = sb.toString();
        }

        return arr;
    }
}
