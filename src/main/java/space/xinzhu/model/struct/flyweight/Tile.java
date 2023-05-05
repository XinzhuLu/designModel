package space.xinzhu.model.struct.flyweight;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Tile {

    private String image;
    private int x , y ;

    public Tile(String image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }

    public void draw(){
        System.out.println("x:" + x + ",y:" + y + ",image:" + image);
    }
}
