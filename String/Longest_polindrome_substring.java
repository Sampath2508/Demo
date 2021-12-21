
class Solution{

    public static String getSubstring(String str,int low,int high){
        while(low >=0 && high < str.length()){
            if (str.charAt(low) != str.charAt(high)) break;
            low -= 1;
            high += 1;
        }
        return str.substring(low + 1, high);
    }

    public static String longestPolindromeSubstring(String str){
        String result = ""; 
        int len = str.length();

        for(int i = 1; i < len - 1; i++){
            String temp = getSubstring(str, i - 1, i + 1);
            String temp2 = getSubstring(str, i, i + 1);
            
            temp = (temp.length() < temp2.length())? temp2 : temp;
            result = (result.length() < temp.length())? temp : result;
        }

        return result;
    }
    public static void main(String[] arg){
        System.out.println(longestPolindromeSubstring("forgeeksskeegfor"));
    }   
}

