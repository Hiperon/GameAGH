public class Storehouse extends Building{
    public Storehouse() {
        super(Cell.content.STOREHOUSE, 2, 1, 50);
    }
    @Override
    public void specialAction(State state) {
        state.addStorehouse();
        state.addMaxFood(50);
    }
}
