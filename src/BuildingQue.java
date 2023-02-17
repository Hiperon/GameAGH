import java.util.ArrayList;
import java.util.List;

public class BuildingQue {
    private class ConstructionBuilding{
        Building building;
        int days;

        public ConstructionBuilding(Building building, int days) {
            this.building = building;
            this.days = days;
        }
    }
    List<ConstructionBuilding>[] underConstruction;
    public BuildingQue(List<ConstructionBuilding>[] underConstruction) {
        this.underConstruction = underConstruction;
    }
    
}
