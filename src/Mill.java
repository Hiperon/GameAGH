public class Mill extends Building{
    public Mill() {
        super(Cell.content.MILL, 4, 4, 200);
    }

    @Override
    public void specialAction(State state) {
        state.addMill();
    }
}
