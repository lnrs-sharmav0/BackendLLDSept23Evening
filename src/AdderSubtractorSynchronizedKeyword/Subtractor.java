package AdderSubtractorSynchronizedKeyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    Subtractor(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }

    public Void call (){
//        lock.lock();
        for(int i = 1;i <=50000; i++){
//            lock.lock();
            synchronized (v){
//                System.out.println("Subtracting " + i);
                this.v.value -= i;
            }

//            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
