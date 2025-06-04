class Palindrome{
    static boolean isPalindrome(String S,int start,int end){
        if(start>=end){
            return true;
        }
        if(S.charAt(start)!=S.charAt(end)){
            return false;
        }
        return isPalindrome(S,start+1,end-1);
    }
    public static void main(String[]args){
        String S="madam";
        if(isPalindrome(S,0,S.length()-1)){
            System.out.println(S+" is Palindrome");
        }else{
            System.out.println(S+"is not Palindrome");
        }
    }
}