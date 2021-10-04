package ro.siit.session29;

public class MyCountingRunnable implements Runnable{

    private int limit;
    private int step;

    public MyCountingRunnable(int limit, int step){
        this.limit = limit;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i = i+ step) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread toTen = new Thread(new MyCountingRunnable(100, 2));
        Thread toTwenty = new Thread(new MyCountingRunnable(100, 5));

        toTen.setPriority(10);
        toTen.setDaemon(true);

        toTen.start();
        toTwenty.start();

//        toTen.join(1000);
//        toTwenty.join(1200);

//        toTen.join();
//        toTwenty.join();

        System.out.println("main: over!");
    }
}
