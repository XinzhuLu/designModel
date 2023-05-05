package space.xinzhu.model.struct.decorator;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public abstract class Decorator implements Showable{

    protected Showable showable;
    public Decorator(Showable showable){
        this.showable = showable;
    }
    @Override
    public void show() {
        //System.out.print("粉饰【");
        showable.show();
        //System.out.print("】");
    }
}
