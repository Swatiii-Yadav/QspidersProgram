package stringPrograms;

public class UniqueSubString {
   static void findLongestSubstring(String str) {
        int len = 0;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <=str.length()-1; j++) {
                String s = str.substring(i, j);
                if (isUnique(s)) {
                    if (s.length() > len) {
                        res = s;
                        len = s.length();
                    }
                }
            }
        }
        System.out.println(res);
    }

   static boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcd";
        findLongestSubstring(str);
    }
}
