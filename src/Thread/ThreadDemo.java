package Thread;

public class ThreadDemo {

    static class Table {
        void printTable(int n) {
            for (int i=1; i<6; i++){
                System.out.println("Thread:"+n*i);
            }
        }
    }

    static class MyThread1 implements Runnable {
        Table table = new Table();
        MyThread1(Table table){
            this.table = table;
        }
        @Override
        public void run() {
            table.printTable(5);
        }
    }

//    static class MyThread1 extends Thread {
//        Table table = new Table();
//        MyThread1(Table table){
//            this.table = table;
//        }
//        @Override
//        public void run() {
//            table.printTable(5);
//        }
//    }
//
//    static class MyThread2 extends Thread {
//        Table table = new Table();
//        MyThread2(Table table){
//            this.table = table;
//        }
//        @Override
//        public void run() {
//            table.printTable(100);
//        }
//    }
//
//
//    static class MyThread3 extends Thread {
//        Table table = new Table();
//        MyThread3(Table table){
//            this.table = table;
//        }
//        @Override
//        public void run() {
//            table.printTable(1);
//        }
//    }

    public static void main(String[] args) {
        Table table = new Table();
//        MyThread1 myThread1 = new MyThread1(table);
//        MyThread2 myThread2 = new MyThread2(table);
//        MyThread3 myThread3 = new MyThread3(table);
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                table.printTable(5);
//                System.out.println("AAAAA");
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                table.printTable(100);
//            }
//        });
//
//        thread.start();
//        thread2.start();

        MyThread1 myThread1 = new MyThread1(table);
        Thread thread = new Thread(myThread1);
        thread.start();
    }

}
