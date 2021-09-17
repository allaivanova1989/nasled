package avtopark;

public class Main {
    public static void main(String[] args) {
        Nissan nissan = new Nissan("Almera Tino");
        Audi audi = new Audi("Audi 100");
        AvtoPark avtoPark = new AvtoPark();
        avtoPark.getCars()[0] = nissan;
        avtoPark.getCars()[1] = audi;
        System.out.println(avtoPark);

    }

}
