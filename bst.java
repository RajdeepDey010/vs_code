import java.util.*;
class node
{
    int val;
    node left,right;
}

class list
{
    static node insert_at_root(int a)
    {
        node root=new node();
        root.val=a;
        root.left=null;
        root.right=null;
        return root;
    }

    static node insert(int a,node root)
    {
        if(root==null)
        {
            root=list.insert_at_root(a);
            return root;
        }
        node n=new node();
        n.val=a;
        n.left=null;
        n.right=null;
        node temp=root;
        while(temp!=null)
        {
            if(temp.val>a)
            {
                if(temp.left==null)
                    temp.left=n;
                temp=temp.left;
            }
            else if(temp.val==a)
                break;
            else
            {
                if(temp.right==null)
                    temp.right=n;
                temp=temp.right;
            }
        }
        return root;
    }
    static void inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.val+" ");
            inorder(root.right);
        }
    }

    static void display(node root)
    {
        node temp=root;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.left;
        }
    }

    public static void main(String[] args) {
        node root=null;

        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter values ");
        for(int i=0;i<5;i++)
        {
            a=sc.nextInt();
            root=list.insert(a, root);
        }
        System.out.println("Inorder: ");
        //list.display(root);
        list.inorder(root);
    }
}
