package C0520H1.Abstract;

public abstract class Geometric extends SuperGeometric{
    private String name;

    protected Geometric(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getInfo(){
        return 0;
    }

}
