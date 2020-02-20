package app;
import java.lang.Math;
public class Interest{
    double simpleInterest(double principle,double rate,double time){
        return principle*(1+rate*time);
    }
    double complexInterest(double principle,double rate,double timesInAYear ,double time){
        double t1=1+(rate/timesInAYear),t2=timesInAYear*time;
        return principle*(Math.pow(t1,t2));
    }
}