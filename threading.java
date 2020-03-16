class myclass extends Thread
{
    myclass(String n)
    {
        super(n);
    }
    public void run(){
        //Thread a=new Thread();
        try {
            for(int i=0;i<10;i++)   
        {
            System.out.println(i+" "+this.getName());
            Thread.sleep(1000);
        }
        System.out.println();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}

class driver
{
    public static void main(String[] args)throws Exception
    {
        myclass ob=new myclass("First thread");
        ob.start();
        myclass obj=new myclass("Second thread");
        obj.start();
    }
}