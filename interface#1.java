import java.util.Scanner;
interface Department
{
    String depname="IT";
    String dephead="Me";
    abstract void getdata();
    abstract void putdata();
}

class hostel
{
    protected String hostelnam,hostelloc;
    protected int room;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hostel name|| Hostel loc|| No. of rooms");
        hostelnam=sc.nextLine();
        hostelloc=sc.nextLine();
        room=sc.nextInt();
    }
    public void putdata()
    {
        System.out.println("Hostel: "+hostelnam);
        System.out.println("Hostel Location: "+hostelloc);
        System.out.println("No. of rooms: "+room);
    }
}

class student extends hostel implements Department
{
    String nam,elecsub;
    int reg;double avg;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        super.getdata();
        System.out.println("Enter:  Student Name || Elective Subject || Registration No. || Average marks");
        nam=sc.nextLine();
        elecsub=sc.nextLine();
        reg=sc.nextInt();
        avg=sc.nextDouble();sc.close();
    }
    void printdata()
    {
        super.putdata();
        System.out.println("Name: "+nam);
        System.out.println("Subject: "+elecsub);
        System.out.println("Reg. No.: "+reg);
        System.out.println("Average marks: "+avg);
    }
    public static void main(String[] args) {
        student ob=new student();
        ob.getdata();
        ob.printdata();
    }
}

