public class Car{
    private int speed;
    private double regularPrice;
    private String color;
   
    
    public Car(int speed, double regularPrice,String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        
        }

    public void setspeed(int speed){
        this.speed = speed;
    }

    public int getspeed(){
        return speed;
    }

    public void setregularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public double getregular(){
         return regularPrice;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }


    public double getSalePrice(){
        return regularPrice;
    }

    
}