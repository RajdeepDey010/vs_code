import java.util.Scanner;

class sum {
    int num(int n) {
        int d, s = 0;
        if(n<1000){
        while (n > 0) {
            d = n % 10;
            s = s + d;
            n = n / 10;
        }
        return s;
    }
    else{
        System.out.println("Error");
        return s;
    }
        //System.out.println(s);

    }

    public static void main(String args[]) {
        sum ob = new sum();
        int a;
        // a = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a = sc.nextInt();
        System.out.println("Sum: "+ob.num(a));
        sc.close();
    }
}