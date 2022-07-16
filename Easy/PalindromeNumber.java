class Solution {
    public boolean isPalindrome(int x) {
        //create a string made up of the numbers in integer x
        String temp = Integer.toString(x);
         
        for(int i=0; i< temp.length();i++){
            if(temp.charAt(i)  != temp.charAt(temp.length()-1-i))
                return false;
        }
        return true;
    }
}
