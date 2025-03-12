public class Assignment6 {
    
    public static long sum(int k, int n) {
        long sum = 0;
        for (int j = 1; j <= n; j++) {
            long term = 1;
            for (int i = 0; i < k; i++) {
                term *= j;
            }
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) {
        long s1 = sum(1, 100);
        System.out.println("s1 = " + s1);
        long s2 = sum(2, 100);
        System.out.println("s2 = " + s2);
        long s3 = sum(3, 100);
        System.out.println("s3 = " + s3);
        long s4 = sum(7, 234);
        System.out.println("s4 = " + s4);
    }
}
