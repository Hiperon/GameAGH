public class Block extends Quarter{
    public Block() {
        super(Cell.content.BLOCK, 1, 1, 25, 10);
    }
    @Override
    public void addQuarter(State state) {
        state.addBlock();
    }
}
