class Solution {
    public boolean isPalindrome(String s) {
        int fp = 0;
        int sp = s.length()-1;

        while(fp < sp){
            while(!Character.isLetterOrDigit(s.charAt(fp)) && fp < sp){
                fp++;
            }
            while(!Character.isLetterOrDigit(s.charAt(sp)) && fp < sp){
                sp--;
            }
            if(Character.toUpperCase(s.charAt(fp)) != Character.toUpperCase(s.charAt(sp))){
                    return false;
                }
            else{
                fp++;
                sp--;
            }
        }
        return true;
    }
}
