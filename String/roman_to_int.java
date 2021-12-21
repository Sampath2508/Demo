class Solution{
    public static void romanToInt(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if (letter == 'I'){
                sum += 1;
            }else if (letter == 'V'){
                sum += 5;
            }else if(letter == 'X'){
                sum += 10;
            }else if (letter == 'L'){
                sum += 50;
            }else if(letter == 'C'){
                sum += 100;
            }else if (letter == 'D'){
                sum += 500;
            }else if(letter == 'M'){
                sum += 1000;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] arg){
        romanToInt("LVIII");
        romanToInt("MDII");
        romanToInt("IIII");
    }   
}

