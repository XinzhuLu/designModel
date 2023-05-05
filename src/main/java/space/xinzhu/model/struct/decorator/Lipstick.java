package space.xinzhu.model.struct.decorator;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Lipstick extends Decorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}
