package space.xinzhu.model.create.builder;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/16
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct(){
        System.out.println("工程项目启动==================");

        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();

        System.out.println("工程竣工");
        return builder.getBuilding();
    }
}
