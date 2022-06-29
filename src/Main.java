public class Main {


    public static void main(String[] args) throws Exception {
        operations operations = new operations();

        System.out.println("Вы запустили ТАГАМУЧИ.");

        while (true) {
            operations.addCharacteristics(new Pet(100, 100, 100, 100, 100));
            operations.printlnCharacteristics();
        }
    }
}
