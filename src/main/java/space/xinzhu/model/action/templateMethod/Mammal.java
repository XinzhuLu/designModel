package space.xinzhu.model.action.templateMethod;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public abstract class Mammal {

    public abstract void move();
    public abstract void eat();
    public void live() {

        move();
        eat();
    }
}
