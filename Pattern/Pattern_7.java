
// Q.7 
// ****
// #***
// ##**
// ###*

// Program:- 

public class Pattern_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int k = 2; k <= i; k++) {
                System.out.print("#");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
