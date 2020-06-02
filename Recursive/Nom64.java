package Recursive;

/**
 * @author tujietg
 * @date 6/2/20 8:02 AM
 */
public class Nom64 {

    public int sumNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNums(n - 1);
    }


}
