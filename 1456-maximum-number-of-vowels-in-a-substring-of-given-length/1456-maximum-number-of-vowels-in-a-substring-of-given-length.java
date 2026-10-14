class Solution {
    public int maxVowels(String s, int k) {
        char a [] = s.toCharArray();
        
        int count = 0;

        for(int i = 0 ; i < k ; i++){
            if(a[i] == 'a' || a[i] =='e' || a[i] == 'i' || a[i] == 'o' || a[i] ==  'u'){
                count++;
            }
        }

        int max = count;

        for(int i = 1 ; i + k  < s.length() + 1 ; i++){
            if(a[i-1] == 'a' || a[i-1] =='e' || a[i-1] == 'i' || a[i-1] == 'o' || a[i-1] ==  'u'){
                count--;
            }
            if(a[i + k - 1] == 'a' || a[i + k - 1] =='e' || a[i + k - 1] == 'i' || a[i + k - 1] == 'o' || a[i + k - 1] ==  'u'){
                count++;
            }

            if(count > max){
                max = count;
            }
        }

        return max;
    }
}