class Main {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        String evenOdd = (a%2==0) ? "Number is Even" : "Number is Odd";
        System.out.println(evenOdd);
    }
}