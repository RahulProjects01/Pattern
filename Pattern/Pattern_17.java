
// 0000
// 1111
// 0000
// 1111

// Program:- 

public class Pattern_17 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 && j <= 4 || i == 3 && j <= 4) {
                    System.out.print(0);
                } else if (i == 2 && j <= 4 || i == 4 && j <= 4) {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}