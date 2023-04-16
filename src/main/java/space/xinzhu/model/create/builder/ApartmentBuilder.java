package space.xinzhu.model.create.builder;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/16
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class ApartmentBuilder implements Builder{

    private Building house;

    public ApartmentBuilder(){
        house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("公寓地基");
        house.setBasement("++++++++++\n");
    }

    @Override
    public void buildWall() {
        System.out.println("公寓围墙");
        house.setBasement("田 | 田 | 田 |\n");
        house.setBasement("田 | 田 | 田 |\n");
        house.setBasement("田 | 田 | 田 |\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("公寓阁楼");
        house.setBasement("♦♦♦♦♦♦♦\n");
        house.setBasement("♦♦♦♦♦♦♦♦♦\n");
        house.setBasement("♦♦♦♦♦♦♦♦♦♦♦\n");
    }

    @Override
    public Building getBuilding() {
       return this.house;
    }
}
