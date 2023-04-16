public class Main {
    public static void main(String[] args) {
// 4.2.
        Phone p = new Phone();
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

//4.3.        // Phone
        System.out.println(p1.numb + " " + p1.model + " " + p1.weight);
        System.out.println(p2.numb + " " + p2.model + " " + p2.weight);
        System.out.println(p3.numb + " " + p3.model + " " + p3.weight);
//4.4
        p1.recieveCall("Ivanov");
        p2.recieveCall("Petrov");
        p3.recieveCall("Sidorov");

        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());
        System.out.println(p3.getNumber());

//4.9
        p.recievCall("Client",12345678);
//4.10
        p.SendMessage(11111111,22222222,33333333,44444444);



    }

}