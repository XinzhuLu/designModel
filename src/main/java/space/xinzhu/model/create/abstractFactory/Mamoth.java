package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Mamoth extends HithClassUnit{

    public Mamoth(int x , int y){
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸出现在坐标：【" + x + "," + y + "】");
    }

    @Override
    public void attack() {
        System.out.println("猛犸用机关枪射击，攻击力：" + attack);
    }
}
