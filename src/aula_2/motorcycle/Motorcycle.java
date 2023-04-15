package aula_2.motorcycle;

public class Motorcycle {
    private double speed;
    public static int id = 0;
    private int gear;
    public static int numOfMotorcycles = 0;
    public Motorcycle (double speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        id = numOfMotorcycles + 100;
        numOfMotorcycles++;
    }

    public Motorcycle() {
        id = numOfMotorcycles + 100;
        numOfMotorcycles++;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Motorcycle.id = id;
    }

    public static int getNumOfMotorcycles() {
        return numOfMotorcycles;
    }

    public static void setNumOfMotorcycles(int numOfMotorcycles) {
        Motorcycle.numOfMotorcycles = numOfMotorcycles;
    }
    public void gearUp() {
        if (speed < 10) {
            gear = 1;
        } else if (speed < 20) {
            gear = 2;
        } else if (speed < 30) {
            gear = 3;
        } else {
            gear = 4;
        }

    }

    public void speedUp(double speed) {
        this.speed += speed;
        gearUp();
    }

    public void applyBreaks(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        gearUp();
    }

}
