package chapter13.writingthreadsafecode;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockTimeUnit {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
        if(lock.tryLock(10, TimeUnit.SECONDS)) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }
}
