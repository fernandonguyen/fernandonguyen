package IO;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;

    public void check(){
        System.out.println(name + " " + address);
    }
}
