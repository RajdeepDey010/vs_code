class array_sub_seq {
    public static void main(String[] args) {
        int ar[] = { 50, 3, 10, 7, 40, 80 };
        int c, j = 0, max = 1;
        String s = "";
        for (int i = 0; i < ar.length; i++) {
            c = 1;
            j = i;
            for (int k = i + 1; k <= ar.length - 1; k++) {

                if (ar[j] < ar[k]) {
                    j = k;
                    c++;

                }
            }
            if (c >= max) {
                max = c;
            }
            s = s + Integer.toString(c) + " ";
        }
        System.out.println(s);
        System.out.println(max);
    }
}