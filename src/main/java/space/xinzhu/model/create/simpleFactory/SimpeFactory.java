package space.xinzhu.model.create.simpleFactory;

import java.util.Random;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class SimpeFactory {

    private int screenWidth;
    private Random random;

    public SimpeFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    public Enemy create(String type){
        int x = random.nextInt(screenWidth);
        Enemy enemy = null;
        switch (type){
            case "Airplane" :
                enemy = new Airplane(x , 0);
                break;
            case "Tank" :
                enemy = new Tank(x , 0);
                break;
        }
        return enemy;
    }
}
