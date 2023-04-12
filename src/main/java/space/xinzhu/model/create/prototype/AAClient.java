package space.xinzhu.model.create.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        List<EnemyPlane> enemyPlanes = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
            enemyPlanes.add(ep);
        }
    }
}
