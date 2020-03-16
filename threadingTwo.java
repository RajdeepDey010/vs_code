class myclass implements Runnable
{
    Thread t;
    myclass(String n)
    {
        t=new Thread(this,n);
        t.start();
    }
    public void run(){
        //Thread a=new Thread();
        try {
            for(int i=0;i<10;i++)   
        {
            System.out.println(i+" "+t.getName());
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
        myclass obj=new myclass("Second thread");
    }
}