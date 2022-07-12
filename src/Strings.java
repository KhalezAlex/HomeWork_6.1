public class Strings {

    public static String genString(int maxLength) {
        int length = (int) (Math.random() * (maxLength - 1)) + 1;
        StringBuilder str = new StringBuilder();
        String strPattern = "abcdefghijklmnopqrstuvwxyz";
        str.append(strPattern.charAt((int) (Math.random() * strPattern.length())));
        for (int i = 1; i < length; i++) {
            if (Math.random() < 0.15 && str.charAt(i - 1) != ' ')
                str.append(' ');
            else
                str.append(strPattern.charAt((int) (Math.random() * strPattern.length())));
        }
        return str.toString();
    }

    private static boolean isAlphabet(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (Character.toLowerCase(word1.charAt(i)) != Character.toLowerCase(word2.charAt(i))) {
                return (Character.toLowerCase(word1.charAt(i)) < Character.toLowerCase(word2.charAt(i)));
            }
        }
        return (word1.length() < word2.length());
    }

    public static void revSort(String[] strArray) {
        String temp;
        for (int i = strArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (isAlphabet(strArray[j], strArray[j + 1])) {
                    temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }
    }

    public static void amountWordSort(String[] strArray) {
        String temp;
        for (int i = strArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (strArray[j].split(" ").length > strArray[j + 1].split(" ").length) {
                    temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }
    }

    public static void print(String[] strArray) {
        for (String s : strArray) {
            System.out.print(s + ' ');
        }
    }
}