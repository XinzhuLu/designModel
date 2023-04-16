package space.xinzhu.model.create.builder;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/16
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class HouseBuilder implements Builder{

    private Building house;

    public HouseBuilder(){
        house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("别墅地基");
        house.setBasement("-------\n");
    }

    @Override
    public void buildWall() {
        System.out.println("别墅围墙");
        house.setBasement("口 口 口\n");
        house.setBasement("-------\n");
        house.setBasement("口 口 口\n");
        house.setBasement("-------\n");
        house.setBasement("口 口 口\n");
        house.setBasement("-------\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("别墅阁楼");
        house.setBasement("=======\n");
    }

    @Override
    public Building getBuilding() {
       return this.house;
    }
}
