package space.xinzhu.model.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class TileFactroy {

    private Map<String , Drawable> images;

    public TileFactroy() {
        images = new HashMap<>();
    }

    public Drawable getDrawable(String image){
        if (!images.containsKey(image)){
            switch (image){
                case "river" :
                    images.put(image , new River());
                    break;
                case "grass" :
                    images.put(image , new Grass());
                    break;
            }
        }

        return images.get(image);
    }

}
