package avtopark;

import java.util.Arrays;

public class AvtoPark {
    private Cars[] cars = new Cars[2];

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "AvtoPark{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }

}
