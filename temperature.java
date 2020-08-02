public class temperature {
    public static void main(String[] arguments) {
        double F = 55;
        double C = (F - 32) * (5.0/9); // be careful not to do 5/9 because they are both ints so it truncates to 0; must use a double
        System.out.println(C);

    }
}