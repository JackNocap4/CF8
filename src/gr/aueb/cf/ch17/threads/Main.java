package gr.aueb.cf.ch17.threads;

public class Main {

    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        Thread thread = new Thread(workerThread);
        thread.start();     // όχι blocikng call - είναι ασύγχρονο, δηλαδή παράλληλα thread.

        System.out.println("Hello from MainList!!");
    }
}
