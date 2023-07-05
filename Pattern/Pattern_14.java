
// 01010
// 10101
// 01010
// 10101

// Program:-

public class Pattern_14 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (n % 2 == 0) {
                    System.out.print(1);
                } else if (n % 2 == 1) {
                    System.out.print(n * 0);
                }
                n++;
            }
            System.out.println();
        }
    }
}

