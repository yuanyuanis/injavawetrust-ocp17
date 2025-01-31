package chapter13.writingthreadsafecode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTwice {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        if (lock.tryLock()) {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        }

        new Thread(() -> System.out.print(lock.tryLock())).start(); // false
    }
}
