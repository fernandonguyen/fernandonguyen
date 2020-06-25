package C0520H1;

import javax.sound.midi.Soundbank;

public class VietNam extends Student{
    String address;

    public VietNam(String name, int age, String address){
        super(name, age);
        this.address = address;
    }

    public VietNam(){
    }

    public void getInform(){
        System.out.println("Name:" + name + "Age" + age + "Address" + address);
    }

    public void getHello() {
        super.getHello();
        System.out.println("Xin chao VN");
    }

    //
//    @Override
//    public void getHello() {
//        System.out.println("Hell VN");
//    }
//
    public void getVNName(){
        System.out.println(this.name);
    }
}
