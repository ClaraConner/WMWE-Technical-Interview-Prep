import java.util.*;

public class ReverseString {
    
    static void reverseString(String input){
        //creating a stack of characters
        Stack<Character> stack = new Stack<Character>();

        //adding the string to the stack character by character
        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        //printing the stack as we pop from the top
        for(int i = 0; i < input.length(); i++){
            System.out.print(stack.pop());
        }
    }

    public static void main(String []args)
    {
        String input = "Clara is so cool";
        reverseString(input);
    }
}
