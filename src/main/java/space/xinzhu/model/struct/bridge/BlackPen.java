package space.xinzhu.model.struct.bridge;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class BlackPen extends Pen{

    public BlackPen(Ruler ruler) {
        super(ruler);
    }

/*    @Override
    public void getColor() {
        System.out.print("black");
        ruler.regularize();
    }*/

    @Override
    public void draw() {
        System.out.print("black");
        ruler.regularize();
    }
}
