public class Field extends Building{
    public Field() {
        super(Cell.content.FIELD, 1, 1, 5);
    }

    @Override
    public void specialAction(State state) {
        state.addField();
    }
}
