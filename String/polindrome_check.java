
class Solution{
    public static boolean polindromeCheck(String str){
        int len = str.length() - 1;
        int ind = 0;
        while(ind < len - ind){
        	if(str.charAt(ind) != str.charAt(len - ind)) return false;
            ind += 1;
        }
        return true;
    }
    public static void main(String[] arg){
        System.out.println(polindromeCheck("tenet"));
        System.out.println(polindromeCheck("testing"));
    }   
}

