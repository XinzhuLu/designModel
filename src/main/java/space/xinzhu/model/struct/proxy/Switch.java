package space.xinzhu.model.struct.proxy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Switch implements Intranet{
    @Override
    public void fileAccess(String path) {
        System.out.println("訪問内網" + path);
    }
}
