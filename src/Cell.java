public class Cell {
    public enum content{
        FREE,
        HOME,
        BLOCK,
        SPICHLERZ,
        SMITHY,
        MILL,
        FIELD,
        FARM
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
        System.out.println(Test1.toString());
        Test1.setCellContent(content.HOME);
        System.out.println(Test1.toString());
        content test2;
        test2 = Test1.getCellContent();
        System.out.println(test2.toString());
    }
}
