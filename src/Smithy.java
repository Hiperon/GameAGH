public class Smithy extends Building{
    public Smithy() {
        super(Cell.content.SMITHY, 2, 3, 100);
    }

    @Override
    public void specialAction(State state) {
        if(state.getDayNumber()%2 == 0){
            state.addSmithyEven();
        }
        else {
            state.addSmithyOdd();
        }
    }
}
