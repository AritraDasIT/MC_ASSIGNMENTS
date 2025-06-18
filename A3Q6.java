/* Write a JAVA program that creates a base class called "Distance". It stores the distance
between two points in a double value variable and contains a virtual function called
travelTime) that outputs the time it takes to travel that distance, assuming that the distance is
in miles and the speed is 60 miles per hour. In a derived class called DistMKS", oveide
travelTime) so that it outputs the travel time assuming that the distance is in kilometers and
the speed is 100 kilometers per hour. Note: Use base class object to call a function   */


class Distance{
    double distance;
    
    Distance(double distance)
    {
        this.distance=distance;
    }
    
    void timeravel()
    {
        double time = distance/60.0 ;
        System.out.println("Travel time = " +time + "hours");
    }
}

class DistMKS extends Distance
{
    DistMKS(double distance)
    {
        super(distance);
    }
    
    void timeravel()
    {
        double time=distance/100.0;
        System.out.println("Travel time = " +time + "hours");
    }
}

public class Main
{
    public static void main(String args[])
    {
        Distance D1 = new Distance(120);
        DistMKS D2 =new DistMKS(140);
        
        D1.timeravel();
    }
    
    
    
    
    
    
}
