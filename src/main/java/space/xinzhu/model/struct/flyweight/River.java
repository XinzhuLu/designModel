package space.xinzhu.model.struct.flyweight;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class River implements Drawable{

    private String image;

    public River(){
        this.image = "river";
        System.out.println("image: " + image + "耗时0，5秒");
    }

    @Override
    public void draw(int x , int y){
        System.out.println("x:" + x + ",y:" + y + ",image:" + image);
    }
}
