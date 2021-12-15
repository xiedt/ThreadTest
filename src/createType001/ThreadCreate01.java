package createType001;

/**
 * 创建线程的第一种方式，继承Thread类，重写run方法
 *
 */
public class ThreadCreate01 {

        //main函数是一个主线程
        public static void main(String[] args) throws InterruptedException {
            MyThread01 myThread01 = new MyThread01();
            myThread01.start();
            //Thread.sleep(1000);
            System.out.println("执行主线程");
        }
    }

    class MyThread01 extends Thread{
        @Override
        public void run(){
            System.out.println("执行子线程");
        }
    }