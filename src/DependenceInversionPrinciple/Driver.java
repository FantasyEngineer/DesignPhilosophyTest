package DependenceInversionPrinciple;

public class Driver implements IDDriver {
    @Override
    public void drive(ICar iCar) {
        iCar.run();
    }
}
