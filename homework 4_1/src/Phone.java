public class Phone {
    long numb;
    String model;
    int weight; // в граммах

    public Phone() {
        numb = 375291234567L;
        model = "mobile";
        weight = 125;
    }

    //4.5 4.8 ??????
    public Phone(long numb, String model, int weight) {
        this(numb,model);
        this.weight = weight;

    }
    //4.6
    public Phone(long numb, String model) {
        this.numb = numb;
        this.model = model;
    }





    void recieveCall(String nameCall) {
        System.out.println("Звонит " + nameCall);
        return;
    }

    // 4.9
    void recievCall(String nameCall, long numb) {
        System.out.println("Звонит " + nameCall);
        return;
    }

    // аргументы переменной длинны, номера телефонов для отправки сообщений
    void SendMessage(long... numph) {
        for (int i = 0; i < numph.length; i++) {
            System.out.println("Отправить смс на номер " + numph[i]);
        }

    }

    Long getNumber() {
        return numb;
    }




}

