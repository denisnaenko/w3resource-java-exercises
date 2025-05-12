public class Solution implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        new Thread(new Solution()).start();
    }
}
