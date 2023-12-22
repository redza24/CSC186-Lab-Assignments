public class WesternFood extends Food {
    //data members
    private int foodSet;
    private boolean dessert;

    //method members
    //default constructors
    public WesternFood(){
        super();
        foodSet = 0;
        dessert = false;
    }

    //normal constructor
    public WesternFood(String name, int quantityOfOrder, boolean member, int foodSet, boolean dessert){
        super();
        this.foodSet = foodSet;
        this.dessert = dessert;
    }

    //setter
    public void setFoodSet(int foodSet){
        this.foodSet = foodSet;
    }
    public void setDessert(boolean dessert){
        this.dessert = dessert;
    }

    //getter
    public int getFoodSet(){
        return foodSet;
    }
    public boolean getDessert(){
        return dessert;
    }

    //processor
    public double Payment(){
        double price;

        if (foodSet == 1){
            price = 30.00;
        }
        else if (foodSet == 2){
            price = 20.00;
        }
        else if (foodSet == 3){
            price = 15.00;
        }
        else{
            price = 0.00;
        }

        double totalPrice = price * getQuantityOfOrder();

        if(dessert)
            totalPrice = totalPrice + 10.90 * getQuantityOfOrder();

        if(getMember())
            totalPrice = totalPrice * 0.9;

        return totalPrice;
    }

    //printer
    public String toString(){
        return super.toString() + "\nFood Set: " + foodSet + "\nDessert: " + dessert + "\n";
    }
}