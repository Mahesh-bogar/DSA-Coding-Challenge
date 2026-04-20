class ToLowerCase {

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "LOVELY";

        System.out.println(toLowerCase(s1)); // hello
        System.out.println(toLowerCase(s2)); // lovely
    }
}
