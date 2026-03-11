class CoffeeMaker implements Runnable {
    private String menu;
    private CoffeeMachine machine;

    public CoffeeMaker(String menu, CoffeeMachine machine) { 
        this.menu = menu;
        this.machine = machine;
    }

    @Override
    public void run() {
        machine.brew(menu);
    }
}
