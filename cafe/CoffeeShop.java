public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        
        String[] menus = {"Espresso", "Latte", "Mocha", "Americano", "Cappuccino", 
                          "Macchiato", "Flat White", "Affogato", "Matcha", "Cocoa"};
        
        for (int i = 0; i < menus.length; i++) {
            Thread t = new Thread(new CoffeeMaker(menus[i], machine), "Thread-" + (i+1));
            
            t.start(); 
 
        }

        System.out.println("End main"); [cite: 60]
    }
}