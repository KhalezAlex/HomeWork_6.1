public class Braces {
    private static boolean isBrace(char ch) {
        String braces = "()[]";
        return (braces.contains(Character.toString(ch)));
    }

    private static String braces(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isBrace(str.charAt(i))) {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        return str;
    }

    private static String delBraces(String str) {
        str = str.replace("()", "");
        str = str.replace("[]","");
        return str;
    }

    private static int index(String str) {
        if (str.charAt(0) == ')') return 1;
        if (str.charAt(0) == ']') return 3;
        if (str.indexOf("(]") < str.indexOf("[)")) return 4;
        else return 2;
    }
    public static String isValid(String str) {
        String[] result =  {"Правильная строка",
                            "Ошибка: отсутствие (",
                            "Ошибка: отсутствие )",
                            "Ошибка: отсутствие [",
                            "Ошибка: отсутствие ]"};
        str = braces(str);
        while (!str.equals(delBraces(str))) {
            str = delBraces(str);
        }
        if (str.isEmpty()) {
            return result[0];
        }
        else {
            return result[index(str)];
        }
    }
}
