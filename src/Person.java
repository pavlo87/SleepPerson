public class Person implements AlarmClock {
    public void sleep (int quantity){
        System.out.println(quantity+" min");
    }
    public void sleep (double quantity){
        System.out.println(quantity+" min");
    }
    public void sleep(int quantity, String timeUnit){
        System.out.println(quantity+" hour"+" "+" din-din "+timeUnit);
    }
}
