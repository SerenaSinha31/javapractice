public class binomialcof {
    public static int fact_n(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int bincoffcient(int r, int n) {
        int factn = fact_n(n);
        int factr = fact_n(r);
        int factminusr = fact_n(n - r);

        // Calculate binomial coefficient using integer division
        int bincoffcient = factn / (factr * factminusr);
        return bincoffcient;
    }

    public static void main(String[] args) {
        System.out.println(bincoffcient(5, 2));
    }
}
