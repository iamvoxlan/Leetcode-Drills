class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n+1];
        int max = n;
        int min = 0;
        for (int i=0; i<n; i++){
            if (s.charAt(i) == 'I') {
                perm[i] = min;
                min++;
            } else {
                perm[i] = max;
                max--;
            } 
        }
        perm[n] = min;
        return perm;
    }
}