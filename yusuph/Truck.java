public class Truck extends Car{
    private int weight;
    

    public Truck(int speed, double regular,String color, int weight, double getSalePrice){
        super(speed, regular, color);
        this.weight = weight;
       
        }

        public void setweight(int weight){
            this.weight = weight;
        }

        public int getweight(){
            return weight;
        }

        public double getSalePrice(){
            double discount = 0;
            if (weight > 2000){
                discount = 0.1*super.getregular();
            }else{
               discount = 0.2*super.getregular();
            }
        return super.getregular() - discount;
    }
}