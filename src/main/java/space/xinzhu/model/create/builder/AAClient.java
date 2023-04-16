package space.xinzhu.model.create.builder;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {

        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());

        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }

}
