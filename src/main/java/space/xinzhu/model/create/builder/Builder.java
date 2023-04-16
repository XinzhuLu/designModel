package space.xinzhu.model.create.builder;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/16
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public interface Builder {

    public void buildBasement();
    public void buildWall();
    public void buildRoof();

    public Building getBuilding();
}
