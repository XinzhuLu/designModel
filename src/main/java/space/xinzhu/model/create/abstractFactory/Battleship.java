package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Battleship extends HithClassUnit{

    public Battleship(int x , int y){
        super(x,y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现在坐标：【" + x + "," + y + "】");
    }

    @Override
    public void attack() {
        System.out.println("战舰用机关炮射击，攻击力：" + attack);
    }
}
