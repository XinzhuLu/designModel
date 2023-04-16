package space.xinzhu.model.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/16
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Building {

    private List<String> buildingComponents = new ArrayList<>();

    public void setBasement(String basement){
        this.buildingComponents.add(basement);
    }

    public void setWall(String wall){
        this.buildingComponents.add(wall);
    }

    public void setRoof(String roof){
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        String buildingStr = "";
        for (int i = buildingComponents.size()-1; i >=0 ; i--) {
            buildingStr += buildingComponents.get(i);
        }

        return buildingStr;
    }

    public Building() {
    }
}
