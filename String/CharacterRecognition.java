package String;



public class CharacterRecognition {
    public static void main(String[]args){
        String s = "Hello World 123@#";
        int vowel =0;
        int consonant =0;
        int digit=0;
        int specialChar =0;
        int space=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            c=Character.toLowerCase(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel++;
            }
            else if(c>='a' && c <= 'z'){
                consonant++;
            }
            else if(c == '@' || c =='#' || c=='$' || c=='%' || c=='*' || c=='&'){
                specialChar++;
            }
            else if (c >=0 && c<=9) {
                digit++;
            }
            else if(c == ' ' ){
                space++;
            }


            }
            System.out.println(vowel + "\n" + consonant + "\n" + digit + "\n" + specialChar + "\n" + space );
        
    }
    
}


