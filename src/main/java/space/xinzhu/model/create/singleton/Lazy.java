package space.xinzhu.model.create.singleton;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Lazy {

    private volatile static Lazy lazy;

    private Lazy(){}

    public static Lazy getInstance(){
        if (lazy == null){
            synchronized (Lazy.class){
                if (lazy == null){
                    new Lazy();
                }
            }
        }
        return lazy;
    }
}
