import java.util.Scanner;

public class operations {
    Pet[] pet;

    public operations() {
        this.pet = new Pet[1];
    }

    public void printlnCharacteristics(Pet pet) {
        System.out.println("Сытость: " + pet.theNeedForFood);
        System.out.println("Гидрация: " + pet.theNeedForWater);
        System.out.println("Бодрость: " + pet.theNeedForSleep);
        System.out.println("Гигиена: " + pet.theNeedForHygiene);
        System.out.println("Здоровье: " + pet.theNeedForTreatment);
    }

    public void separator() {
        System.out.println("-".repeat(15));
    }

    public void printlnMenu() {
        System.out.println("Выберите пуркт меню:");
        System.out.println("1. Накормить питомца.");
        System.out.println("2. Напоить питомца.");
        System.out.println("3. Уложить спать питомца.");
        System.out.println("4. Помыть питомца питомца.");
        System.out.println("5. Лечить питомца.");
        System.out.println("0. Закончить игру.");
    }

    public static int intOutput(String message, int min, int max) {
        boolean isValidInput;
        int output = 0;
        do {
            try {
                isValidInput = true;
                Scanner scanner = new Scanner(System.in);

                System.out.print(message);
                output = scanner.nextInt();

                if (output < min || output > max) {
                    System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                    throw new Exception();
                }

            } catch (Exception e) {
                isValidInput = false;
                System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
            }

        } while (isValidInput == false);

        return output;
    }

    public void addCharacteristics(Pet insertedPet) {
        Pet[] tempArray = new Pet[pet.length];

        for (int i = 0; i < pet.length; i++) {
            tempArray[i] = pet[i];
        }

        tempArray[tempArray.length - 1] = insertedPet;

        pet = tempArray;
    }
}
