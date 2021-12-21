class Solution {
    public static void main(String[] arg){
        String str = "this is just a testing";
        String str2 = "example program";
        
        // To get a Char from the String 
        System.out.println(str.charAt(0));

        // To compare two string, return either 0 if it is equal or 1 if it is not equal.
        System.out.println(str.compareTo(str2));

        // To add two Strings
        System.out.println(str.concat(str2));

        // return true if sequence of character in string otherwise return false
        System.out.println(str.contains("this"));

        // return index value
        System.out.println(str.indexOf("just"));

        // return string length
        System.out.println(str.length());

        // convert string into char array
        System.out.println(str.toCharArray());

        // split string into string array
        System.out.println(str.split(" "));

        // Checks whether a string starts with specified characters
        System.out.println(str2.startsWith("exp"));

        // it removes whitespace from both end
        System.out.println("    sam    ".trim());

        // return a string which is the substring of a specified string
        System.out.println(str.substring(2, 6));

        // convert the string into lowercase
        System.out.println(str.toLowerCase());

        // convert the string into uppercase
        System.out.println(str.toUpperCase());
    }
}