package Hierarchy;

public class Track extends Car {
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        changeGear();
    }

    @Override
    public void driveOf() throws Exception {
        super.driveOf();
        changeGear();
    }
}
