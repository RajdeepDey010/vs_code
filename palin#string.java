import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st;
        int l,i=0,j,f=1;
        char ch1,ch2;
        System.out.println("Enter the word");
        st=sc.nextLine();
        l=st.length();
        j=l-1;
        while(i<=j)
        {
            ch1=st.charAt(i);
            ch2=st.charAt(j);
            if(ch1!=ch2)
            {
                f=-1;
                break;
            }
            i++;
            j--;
        }
        if(f==-1)
            System.out.println("Not palindrome");
        else
            System.out.println("Palindrome");
    }

}
