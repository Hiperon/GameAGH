public class Farm  extends Building{
    public Farm() {
        super(Cell.content.FARM, 1, 1, 8);
    }

    @Override
    public void specialAction(State state) {
        state.addFarm();
    }
}
