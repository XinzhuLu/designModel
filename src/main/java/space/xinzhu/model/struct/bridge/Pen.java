package space.xinzhu.model.struct.bridge;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public abstract class Pen {

    //public abstract void getColor();

    protected Ruler ruler;

    public Pen(Ruler ruler) {
        this.ruler = ruler;
    }

    public void draw(){
        //getColor();
        //System.out.println("▲");
    }
}
