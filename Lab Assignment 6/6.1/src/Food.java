public class Food{
    //Data members
    private String name;
    private int quantityOfOrder;
    private boolean member;

    //method members
    //default constructor
    public Food(){
        name = "";
        quantityOfOrder = 0;
        member = false;

    }

    //copy constructor
    public Food(Food f){
        name = f.name;
        quantityOfOrder = f.quantityOfOrder;
        member = f.member;
    }

    //normal constructor
    public Food(String name, int quantity, boolean member){
        this.name = name;
        this.quantityOfOrder = quantity;
        this.member = member;
    }

    //getter
    public String getName(){
        return name;
    }

    public double getQuantityOfOrder(){
        return quantityOfOrder;
    }

    public boolean getMember(){
        return member;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    
    public void setQuantity(int quantity){
        this.quantityOfOrder = quantity;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    //printer
    public String toString(){
        return "Name: " + name + "\nQuantity: " + quantityOfOrder + "\nMember: " + member;
    }
}