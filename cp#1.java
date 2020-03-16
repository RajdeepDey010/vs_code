import java.util.*;
import java.lang.*;
class thanos_sort 
{
    
    
    static void bubble_sort(int arr[]) {
        int l = arr.length;
        int temp;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int count(int arr[],int j,int l)
    {
        int i,c=1,max=0;
        for(i=j;i<l;i++)
        {
            if(arr[i]<arr[i+1])
            {
                c++;
            }
            else{
                if(max<c)
                {
                    max=c;
                }
                c=0;
            }
        }
        return max;
    }

    /*int snapp(int arr[],int f,int l)
    {
        if(sortt(arr,l))
        {
            return count(arr,f,l);
        }
        else
        {
            int i=(count(arr,0,l/2)>count(arr,l/2,l)?0:l);
            if(i==0)
                return snapp(arr,0,l/2);
            else
                return snapp(arr,l/2,l);
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        thanos_sort ob = new thanos_sort();
        int num, c = 0, i,l;
        char ch;
        String no = "";//String inp;
        num = sc.nextInt();
        String inp= sc.nextLine();
        //System.out.println("Next input");
        inp=inp + " ";
        l=inp.length();
        //inp = inp.trim();
        
        int ar[] = new int[num];
        for (i = 0; i < l; i++) {
            ch = inp.charAt(i);
            if (ch != ' ') {
                no += ch;
            } else {
                int aa = Integer.parseInt(no);
                ar[c] = aa;c++;
                no = "";
            }
        }
        ob.bubble_sort(ar);
        for(i=0;i<num;i++)
        {
            System.out.print(ar[i]+"||");
        }
    }
}