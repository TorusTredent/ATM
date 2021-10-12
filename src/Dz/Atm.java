package Dz;

public class Atm {
    public static void main(String[] args) {
        Purse purse = new Purse(1, 1129);

        Dz.Thread1 thread1 = new Dz.Thread1(purse, 1000);
        Dz.Thread2 thread2 = new Dz.Thread2(purse, 30);
        thread1.start();
        thread2.start();
    }
}
