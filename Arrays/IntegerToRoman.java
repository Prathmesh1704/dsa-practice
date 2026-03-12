/*12 */

/*Apprroach 1 */

class IntegerToRoman {

    public String intToRoman(int num) {

        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String rom[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                        "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                sb.append(rom[i]);
                num = num - values[i];
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {

       IntegerToRoman obj = new IntegerToRoman();

        int number = 1994;

        String roman = obj.intToRoman(number);

        System.out.println("Integer: " + number);
        System.out.println("Roman: " + roman);
    }
}


/* Approach 2

class Solution {
    public String intToRoman(int nums) {
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
String[] thousands = {"","M","MM","MMM"};

return thousands[nums/1000]+hundreds[(nums%1000)/100]+tens[(nums%100)/10]+ones[nums%10];


        
    }
}


*/