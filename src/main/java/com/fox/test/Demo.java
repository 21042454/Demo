package com.fox.test;

public class Demo {


    public  void  demo(){
        System.out.println("");
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread t = new Thread(test,"窗口1");
        Thread t1 = new Thread(test,"窗口2");
        Thread t2 = new Thread(test,"窗口3");

        t.start();
        t1.start();
        t2.start();
    }

}

class  Test implements  Runnable{

    private  int a = 100;


    public synchronized void run() {


    }
}
