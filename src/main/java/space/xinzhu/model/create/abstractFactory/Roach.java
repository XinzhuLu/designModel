package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Roach extends LowClassUnit{

    public Roach(int x , int y){
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂出现在坐标：【" + x + "," + y + "】");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂用爪子射击，攻击力：" + attack);
    }
}
