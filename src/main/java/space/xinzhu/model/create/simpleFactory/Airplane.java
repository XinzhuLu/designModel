package space.xinzhu.model.create.simpleFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Airplane extends Enemy {

    public Airplane(int x , int y){
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("飞机出现在坐标：【" + x + "," + y + "】");
        System.out.println("飞机用大炮射击，攻击力：" );
    }

}
