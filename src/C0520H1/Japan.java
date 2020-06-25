package C0520H1;

public class Japan extends Student{
    String passPort;

    public Japan(String name, int age, String passPort) {
        super(name, age);
        this.passPort = passPort;
    }

    public Japan(String passPort) {
        this.passPort = passPort;
    }

    @Override
    public void getHello() {
        super.getHello();
        System.out.println("Hello Japan");
    }

    public void getPassPort(){
        System.out.println(this.passPort);
    }
}
