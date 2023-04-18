public class Drum implements Instrument{

        int h;
        Drum(int h) {
             this.h = h;
        }

    public void print() {
        System.out.println("Играет барабан, его размер " + h);

    }
}
