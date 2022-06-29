import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы запустили ТАГАМУЧИ.");
        Pet pet1 = new Pet(8, 45, 23, 23, 45);

//        PetManager petManager = new PetManager(pet1);
//        petManager.manage();

        while (pet1.isLife()) {
            pet1.printlnCharacteristics();

            System.out.println("input action: ");
            int action = scanner.nextInt();

            switch (action) {
                case 1: {
                    pet1.setTheNeedForFood(30);
                }
                break;
            }
        }
    }
}
