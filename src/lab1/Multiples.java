package lab1;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(multiples(1000,4 ,4 ));

    }

    static int multiples(int n, int a, int b) {
        int mult = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                mult++;
            }
        }
        return mult;
    }
}
