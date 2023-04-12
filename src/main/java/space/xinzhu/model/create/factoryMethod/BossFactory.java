package space.xinzhu.model.create.factoryMethod;

import space.xinzhu.model.create.simpleFactory.Airplane;
import space.xinzhu.model.create.simpleFactory.Enemy;

import java.util.Random;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class BossFactory implements Factory{

    @Override
    public Enemy cteate(int screenWith) {
        int x = new Random().nextInt(screenWith);
        return new Boss(x , 0);
    }
}
