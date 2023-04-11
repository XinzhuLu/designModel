package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Poison extends MidClassUnit{

    public Poison(int x , int y){
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液出现在坐标：【" + x + "," + y + "】");
    }

    @Override
    public void attack() {
        System.out.println("毒液用毒液射击，攻击力：" + attack);
    }
}
