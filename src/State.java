/**
 * state of the game - variables from game at this moment
 */
public class State {
    private int numberHouse = 1;
    private int numberBlock = 0;
    private int numberWarhouse = 0;
    private int numberMill = 0;
    private int numberField = 1;
    private int numberFarm = 0;

    private class SmithyNumber{
        /**
         * smithy works once every two days, so I need to know how many Smiths will work on even days
         * And how many work on odd days, this class holds both data
         */
        public int even = 0;
        public int odd = 0;

        public int getEven() {
            return even;
        }

        public void setEven(int even) {
            this.even = even;
        }

        public int getOdd() {
            return odd;
        }

        public void setOdd(int odd) {
            this.odd = odd;
        }

        @Override
        public String toString() {
            return "SmithyNumber{" +
                    "even=" + even +
                    ", odd=" + odd +
                    '}';
        }
    }
    private SmithyNumber daySmithy = new SmithyNumber(); //number of times when smith should work on even or odd days

    private int foodStock;
    private int maxFood;
    private int numberVilliger;
    private int maxNumberVilliger;

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int getNumberBlock() {
        return numberBlock;
    }

    public void setNumberBlock(int numberBlock) {
        this.numberBlock = numberBlock;
    }

    public int getNumberWarhouse() {
        return numberWarhouse;
    }

    public void setNumberWarhouse(int numberWarhouse) {
        this.numberWarhouse = numberWarhouse;
    }

    public int getNumberMill() {
        return numberMill;
    }

    public void setNumberMill(int numberMill) {
        this.numberMill = numberMill;
    }

    public int getNumberField() {
        return numberField;
    }

    public void setNumberField(int numberField) {
        this.numberField = numberField;
    }

    public int getNumberFarm() {
        return numberFarm;
    }

    public void setNumberFarm(int numberFarm) {
        this.numberFarm = numberFarm;
    }

    public SmithyNumber getDaySmithy() {
        return daySmithy;
    }

    public void setDaySmithy(SmithyNumber daySmithy) {
        this.daySmithy = daySmithy;
    }

    public int getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(int foodStock) {
        this.foodStock = foodStock;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public void setMaxFood(int maxFood) {
        this.maxFood = maxFood;
    }

    public int getNumberVilliger() {
        return numberVilliger;
    }

    public void setNumberVilliger(int numberVilliger) {
        this.numberVilliger = numberVilliger;
    }

    public int getMaxNumberVilliger() {
        return maxNumberVilliger;
    }

    public void setMaxNumberVilliger(int maxNumberVilliger) {
        this.maxNumberVilliger = maxNumberVilliger;
    }

    @Override
    public String toString() {
        return "State{" +
                "numberHouse=" + numberHouse +
                ", numberBlock=" + numberBlock +
                ", numberWarhouse=" + numberWarhouse +
                ", numberMill=" + numberMill +
                ", numberField=" + numberField +
                ", numberFarm=" + numberFarm +
                ", daySmithy=" + daySmithy +
                ", foodStock=" + foodStock +
                ", maxFood=" + maxFood +
                ", numberVilliger=" + numberVilliger +
                ", maxNumberVilliger=" + maxNumberVilliger +
                '}';
    }

    public static void main(String[] args) {
        State Test1 = new State();
        System.out.println(Test1.toString());
    }
}
