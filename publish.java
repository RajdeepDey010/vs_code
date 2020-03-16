import java.util.Scanner;
//import java.util.Scanner;
abstract class publications {
    String title;
    int price;

    abstract void getdata();

    abstract void putdata();
}

class book extends publications {
    protected int pg_c;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        title = sc.nextLine();
        price = sc.nextInt();
        pg_c = sc.nextInt();
        //sc.close();
    }

    void putdata() {
        System.out.println("Title: " + title);
    }
}
class tape extends publications
{
    float ply_tim;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the playing time");
        ply_tim=sc.nextFloat();
        sc.close();
    }
    void putdata() {
        System.out.println("Playing time: " + ply_tim + " min");
    }
    
}
class me {
    public static void main(String[] args) {
        publications p;
        p=new book();
        p.getdata();
        p.putdata();
        p=new tape();
        p.getdata();
        p.putdata();
    }
}