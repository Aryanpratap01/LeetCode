import java.io.*;
import java.util.*;

class Solution {

    public boolean isTopValid(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!sc.isEmpty() && isTopValid(sc.peek(), s.charAt(i))) {
                sc.pop();
            } else {
                sc.push(s.charAt(i));
            }
        }

        return sc.isEmpty();
    }
}
