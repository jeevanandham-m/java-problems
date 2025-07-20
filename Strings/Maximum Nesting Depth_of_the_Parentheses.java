import java.util.*;

public class Maximum Nesting Depth_of_the_Parentheses {
    public int maxDepth(String s) {
        int cnt = 0, max = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                cnt++;
                max = Math.max(max, cnt);

            } else if (ch == ')') {
                cnt--;
            }
        }

        return max;
    }

}
