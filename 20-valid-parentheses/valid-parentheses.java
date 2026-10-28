import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == '(' || temp == '[' || temp == '{') {
                st.push(temp);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if (s.charAt(i) == ')' && top != '(') {
                    return false;
                }

                if (s.charAt(i) == ']' && top != '[') {
                    return false;
                }

                if (s.charAt(i) == '}' && top != '{') {
                    return false;
                }
            }
        }

        if (st.size() == 0) {
            return true;
        }

        return false;
    }
}