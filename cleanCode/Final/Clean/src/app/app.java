package app;
import java.util.Scanner;
public class app{

    public static void main(String[] a){
        Scanner in=new Scanner(System.in);
        double Priciple,rate,time;
        System.out.println("Simple interest\nEnter Priciple,rate and time");
        Priciple=in.nextDouble();
        rate=in.nextDouble();
        time=in.nextDouble();
        Interest si=new Interest();
        System.out.print("Simple Amount=");
        System.out.println(si.simpleInterest(Priciple,rate,time));
        double timesInAYear;
        System.out.println("Compound interest\nEnter Priciple,Interest times in a year,rate and time");
        Priciple=in.nextDouble();
        timesInAYear=in.nextDouble();
        rate=in.nextDouble();
        time=in.nextDouble();        
        System.out.print("Compound Amount=");
        System.out.println(si.complexInterest(Priciple,rate,timesInAYear,time));
        double area;int standard;
        System.out.println("House Construction Cost\nEnter Area of the House,Standard");
        System.out.println("0) standard material");
        System.out.println("1) Above standard material");
        System.out.println("2) High standard material with Fully automated House");
        HouseConstructionCost Hcost=new HouseConstructionCost();
        area=in.nextDouble();
        standard=in.nextInt();
        System.out.print("Cost of House=");
        System.out.println(Hcost.getHouseCost(area,standard));
        in.close();
    }



}