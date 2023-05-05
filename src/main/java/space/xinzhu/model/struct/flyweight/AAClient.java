package space.xinzhu.model.struct.flyweight;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        TileFactroy factroy = new TileFactroy();

        factroy.getDrawable("river").draw(10 , 10);
        factroy.getDrawable("river").draw(10 , 20);
        factroy.getDrawable("grass").draw(20 , 10);
        factroy.getDrawable("grass").draw(20 , 20);
        factroy.getDrawable("river").draw(10 , 10);
        factroy.getDrawable("river").draw(10 , 20);
        factroy.getDrawable("grass").draw(20 , 10);
        factroy.getDrawable("grass").draw(20 , 20);
    }
}
