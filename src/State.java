/**
 * state of the game - variables from game at this moment
 */
public class State {
    private int numberHouse = 1;
    private int numberBlock = 0;
    private int numberStorehouse = 0;
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
        //Actually all I will do, is ad 1, so alongside set I need:
        public void addEven() {
            this.even += 1;
        }
        public void addOdd() {
            this.odd += 1;
        }
    }
    private SmithyNumber daySmithy = new SmithyNumber(); //number of times when smith should work on even or odd days

    private int foodStock;
    private int maxFood;
    private int numberVillager;
    private int maxNumberVillager;

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public void addHouse() {
        this.numberHouse +=1;
    }

    public int getNumberBlock() {
        return numberBlock;
    }

    public void setNumberBlock(int numberBlock) {
        this.numberBlock = numberBlock;
    }
    public void addBlock() {
        this.numberBlock +=1;
    }

    public int getNumberStorehouse() {
        return numberStorehouse;
    }

    public void setNumberStorehouse(int numberStorehouse) {
        this.numberStorehouse = numberStorehouse;
    }
    public void addStorehouse() {
        this.numberStorehouse +=1;
    }

    public int getNumberMill() {
        return numberMill;
    }

    public void setNumberMill(int numberMill) {
        this.numberMill = numberMill;
    }

    public void addMill() {
        this.numberMill +=1;
    }


    public int getNumberField() {
        return numberField;
    }

    public void setNumberField(int numberField) {
        this.numberField = numberField;
    }

    public void addField() {
        this.numberField +=1;
    }

    public int getNumberFarm() {
        return numberFarm;
    }

    public void setNumberFarm(int numberFarm) {
        this.numberFarm = numberFarm;
    }

    public void addFarm() {
        this.numberFarm +=1;
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

    public void addFoodStock(int food) {
        this.foodStock +=food;
    }


    public int getMaxFood() {
        return maxFood;
    }

    public void setMaxFood(int maxFood) {
        this.maxFood = maxFood;
    }

    public int getNumberVillager() {
        return numberVillager;
    }

    public void setNumberVillager(int numberVillager) {
        this.numberVillager = numberVillager;
    }

    public void add2Villager() {
        this.numberVillager += 2;
    }

    public int getMaxNumberVillager() {
        return maxNumberVillager;
    }

    public void setMaxNumberVillager(int maxNumberVillager) {
        this.maxNumberVillager = maxNumberVillager;
    }

    public void addMaxVillager(int maxVillager) {
        this.foodStock += maxVillager;
    }

    @Override
    public String toString() {
        return "State{" +
                "numberHouse=" + numberHouse +
                ", numberBlock=" + numberBlock +
                ", numberStorehouse=" + numberStorehouse +
                ", numberMill=" + numberMill +
                ", numberField=" + numberField +
                ", numberFarm=" + numberFarm +
                ", daySmithy=" + daySmithy +
                ", foodStock=" + foodStock +
                ", maxFood=" + maxFood +
                ", numberVillager=" + numberVillager +
                ", maxNumberVillager=" + maxNumberVillager +
                '}';
    }

    public static void main(String[] args) {
        State Test1 = new State();
        System.out.println(Test1.toString());
    }
}
