package space.xinzhu.model.create.factoryMethod;

import space.xinzhu.model.create.simpleFactory.Enemy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public interface Factory {
    Enemy cteate(int screenWith);
}
