package space.xinzhu.model.struct.bridge;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        new WritePen(new SquareRuler()).draw();
        new WritePen(new TriangleRuler()).draw();
        new BlackPen(new SquareRuler()).draw();
        new BlackPen(new TriangleRuler()).draw();
    }
}
