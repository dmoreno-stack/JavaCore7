package lesson11b;

public class App {
    public static void main(String[] args) {
        Address myAddress = new Address("123 Elm street", "Paterson","NJ",88774);
        Person me = new Person("James","Morris","M",2001,myAddress);

//        String str = new String("Hello World");

        String myStreetAddress = me.getAddress().getStreet()+me.getAddress().getCity();
        System.out.println(myStreetAddress);

    }
}
