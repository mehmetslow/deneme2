import java.util.Date;

public class Sheep extends Enimal {
    private double woll;

    public Sheep() {

    }

    public Sheep(double woll) {
        this.woll = woll;
    }

    public Sheep(String name, String typ, Date birthday, String birthPlace, boolean mamals, double woll) {
        super(name, typ, birthday, birthPlace, mamals);
        this.woll = woll;
    }

    public double getWoll() {
        return woll;
    }

    public void setWoll(double woll) {
        this.woll = woll;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "woll=" + woll +
                "} " + super.toString();
    }
}


