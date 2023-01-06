public class Sedan extends Car{
    private int length;
    
    public Sedan(int speed, double regularPrice, String color, int length, double getSalePrice){
        super(speed, regularPrice, color);
        this.length = length;
       
    }

    public void setlength(int length){
        this.length = length;
    }

    public int getlength(){
        return length;
    }


    public double getSalePrice(){
            double discount = 0;
            if (length > 2000){
                discount = 0.05*super.getregular();
            }else{
               discount = 0.1*super.getregular();
            }
        return super.getregular() - discount;
    }


   
}