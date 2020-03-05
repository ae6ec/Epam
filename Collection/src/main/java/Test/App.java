package Test;
import java.util.*;
public class App 
{
    static void delf(List<Integer> l)
    {
        l.remove(0);
    }
    static void delsp(List<Integer> l,int i)
    {
        l.remove(i);
    }
    static void dell(List<Integer> l)
    {
        l.remove(l.size()-1);
    }
    static void fetf(List<Integer> l)
    {
        System.out.println(l.get(0));
    }
    static void fetsp(List<Integer> l,int i)
    {
        System.out.println(l.get(i));
    }
    static void fetl(List<Integer> l)
    {
        System.out.println(l.get(l.size()-1));
    }
    public static void main(String args[]) {        
        Scanner sc=new Scanner(System.in);
        List<Integer> l = new ArrayList<Integer>(); 
        for(int i=0;i<10;i++)
        {
            l.add(i+45);
        }
        int ch=23;
        int ch1;
        while(ch!=5)
        {
            System.out.println("Enter Choice:\n1.Fetching\n2.Adding\n3.Removing\n4.Printing\n5.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Choice:\n1.Fetch first place element\n2.Fetch element at specific Index\n3.Fetch Last element");
                    ch1=sc.nextInt();
                    if(ch1==1)
                    {
                        fetf(l);
                    }
                    else if(ch1==2)
                    {
                        System.out.println("Enter Index:");
                        int i=sc.nextInt();
                        fetsp(l,i);
                    }
                    else if(ch1==3)
                    {
                        fetl(l);
                    }
                    else
                        System.out.println("Invalid Choice");
                    break;
                case 2:
                    System.out.println("Enter Choice:\n1.Add at first place\n2.Add at Specific Index\n3.Add in last");
                    ch1=sc.nextInt();
                    if(ch1==1)
                    {
                        System.out.println("Enter Number:");
                        int r=sc.nextInt();
                        addf(l,r);
                    }
                    else if(ch1==2)
                    {
                        System.out.println("Enter Number:");
                        int r=sc.nextInt();
                        System.out.println("Enter Index:");
                        int i=sc.nextInt();
                        addsp(l,r,i); 
                    }
                    else if(ch1==3)
                    {
                        System.out.println("Enter Number:");
                        int r=sc.nextInt();
                        addl(l,r);
                    }
                    else
                        System.out.println("Invalid Choice");
                    break;
                case 3:
                    System.out.println("Enter Choice:\n1.Delete at first place\n2.Delete at Specific Index\n3.Delete in last");
                    ch1=sc.nextInt();
                    if(ch1==1)
                    {
                        delf(l);
                    }
                    else if(ch1==2)
                    {
                        System.out.println("Enter Index:");
                        int i=sc.nextInt();
                        delsp(l,i);
                    }
                    else if(ch1==3)
                    {
                        dell(l);
                    }
                    else
                        System.out.println("Invalid Choice");
                    break;
                case 4:
                    print(l);
                    break;
                case 5:
                    System.out.println("Exiting........");
                    break;
                default:
                    System.out.println("Enter valid choice.");
            }
        }
    }
	static void print(List<Integer> l)
    {
        System.out.println(l); 
    }
    static void addf(List<Integer> l,int r)
    {
        l.add(0,r);
    }
    static void addsp(List<Integer> l,int r,int i)
    {
        l.add(i,r);
    }
    static void addl(List<Integer> l,int r)
    {
        l.add(r);
    }
}
