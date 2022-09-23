public abstract class Quarter extends Building{
    private int capacity;

    public Quarter(Cell.content bName, int xSize, int ySize, int bTime, int capacity) {
        super(bName, xSize, ySize, bTime);
        this.capacity = capacity;
    }

    public abstract void addQuarter(State state);
    @Override
    public void specialAction(State state) {
        state.addMaxVillager(capacity);
        addQuarter(state);
    }
}
