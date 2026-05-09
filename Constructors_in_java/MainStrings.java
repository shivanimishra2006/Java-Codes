package Constructors_in_java;

class StrDemo {
    String str1;
    String str2;

    StrDemo(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    void countvowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels are:" + count);
    }

    void countchar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println("Number of upperCase letters are:" + count);
    }
}

class MainStrings {
    public static void main(String XYZ[]) {
        StrDemo sd1 = new StrDemo("Hello", "Java Programming");
        String s = sd1.str1 + sd1.str2;

        sd1.countvowel(s);
        sd1.countchar(s);
    }
}