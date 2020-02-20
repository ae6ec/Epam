package app;

public class HouseConstructionCost{
    double getHouseCost(double area,int standard){
        double priceForStandard=0;
        switch (standard) {
            case 0:priceForStandard=1200; break;
            case 1:priceForStandard=1500; break;
            case 2:priceForStandard=2500; break;
        }
        return area*priceForStandard;
    }
}