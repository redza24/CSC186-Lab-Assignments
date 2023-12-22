import java.util.*;

public class FoodApp {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        //step 1: declare array of object
        System.out.println("enter size of array: ");
        int size = scan.nextInt();
        WesternFood[] wf = new WesternFood[size];

        //step 2: create / instantiate array of object
        for(int i = 0; i < size; i++){
            wf[i] = new WesternFood();
        }

        // Food set
        System.out.println();
        System.out.println("Set\tDescription\tPrice");
        System.out.println("1\tLamb Chop\tRM30.00");
        System.out.println("2\tChicken Chop\tRM20.00");
        System.out.println("3\tFish Chop\tRM15.00");

        //step 3: input
        for(int i = 0; i < size; i++){
            System.out.println();
            System.out.println("Enter details for customer " + (i+1));
            System.out.println("Enter name: ");
            String name = scan1.nextLine();
            
            System.out.println("Enter quantity order: ");
            int quantity = scan.nextInt();
            System.out.println("Enter member [true/false]: ");
            boolean member = scan.nextBoolean();
            
            System.out.println("Enter food set [1-3]: ");
            int foodSet = scan.nextInt();
            System.out.println("Enter dessert [true/false]: ");
            boolean dessert = scan.nextBoolean();
            wf[i].setDessert(dessert);
        
            //step 4: store onto array
            //1. normal constructor
            wf[i] = new WesternFood(name, quantity, member, foodSet, dessert);

            //or
            //2.setter
            wf[i].setName(name);
            wf[i].setQuantity(quantity);
            wf[i].setMember(member);
            wf[i].setFoodSet(foodSet);
            wf[i].setDessert(dessert);
        }
        System.out.println();
        //step 5: manipulation
        //q(ii)
        for(int i = 0; i < size; i++){
            System.out.println();
            System.out.println(wf[i].toString() + "Payment: RM" + wf[i].Payment());
        }
        //q(iii)
        int cntDessert = 0;
        for(int i = 0; i < size; i++){
            if(wf[i].getDessert())
                cntDessert++;
        }
        System.out.println();
        System.out.println("Number of customers order dessert: " + cntDessert);
        
        //q(iv)
        double totalPriceMember = 0; //total price for member
        for(int i = 0; i < size; i++) {
            if(wf[i].getMember())
                totalPriceMember = totalPriceMember + wf[i].Payment();
        }
        System.out.println("Total payment for all members: RM" + totalPriceMember);

        //q(v)
        double totalPrice = 0;
        for(int i = 0; i < size; i++){
            totalPrice = totalPrice + wf[i].Payment();
        }
        System.out.println("Total payment for all customers: RM" + totalPrice);

        //q(vi)
        System.out.println();
        System.out.println("Customer who order the Lamb Chop set");
        for(int i = 0; i < size; i++){
            if(wf[i].getFoodSet() == 1){
                System.out.println();                
                System.out.println(wf[i].toString() + "Payment: " + wf[i].Payment());
            }
        }

        scan.close();
        scan1.close();
    }//end main
} //end class