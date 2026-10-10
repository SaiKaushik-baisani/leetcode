class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;

        for (int k = 0; k < t.length(); k++) {
            if (i < s.length() && s.charAt(i) == t.charAt(k)) {
                i++;
            }
        }

        return i == s.length();
    }
}