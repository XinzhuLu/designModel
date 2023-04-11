package space.xinzhu.model.create.singleton;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Hungry {

    private static final Hungry hungry = new Hungry();

    private Hungry(){}

    public static Hungry getInstance(){
        return hungry;
    }
}
