import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Sheep sheep=new Sheep("Mor", "Merinos", new Date(2015,8,10), "Dortmund", true, 12);
        int old =sheep.calculatorAge(new Date(2020,06,10));
        System.out.println(old);
        System.out.println(sheep);


    }
}
