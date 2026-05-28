class Solution {
    public boolean isPalindrome(String s) {
        int fp = 0;
        int sp = s.length()-1;

        while(fp < sp){
            while((fp < sp) && (!Character.isLetterOrDigit(s.charAt(fp)))){
                fp++;
            }
            while((sp > fp) && (!Character.isLetterOrDigit(s.charAt(sp)))){
                sp--;
            }

            if(Character.toLowerCase(s.charAt(fp)) != Character.toLowerCase(s.charAt(sp))){
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
