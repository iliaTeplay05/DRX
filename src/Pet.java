public class Pet {
    int theNeedForFood;
    int theNeedForWater;
    int theNeedForSleep;
    int theNeedForHygiene;
    int theNeedForTreatment;
    boolean life;

    public Pet(int theNeedForFood, int theNeedForWater, int theNeedForSleep, int theNeedForHygiene, int theNeedForTreatment) {
        this.theNeedForFood = theNeedForFood;
        this.theNeedForWater = theNeedForWater;
        this.theNeedForSleep = theNeedForSleep;
        this.theNeedForHygiene = theNeedForHygiene;
        this.theNeedForTreatment = theNeedForTreatment;
        this.life = life;
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
            this.theNeedForFood = theNeedForFood + editNeed;
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
            this.theNeedForWater = theNeedForWater + editNeed;
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
            this.theNeedForSleep = theNeedForSleep + editNeed;
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
            this.theNeedForHygiene = theNeedForHygiene + editNeed;
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
            this.theNeedForTreatment = theNeedForTreatment + editNeed;
        }
    }
}

