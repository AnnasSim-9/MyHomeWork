public class Tuba implements Instrument {

    int d;

    Tuba(int d) {
        this.d = d;
    }


    public void print() {
        System.out.println("Играет туба, диаметр " + d);
    }
}
