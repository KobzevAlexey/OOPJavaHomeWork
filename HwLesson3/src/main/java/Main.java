public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Александр", "муж.", 35);
        Person anne = new Person("Аннет", "жен.", 18);
        Person mary = new Person("Мария", "жен.", 17);
        Person kate = new Person("Кейт", "жен.", 15);

        alex.addChild(mary);
        alex.addChild(anne);
        alex.addChild(kate);

        System.out.println(alex);
        System.out.println(mary);
        System.out.println();

        Person siri = new Person("Siri", "жен.", 37);
        Person alice = new Person("Alice", "жен.", 17);
        siri.addChild(alice);
        System.out.println(siri);
        System.out.println(alice);

        alice.setAge(27);
        alice.addChild(mary);
        System.out.println(alice);

        IO save = new IO();
        alex.saveObj();
        save.load("FreeFamily.data");
    }
}
