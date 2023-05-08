package space.xinzhu.model.action.templateMethod;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Human extends Mammal{
    @Override
    public void move() {
        System.out.println("人類在開車");
    }

    @Override
    public void eat() {
        System.out.println("人類在吃飯");

    }
}
