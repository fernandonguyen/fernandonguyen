package C0520H1.Interface;

import C0520H1.Interface.EngineFlyable;

public class Bird implements EngineFlyable, AnimalFlyable{
    @Override
    public String fly() {
        return "Fly by Swing";
    }

    @Override
    public String fly1() {
        return null;
    }

    @Override
    public String fly2() {
        return null;
    }
}
