
// 2 4 6 8 10 
// 12 14 16 18 20
// 22 24 26 28 30
// 32 34 36 38 40
// 42 44 46 48 50

// Program:- 

public class Pattern_9 {
    public static void main(String[] args) {
        int n=1;
        for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j<= 5; j++) {
                System.out.print(n*2+" ");
                n++;
            }
            System.out.println();
        }
    }
}
