class fibo {
    void fibon(int a, int b, int c) {

        if (c > 0) {
            int k = a;
            a = a + b;
            b = k;
            c--;
            System.out.print(a + " ");
            fibon(a, b, c);

        }
    }

    public static void main(String[] args) {
        fibo ob = new fibo();
        System.out.print("0 ");
        ob.fibon(0, 1, 8);
    }
}
