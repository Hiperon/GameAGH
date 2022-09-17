public class GameGrid {
    public static final int NUMBER_OF_COLUMNS = 30;
    public static final int NUMBER_OF_ROWS = 20;
    Cell[][] gameGrid = new Cell[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
    public GameGrid() {
        for (int i = 0; i < NUMBER_OF_ROWS; i++) {
            for (int j = 0; j < NUMBER_OF_COLUMNS; j++) {
                gameGrid[i][j] = new Cell();
            }
        }
        gameGrid[0][0].setCellContent(Cell.content.HOUSE);
        gameGrid[0][1].setCellContent(Cell.content.FARM);
    }

    public static void main(String[] args) {
        GameGrid Test3 = new GameGrid();
        for(int i = 0; i<NUMBER_OF_COLUMNS; i++) {
            System.out.println(Test3.gameGrid[0][i].toString());
        }
    }
}
