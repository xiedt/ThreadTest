package createType002;

/**
 * 线程类只是实现了Runable接口，还可以继承其他的类。
 * 可以多个线程共享同一个目标对象，所以非常适合多个相同线程来处理同一份资源的情况。
 */
public class ThreadCreate02 {
    public static void main(String[] args) {
        Runnable runnable = new MyThread02();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("执行主线程");
    }
}
class MyThread02 implements Runnable{

    @Override
    public void run() {
        System.out.println("执行子线程");
    }
}
/**
 * Runnable可以实现资源共享但Thread不能原因：
 *
 * 因为一个线程只能启动一次，通过Thread实现线程时，线程和线程所要执行的任务是捆绑在一起的。
 * 也就使得一个任务只能启动一个线程，不同的线程执行的任务是不相同的，所以没有必要，也不能让两个线程共享彼此任务中的资源。
 *
 * 一个任务可以启动多个线程，通过Runnable方式实现的线程，实际是开辟一个线程，将任务传递进去，
 * 由此线程执行。可以实例化多个 Thread对象，将同一任务传递进去，也就是一个任务可以启动多个线程来执行它。
 * 这些线程执行的是同一个任务，所以他们的资源是共享。
 */
