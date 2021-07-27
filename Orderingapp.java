import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orderingapp {

    static List<Dish> dishlist = new ArrayList<>();


    public static void main(String[] args){
        // need have food first!
        // Dish dish = new Dish(1, "Sandwich", 29.0);
        // Dish dish2 = new Dish(2, "French Fries", 10.0);
        initDish(); 
        // We will have 5 dishs in our res
        
        // System.out.println(dishlist);
        // Create a Scanner
        Scanner s = new Scanner(System.in);
        // System.out.println("Please input The Id");
        // // Get the content
        // int num = s.nextInt();
        // System.out.println(num);
        //Show the dish menu
        // showMenu();
        // int num = s.nextInt();

        while (true){
            showMenu();
            int num = s.nextInt();
            switch (num){
                case 1:
                    showDishMenu();
                    break;
                case 2:
                    showPersonDish();
                    break;
                case 3:
                    buy();
                    return;
            }

        }

    }

    public static void showDishMenu(){
        System.out.println("--Please Ordering Food");
        for (int i = 0; i < dishlist.size(); i++){
            Dish dish = dishlist.get(i);
            System.out.println(dish.id + "\t" + dish.name + "\t" + dish.price);
        }
        System.out.println("---Choose Id to order food && Input 0 go back to main menu---");
        
        
    }

    public static void showPersonDish(){

    }

    public static void buy(){

    }

    
    public static void showMenu(){
        System.out.println("---Menu---");
        System.out.println("Menu\t\t\t 1");
        System.out.println("Ordered\t\t\t 2");
        System.out.println("Pay\t\t\t 3");
        System.out.println("Please Input Number to Choose");
    }


    public static void initDish(){
        Dish dish = new Dish(1, "Sandwich", 29.0);
        dishlist.add(dish);
        Dish dish2 = new Dish(2, "French Fries", 10.0);
        dishlist.add(dish2);

        dishlist.add(new Dish(3, "Caesar Salad", 12.0));
        dishlist.add(new Dish(4, "Salisbury Steak", 100.0));
        dishlist.add(new Dish(5, "Carpaccio", 30.0));
    }   

}
