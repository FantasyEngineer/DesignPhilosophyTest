package DependenceInversionPrinciple;

public class Manger {




    public static void main(String[] args) {

        Driver driver = new Driver();
        Benz benz = new Benz();
        Bmw bmw = new Bmw();
        driver.drive(benz);
        driver.drive(bmw);

    }
}
