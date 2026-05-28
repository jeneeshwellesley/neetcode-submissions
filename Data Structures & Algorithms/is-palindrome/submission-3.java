class Solution {
    public boolean isPalindrome(String s) {
        int fp = 0;
        int sp = s.length() - 1;

        while(fp < sp){
            if(!Character.isLetterOrDigit(s.charAt(fp))){
                while(!Character.isLetterOrDigit(s.charAt(fp)) && fp < sp){
                    fp++;
                }
            }
            else if(!Character.isLetterOrDigit(s.charAt(sp))){
                while(!Character.isLetterOrDigit(s.charAt(sp)) && fp < sp){
                    sp--;
                }
            }

            else if(Character.toLowerCase(s.charAt(fp)) != Character.toLowerCase(s.charAt(sp))){
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
