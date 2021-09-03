import java.io.*;
import java.util.*;
import java.util.Stack;

class Preprocessor {

    public static boolean bal_chck(String Str) {
        Stack<Character> st1 = new Stack<Character>();
        for (int k = 0; k < Str.length(); k++) {
            char q = Str.charAt(k);
            if (q == '[' || q == '{' || q == '(' || q == '/') {
                switch (q) {
// Checking for square brackets
                    case '[':
                        st1.push(q);
                        break;
// Checking for curly brackets
                    case '{':
                        st1.push(q);
                        break;
// Checking for brackets
                    case '(':
                        st1.push(q);
                        ;
                        break;
//For other commands
                    case '/':
                        char t = Str.charAt(k + 1);
                        if (t == '*') {
                            st1.push(q);
                        }
                        break;
                    default:
                        break;
                }
            } else if (q == ']' || q == '}' || q == ')' || q == '*') {
                if (st1.empty()) {
                    return false;
                }
                switch (q) {
// For checking square brackets
                    case ']':
                        if (st1.pop() != '[') {
                            return false;
                        }
                        break;
// For checking curly brackets
                    case '}':
                        if (st1.pop() != '{') {
                            return false;
                        }
                        break;
// For brackets
                    case ')':
                        if (st1.pop() != '(') {
                            return false;
                        }
                        break;
// For commands
                    case '*':
                        if (Str.charAt(k + 1) == '/') {
                            if (st1.pop() != '/') {
                                return false;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        if (st1.empty()) {
            return true;
        }
        return false;
    }
}