class arrangement {
    void permutate(int a[]) {
        int l = a.length;
        int arng[];
        arng = new int[l - 1];
        if (l != 0) {
            for (int i = 0; i < l; i++) {
                int b = 0;
                for (int j = 0; j < l; j++) {
                    if (j != i) {
                        arng[b] = a[j];
                        b++;
                    }
                }
                permutate(arng);

            }
        } else {
            for (int i = 0; i < l; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30 };
        arrangement ob = new arrangement();
        ob.permutate(arr);
    }
}