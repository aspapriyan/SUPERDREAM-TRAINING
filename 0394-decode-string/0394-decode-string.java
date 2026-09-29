import java.util.*;

class Solution {
    public String decodeString(String s) {
            Stack<Integer> countStack = new Stack<>();
                    Stack<String> stringStack = new Stack<>();

                            int num = 0;
                                    String current = "";

                                            for (char ch : s.toCharArray()) {

                                                        if (Character.isDigit(ch)) {
                                                                        num = num * 10 + (ch - '0');
                                                                                    }

                                                                                                else if (ch == '[') {
                                                                                                                countStack.push(num);
                                                                                                                                stringStack.push(current);

                                                                                                                                                num = 0;
                                                                                                                                                                current = "";
                                                                                                                                                                            }

                                                                                                                                                                                        else if (ch == ']') {
                                                                                                                                                                                                        int count = countStack.pop();
                                                                                                                                                                                                                        String previous = stringStack.pop();

                                                                                                                                                                                                                                        String temp = "";

                                                                                                                                                                                                                                                        for (int i = 0; i < count; i++) {
                                                                                                                                                                                                                                                                            temp += current;
                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                            current = previous + temp;
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                    else {
                                                                                                                                                                                                                                                                                                                                                    current += ch;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                                return current;
                                                                                                                                                                                                                                                                                                                                                                                    }

}
                                                                                                                                                                                                                                                                                                                                                                               