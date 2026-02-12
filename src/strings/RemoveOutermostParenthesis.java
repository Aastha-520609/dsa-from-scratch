package strings;

public class RemoveOutermostParenthesis {
	public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(depth > 0){
                    result.append(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth > 0){
                    result.append(ch);
                }
            }
        }

        return result.toString();
        
    }
	
	public static void main(String args[]) {
		
		// Example 1
        String s1 = "(()())(())";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + removeOuterParentheses(s1));
        System.out.println();

        // Example 2
        String s2 = "(()())(())(()(()))";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + removeOuterParentheses(s2));
        System.out.println();

        // Example 3
        String s3 = "()()";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + removeOuterParentheses(s3));
		
	}

}
