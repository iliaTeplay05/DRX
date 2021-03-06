import java.net.ServerSocket;
import java.util.Scanner;

public class Pet {
    private int theNeedForFood;
    private int theNeedForWater;
    private int theNeedForSleep;
    private int theNeedForHygiene;
    private int theNeedForTreatment;
    private boolean life = true;

    public Pet(int theNeedForFood, int theNeedForWater, int theNeedForSleep, int theNeedForHygiene, int theNeedForTreatment) {
        this.theNeedForFood = theNeedForFood;
        this.theNeedForWater = theNeedForWater;
        this.theNeedForSleep = theNeedForSleep;
        this.theNeedForHygiene = theNeedForHygiene;
        this.theNeedForTreatment = theNeedForTreatment;
        this.life = true;
    }

    public boolean isLife() {
        return life;
    }

    public int getTheNeedForFood() {
        return theNeedForFood;
    }

    public void setTheNeedForFood(int editNeed) {
        if (theNeedForFood + editNeed > 100) {
            life = false;
            System.out.println("Во время приема пищи питомец выглядел не хорошо. Когда он доел свою порцию, его желудок взорвался и он умер.");
            System.out.println("GAME OVER");
        } else if (theNeedForFood + editNeed < 0) {
            life = false;
            System.out.println("Желудок вашего питомца сколлапсировал в черную дыру и он умер.");
            System.out.println("GAME OVER");
        } else {
            theNeedForFood = theNeedForFood + editNeed;
        }
    }

    public int getTheNeedForWater() {
        return theNeedForWater;
    }

    public void setTheNeedForWater(int editNeed) {
        if (theNeedForWater + editNeed > 100) {
            life = false;
            System.out.println("Во время питья питомец выглядел не хорошо. Когда он выпил свою порцию, его желудок взорвался и он умер.");
            System.out.println("GAME OVER");
        } else if (theNeedForWater + editNeed < 0) {
            life = false;
            System.out.println("Ваш питомец засох. Теперь у вас есть его мумия.");
            System.out.println("GAME OVER");
        } else {
            theNeedForWater = theNeedForWater + editNeed;
        }
    }

    public int getTheNeedForSleep() {
        return theNeedForSleep;
    }

    public void setTheNeedForSleep(int editNeed) {
        if (theNeedForSleep + editNeed > 100) {
            System.out.println("Питомец не хочет спать.");
        } else if (theNeedForSleep + editNeed < 0) {
            life = false;
            System.out.println("У вашего питомца были проблемы с сердцем. Он долго не спал, ожидая вашей команды, и умер.");
            System.out.println("GAME OVER");
        } else {
            theNeedForSleep = theNeedForSleep + editNeed;
        }
    }

    public int getTheNeedForHygiene() {
        return theNeedForHygiene;
    }

    public void setTheNeedForHygiene(int editNeed) {
        if (theNeedForHygiene + editNeed > 100) {
            life = false;
            System.out.println("Во время процедур ваш питомец начал блестеть как серебро. Из-за этого его украла ворона.");
            System.out.println("GAME OVER");
        } else if (theNeedForHygiene + editNeed < 0) {
            life = false;
            System.out.println("Из-за антисанитарии в шерсти питомца завелась челябинская блоха и он умер.");
            System.out.println("GAME OVER");
        } else {
            theNeedForHygiene = theNeedForHygiene + editNeed;
        }
    }

    public int getTheNeedForTreatment() {
        return theNeedForTreatment;
    }

    public void setTheNeedForTreatment(int editNeed) {
        if (theNeedForTreatment + editNeed > 100) {
            life = false;
            System.out.println("Во время приема лекарств питомец выглядел не хорошо. Когда он их принял, его глаза стали закрываться и он умер от передозировки.");
            System.out.println("GAME OVER");
        } else if (theNeedForTreatment + editNeed < 0) {
            life = false;
            System.out.println("Ваш питомец умер без вашей помощи. В последнее время он выглядел вылям. Возможно он чем-то болел.");
            System.out.println("GAME OVER");
        } else {
            theNeedForTreatment = theNeedForTreatment + editNeed;
        }
    }

    public void squanderTime() {
        setTheNeedForFood(-10);
        setTheNeedForWater(-20);
        setTheNeedForSleep(-5);
        setTheNeedForHygiene(-15);
        setTheNeedForTreatment(-5);
    }

    public void printlnCharacteristics() {
        System.out.println("Сытость: " + theNeedForFood);
        System.out.println("Гидрация: " + theNeedForWater);
        System.out.println("Бодрость: " + theNeedForSleep);
        System.out.println("Гигиена: " + theNeedForHygiene);
        System.out.println("Здоровье: " + theNeedForTreatment);
    }

    public void printlnMenu() {
        System.out.println("-".repeat(15));
        System.out.println("1. Покормить");
        System.out.println("2. Попоить");
        System.out.println("3. Уложить спать");
        System.out.println("4. Помыть");
        System.out.println("5. Полечить");
        System.out.println("6. Ждать");
        System.out.println("0. Выйти из игры");
    }

    static int inputInt(String message, int min, int max) {
        boolean isValidInput;
        int output = 0;
        do {
            try {
                isValidInput = true;
                Scanner scanner = new Scanner (System.in);

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
}

