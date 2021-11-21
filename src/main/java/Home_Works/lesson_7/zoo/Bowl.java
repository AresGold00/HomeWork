package Home_Works.lesson_7.zoo;

public class Bowl {
    public int foodAmount;

    public void Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }


    public boolean decreaseFood(int food) {
        int diff = foodAmount - food;
        if (diff < 0) return false;
        foodAmount -= food;
        System.out.printf("Питание уменьшилось на %d грамм, теперь есть %d грамм.\n",food,foodAmount);
        return true;
    }
    void putFood(int food) {
        this.foodAmount += food;
        System.out.printf("Питание увеличилось на %d грамм, теперь есть %d грамм.\n\n",food,foodAmount);
    }

   public void info() {
       System.out.println("plate: " + foodAmount);
    }


}

