public abstract class Building {
    /**
     * Abstract class for buildings,
     * each building has:
     * @param bName - name of the building from the enum
     * @param xSize - horizontal size of the building
     * @param ySize - vertical size of the building
     * @param bTime - Time for one person to build this building
     */
    private Cell.content bName;
    private int xSize;
    private int ySize;
    private int bTime;

    public Cell.content getbName() {
        return bName;
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public int getbTime() {
        return bTime;
    }

    public abstract void specialAction();
}
