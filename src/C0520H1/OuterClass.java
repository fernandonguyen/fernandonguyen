package C0520H1;

public class OuterClass {
    public int x;

    public class InnerClass{
        public int y;

        public void getY(){
            System.out.println("Hien thi Y " + y);
        }
    }

    public static class StaticInnerClass{
        public int z;

        public void getZ(){
            System.out.println("Hien thi Z " + z);
        }
    }

    public void getX(){
        System.out.println("Hien thi X " + x);
    }
}
