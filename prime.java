/**
 * prime
 */
public class prime {

    void prime_no(int a) {
        int flag = -1;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
}

/**
 * Innerprime
 */
class Innerprime {
    public static void main(String[] args) {
        prime ob = new prime();
        int arr[] = { 31, 45, 17, 39, 7 };
        for (int i = 0; i < 5; i++) {
            ob.prime_no(arr[i]);
        }
    }

}