import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.printf("%d", lcm(n,m));
    }

    public static int gdc(int n, int m) {
        if(n % m == 0) return m;
        return gdc(m, n%m);
    }

    public static int lcm(int n, int m) {
        return n * m / gdc(n,m);
    }
}