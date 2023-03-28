class Solution {
    public static void main(String[] args){
        boolean ans = isPalindrome(args[0]);
        System.out.println(ans);
    }
    
    public boolean isPalindrome(int x) {
        String numString = Integer.toString(x);
        return checkNumString(numString);
    }

    public boolean checkNumString(String numString){
        int maxIdx = numString.length() - 1;
        System.out.println(maxIdx);
        boolean isPal = true;
        for(int iCtr = 0; iCtr <= (maxIdx/2); iCtr++){
            char front = numString.charAt(iCtr);
            char back = numString.charAt(maxIdx - iCtr);
            if(front != back){
                isPal = false;
            }
        }
        return isPal;
    }
}
