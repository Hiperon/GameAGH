public class Cell {
    public enum content{
        FREE,
        HOUSE,
        BLOCK,
        STOREHOUSE,
        SMITHY,
        MILL,
        FIELD,// zboże - 4
        FARM, // świnki - 7
        BUILD // On this one we are building something
    }
    private content CellContent;

    public Cell() {
        CellContent = content.FREE;
    }

    public Cell(content cellContent) {
        CellContent = cellContent;
    }

    public content getCellContent() {
        return CellContent;
    }

    public void setCellContent(content cellContent) {
        CellContent = cellContent;
    }

    @Override
    public String toString() {
        return "Cell:" +
                "CellContent=" + this.CellContent.toString();
    }


    public static void main(String[] args) {
        Cell Test1 = new Cell();
        System.out.println(Test1);
        Test1.setCellContent(content.HOUSE);
        System.out.println(Test1);
        content test2;
        test2 = Test1.getCellContent();
        System.out.println(test2.toString());
    }
}
