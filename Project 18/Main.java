public class Main {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = '9';
        ch2 = 'V';

        boolean b1, b2;
        b1 = Character.isDigit(ch1);
        b2 = Character.isDigit(ch2);

        String str1 = ch1 + " is a digit is " + b1;
        String str2 = ch2 + " is a digit is " + b2;
        System.out.println(str1);
        System.out.println(str2);
    }
}