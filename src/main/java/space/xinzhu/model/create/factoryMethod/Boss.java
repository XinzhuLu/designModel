package space.xinzhu.model.create.factoryMethod;

import space.xinzhu.model.create.simpleFactory.Enemy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Boss extends Enemy {

    public Boss(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("boss出现在坐标：【" + x + "," + y + "】");
        System.out.println("boss用大炮射击，攻击力：" );
    }
}
