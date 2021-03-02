package com.wutl.demo.test;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: vlolatile是一个特殊的的修饰符，只能修饰成员变量，在Java并发程序缺少同步类的情况下，
 * 多线程对成员变量的操作对其他线程是透明的。1、volatilel变量可以保证下一个读取操作会在前一个写操作之后发生
 * 2、禁止指令重排，如创建顺序123，避免132，防止返回空的引用（只有并发的情况下）（1.分配内存，2，实例化，3返回引用。）
 * @date 2021-3-1 17:06
 */
public class Test01 {
//    public volatile int inc = 0;
    public  int inc = 0;
    public void increase() {
        // inc++ = inc = inc+1 实际做了2步操作，第一步是取inc，然后是inc+1，可能会引起同步问题。加了volatile也会
        inc++;
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        final Test01 test = new Test01();
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        test.increase();
                    }
                }

                ;
            }.start();
        }
        while (Thread.activeCount() > 2)  //保证前面的线程都执行完
        {
            Thread.yield();
        }
        long n = System.currentTimeMillis();
        System.out.println(n - l);
    }
}
