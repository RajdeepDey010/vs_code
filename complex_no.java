class Complex_Nos {
    private int real;
    private int im;

    Complex_Nos(int r, int i) {
        real = r;
        im = i;
    }

    int getreal() {
        return real;
    }

    int getim() {
        return im;
    }

    void setreal(int r) {
        real = r;
    }

    void setim(int i) {
        im = i;
    }
}

class complex_calc {
    static Complex_Nos add(Complex_Nos a, Complex_Nos b) {
        Complex_Nos c = new Complex_Nos(0, 0);
        c.setreal(a.getreal() + b.getreal());
        c.setim(a.getim() + b.getim());
        return c;
    }

    static Complex_Nos sub(Complex_Nos a, Complex_Nos b) {
        Complex_Nos c = new Complex_Nos(0, 0);
        c.setreal(a.getreal() - b.getreal());
        c.setim(a.getim() - b.getim());
        return c;
    }

    static Complex_Nos multi(Complex_Nos a, Complex_Nos b) {
        Complex_Nos c = new Complex_Nos(0, 0);
        c.setreal((a.getreal() * b.getreal() - (a.getim() * b.getim())));
        c.setim((a.getreal() * b.getim()) + (a.getim() * b.getreal()));
        return c;
    }

    static void display(Complex_Nos a) {
        System.out.println("Real: " + a.getreal());
        System.out.println("Imaginary: " + a.getim());
        System.out.println("=========== =========== ============");
    }
}

class complex_main {
    public static void main(String[] args) {
        Complex_Nos a = new Complex_Nos(5, 10);
        Complex_Nos b = new Complex_Nos(-5, -8);
        Complex_Nos c = new Complex_Nos(0, 0);
        // complex_calc ob = new complex_calc();
        c = complex_calc.add(a, b);
        System.out.println("Adding...");
        complex_calc.display(c);
        c = complex_calc.sub(a, b);
        System.out.println("Subtracting...");
        complex_calc.display(c);
        c = complex_calc.multi(a, b);
        System.out.println("Multiplying...");
        complex_calc.display(c);
    }
}