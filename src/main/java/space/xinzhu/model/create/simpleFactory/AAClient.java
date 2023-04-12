package space.xinzhu.model.create.simpleFactory;

import java.util.Random;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {

        int screenWidth = 100;
        System.out.println("游戏开始");
        int x = new Random().nextInt(screenWidth);
        Enemy airplane = new Airplane(x, 0);
        airplane.show();

        x = new Random().nextInt(screenWidth);
        Enemy tank = new Tank(x , 0);
        tank.show();

        System.out.println("---------------------------------------");
        SimpeFactory simpeFactory = new SimpeFactory(100);
        simpeFactory.create("Airplane").show();
        simpeFactory.create("Tank").show();

    }
}
