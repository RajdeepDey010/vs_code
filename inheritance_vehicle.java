class vehicle {
    protected int lic_no, spd;
    protected String col, own_nam;

    void showdata() {
        System.out.println("This is vehicle class");
        System.out.println("Licence: " + lic_no);
        System.out.println("Speed: " + spd);
        System.out.println("Color: " + col);
        System.out.println("Owners_name: " + own_nam);
    }
}

class Bus extends vehicle {
    private int rut_no;

    Bus(int l, int s, String c, String own, int rt) {
        super.lic_no = l;
        super.spd = s;
        super.col = c;
        super.own_nam = own;
        rut_no = rt;
    }

    protected void showdata() {
        super.showdata();
        System.out.println("Route No.: " + rut_no);
    }
}

class Carr extends vehicle {
    private String manf_nam;

    Carr(int l, int s, String c, String own, String m) {
        super.lic_no = l;
        super.spd = s;
        super.col = c;
        super.own_nam = own;
        manf_nam = m;
    }

    protected void showdata() {
        super.showdata();
        System.out.println("Manufactures Name: " + manf_nam);
    }
}

class Customer {
    public static void main(String[] args) {
        Bus ob = new Bus(12001, 40, "blue", "Ramji", 101);
        Carr obj = new Carr(1231, 60, "Red", "Vishnu", "Daryx");
        ob.showdata();
        obj.showdata();
    }
}