import java.util.concurrent.atomic.AtomicInteger;

class CoffeeMachine {
    private AtomicInteger cupCount = new AtomicInteger(0);

    public synchronized void brew(String menu) {
        
        System.out.println(Thread.currentThread().getName() + " กำลังใช้เครื่องชง: " + menu); 
        try {
            
            Thread.sleep((long)(Math.random() * 3000)); [cite: 58]
        } catch (InterruptedException e) {}
        
        System.out.println(Thread.currentThread().getName() + " เครื่องดื่มเสร็จ: " + menu + " (รวม " + cupCount.incrementAndGet() + " แก้ว)");
    }
}
