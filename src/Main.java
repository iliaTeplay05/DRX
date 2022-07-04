import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы запустили ТАМАГОЧИ.");
        Pet pet = new Pet(100, 100, 100, 100, 100);


        while (pet.isLife()) {
            pet.printlnCharacteristics();

            pet.printlnMenu();

            int action = pet.inputInt("Выберите действие: ", 0, 6);

            switch (action) {
                case 1: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение сытости");
                    int feed = scanner.nextInt();
                    pet.setTheNeedForFood(feed);
                    pet.squanderTime();
                }
                break;

                case 2: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение гидродации");
                    int drunk = scanner.nextInt();
                    pet.setTheNeedForWater(drunk);
                    pet.squanderTime();
                }
                break;

                case 3: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение бодрости");
                    int putToBed = scanner.nextInt();
                    pet.setTheNeedForSleep(putToBed);
                    pet.squanderTime();
                }
                break;

                case 4: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение гигиены");
                    int hygienicProcedures = scanner.nextInt();
                    pet.setTheNeedForHygiene(hygienicProcedures);
                    pet.squanderTime();
                }
                break;

                case 5: {
                    System.out.println("Введите число, на которое вы хотите увеличить значение здоровья");
                    int heal = scanner.nextInt();
                    pet.setTheNeedForTreatment(heal);
                    pet.squanderTime();
                }
                break;

                case 6: {
                    pet.squanderTime();
                }
                break;

                case 0: {
                    System.exit(0);
                }
                break;
            }
        }
    }
}
