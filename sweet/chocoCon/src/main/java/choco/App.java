package choco;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
class Sweets{
    int size;
    int weight;
    String name;    
    int sweetDensity;

    boolean chocolate;
    Sweets(String name,int size,int weight,int sweetDensity,boolean chocolate){
        this.name=name;
        this.weight=weight;
        this.size=size;
        this.sweetDensity=sweetDensity;
        this.chocolate=chocolate;
        }
    void disp(final int pos){
        System.out.println(name+"\t"+sweetDensity+"\t"+weight+"\t"+size+"\t"+pos);
    }    
}
/*
*For Sorting the Sweets
*/

class Sortbyweight implements Comparator<Sweets> 
{ public int compare(final Sweets a, final Sweets b){return a.weight - b.weight;} } 

class Sortbysize implements Comparator<Sweets> 
{ public int compare(final Sweets a, final Sweets b){return a.size - b.size;} } 

class Sortbysweetdensity implements Comparator<Sweets> 
{ public int compare(final Sweets a, final Sweets b){return a.sweetDensity - b.sweetDensity;} } 

class SortbyChocolate implements Comparator<Sweets> 
{ public int compare(final Sweets a, final Sweets b)
    {   final int ac=(a.chocolate)?1:0;
        final int bc=(b.chocolate)?1:0;
        return ac-bc;} 
} 
class SortbySweets implements Comparator<Sweets> 
{ public int compare(final Sweets a, final Sweets b)
    {   final int ac=(a.chocolate)?0:1;
        final int bc=(b.chocolate)?0:1;
        return ac-bc;} 
}

public class App 
{
    public static void main( final String[] args )
    {
        int totalweight=0;
        final List <Sweets> sweets=new ArrayList<Sweets>(5);
        final Scanner inp=new Scanner(System.in);
        boolean moreSweets=true;
        int size;
        int weight;
        String name;    
        int sweetDensity;
        boolean chocolate;
        while(moreSweets){
            System.out.println("Sweet ");
            System.out.print("Name :");
            name=inp.next();
            System.out.print("Weight :");
            weight=inp.nextInt();
            totalweight+=weight;
            System.out.print("Size :");
            size=inp.nextInt();
            System.out.print("Sweetness [out of 10]:");
            sweetDensity=inp.nextInt();
            System.out.print("is it chocolate [true/false]:");
            chocolate=inp.nextBoolean();
            sweets.add(new Sweets(name,size,weight,sweetDensity,chocolate));
            System.out.print("More Sweets [true/false]:");
            moreSweets=inp.nextBoolean();        
        }
        System.out.println("Total Gifts Weights"+totalweight);
        System.out.println("Sort by");
        int type=1;boolean validinput=true;
        String preferedType=new String("randomness");
        while(validinput){
            System.out.println("1[weight]\n2[size]\n3[Sweetness]\n4[Chocolate First]\n5[Sweets First]");
            type=inp.nextInt();
            if(type==1)
            {Collections.sort(sweets,new Sortbyweight());validinput=false;
                preferedType=new String("Weight");
            }
            else if(type==2)
            {Collections.sort(sweets,new Sortbysize());validinput=false;
                preferedType=new String("Size");
            }
            else if(type==3)//SortbyChocolate
            {Collections.sort(sweets,new Sortbysweetdensity());validinput=false;
                preferedType=new String("Sweetness");
        } else if(type==4)
        {Collections.sort(sweets,new SortbyChocolate());validinput=false;
            preferedType=new String("Gifts with Chocolate First");
        }else if(type==5)
        {Collections.sort(sweets,new SortbySweets());validinput=false;
            preferedType=new String("Gifts with Sweets First");
        }
            else{
            System.out.println("Only enter valid [1/2/3/4/5]");       
            System.out.println("Sort by");
            }
        }
        validinput=true;
        while(validinput){
            System.out.println("Want to Find Some Sweet");
            System.out.println("1 [First elements]");
            System.out.println("2 [By name]");
            System.out.println("3 [List All]");
            System.out.println("4 [Range in "+preferedType+"]");
            int pref=0;
            pref=inp.nextInt();
            switch(pref){
                case 1:
                        validinput=false;
                        int range;
                        System.out.println("How many Gifts to show");
                        range=inp.nextInt();
                        for(int i=0;i<sweets.size();++i){
                        sweets.get(i).disp(i+1);
                        --range;
                        if(range<=0)
                        break;    
                        }
                        break;
                case 2:
                        validinput=!validinput;
                        String preferedSweet;
                        System.out.println("Want to Find Some Sweet");
                        preferedSweet=inp.next();
                        for(int i=0;i<sweets.size();++i)
                        if(sweets.get(i).name.equals(preferedSweet))
                        System.out.println(preferedSweet+" is at position "+(i+1));
                    break;
                case 3:
                        validinput=!validinput;
                        System.out.println("Name Sweetness Weight Size position");                
                        for(int i=0;i<sweets.size();++i)
                        sweets.get(i).disp(i+1);
                break;
                case 4:        
                        validinput=!validinput;
                        System.out.println("Range ");
                        int lrange=1,urange=1;
                        System.out.println("Lower range:");
                        lrange=inp.nextInt();
                        System.out.println("Upper range:");
                        urange=inp.nextInt();
                        if(type==1){
                            for(final Sweets s:sweets){
                                if(s.weight>=lrange && s.weight<=urange)  System.out.println(s.name+ ":"+s.weight);
                                if(s.weight>urange)
                                break;}}
                        else if(type==2){            
                            for(final Sweets s:sweets){
                                if(s.size>=lrange && s.size<=urange)System.out.println(s.name+ ":"+s.size);
                                if(s.size>urange)
                                break; }}
                        else if(type==3){            
                            for(final Sweets s:sweets){
                                if(s.sweetDensity>=lrange && s.sweetDensity<=urange)System.out.println(s.name+ ":"+s.sweetDensity);
                                if(s.sweetDensity>urange)
                                break; }}  
                        else  {
                            range=10;                         
                            for(int i=0;i<sweets.size();++i){
                            sweets.get(i).disp(i+1);
                            --range;
                            if(range<=0)
                            break;    
                            }  
                    }    
                    break;
                default:
                        System.out.println("Invalid");
            }
        }   inp.close();
    }
}