package space.xinzhu.model.action.templateMethod;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Whale extends Mammal{

    @Override
    public void move(){
        System.out.println("鯨魚在游泳。。");
    }

    @Override
    public void eat() {
        System.out.println("鯨魚在進食。。");
    }
}
