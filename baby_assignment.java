import java.util.Scanner;

class polio_drops {
    String nam;// name of baby
    String dob;// date of birth
    String pd;// polio drop

    polio_drops(String d_o_b, String name) {
        int l = d_o_b.length();
        dob = d_o_b;
        nam = name;
        pd = "";
        int dd = 0, f = 0, mm = 0, yy = 0;
        for (int i = 0; i < l; i++) {
            char ch = d_o_b.charAt(i);
            if (ch != ' ') {
                pd = pd + ch;
            } else {
                f++;
                if (f == 1) {
                    dd = Integer.parseInt(pd);
                } else {
                    mm = Integer.parseInt(pd);
                }
                pd = "";
            }
        }
        yy = Integer.parseInt(pd);
        pd = "";

        int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (yy % 4 == 0) {
            days[2] = 29;
        }
        int c = 45;
        /**
         * System.out.println(dd); System.out.println(mm); System.out.println(yy);
         */
        while (dd <= days[mm] && c >= 0) {
            dd++;
            c--;

            if (mm == 12 && c > 0 && dd > days[mm]) {
                yy++;
                mm = 1;
                dd = 1;
                c--;

            } else if (dd > days[mm]) {
                // System.out.println(dd);
                mm++;
                dd = 1;
                // System.out.println(dd);
                c--;

            }
            // while (dd <= days[mm] && c != 0) { dd++; c--; }

        }
        pd = Integer.toString(dd) + '/' + Integer.toString(mm) + '/' + Integer.toString(yy);
        // System.out.println("Date: " + dd + ' ' + mm + ' ' + yy);
    }

    void display() {
        System.out.println("Name: " + nam);
        System.out.println("The polio drop must be given on date: " + pd);
    }

    public static void main(String args[]) {
        String dob;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of birth");
        dob = sc.nextLine();
        polio_drops baby_drop = new polio_drops(dob, "name");
        baby_drop.display();
        sc.close();
    }
}