public class House extends Quarter{
    public House() {
        super(Cell.content.HOUSE, 1, 1, 5, 5);
    }
    @Override
    public void addQuarter(State state) {
        state.addHouse();
    }
}
