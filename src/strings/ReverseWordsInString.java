package strings;

public class ReverseWordsInString {
	public static String reverseWords(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);

            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        // 1️⃣ Normal case
        String input1 = "the sky is blue";
        System.out.println("Input 1:  \"" + input1 + "\"");
        System.out.println("Output 1: \"" + reverseWords(input1) + "\"");
        System.out.println();

        // 2️⃣ Leading and trailing spaces
        String input2 = "  hello world  ";
        System.out.println("Input 2:  \"" + input2 + "\"");
        System.out.println("Output 2: \"" + reverseWords(input2) + "\"");
        System.out.println();

        // 3️⃣ Multiple spaces between words
        String input3 = "a good   example";
        System.out.println("Input 3:  \"" + input3 + "\"");
        System.out.println("Output 3: \"" + reverseWords(input3) + "\"");
    }

}
