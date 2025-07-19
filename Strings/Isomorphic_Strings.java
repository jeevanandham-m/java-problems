package Strings;

import java.util.HashMap;

public class Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i);
            }

            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), i);
            }

            if (!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}

