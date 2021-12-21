class Solution{
    public static String cipherCoder(String str, int k){
    	String encoder = "";
        for (int l = 0; l < str.length(); l++){
            char letter = str.charAt(l);
            int ascii;
            if (Character.isUpperCase(letter)){
				ascii = (((((int) letter ) + k) - 65) % 26) + 65;
            }else{
				ascii = (((((int) letter ) + k) - 97) % 26) + 97;
            }
            encoder = encoder + ((char) ascii);
        }
        return encoder;
    }
    public static void main(String[] arg){
        System.out.println(cipherCoder("ABCXYZ", 2));
        System.out.println(cipherCoder("abcxyz", 1));
    }
}
