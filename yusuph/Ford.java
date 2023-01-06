public class Ford extends Car{
    private int year;
    private int manufacturerDiscout;
    


    public Ford(int speed, double regular,String color,int year, int manufacturerDiscout){
        super(speed, regular, color);
        this.year = year;
        this.manufacturerDiscout = manufacturerDiscout;
       
    }

    public void  setyear(int year){
        this.year = year;
    }

    public int getyear(){
        return year;
    }

    public void setmanufacturerDiscount(int manufacturerDiscout){
        this.manufacturerDiscout = manufacturerDiscout;
    }

    public int getmanufacturerDiscout(){
        return manufacturerDiscout;
    }


    public double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscout;
    }
}