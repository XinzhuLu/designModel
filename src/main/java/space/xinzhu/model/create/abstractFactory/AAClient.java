package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        System.out.println("游戏开始");
        System.out.println("双方挖矿赚钱");

        System.out.println("--------------------------------");
        System.out.println("建造人族工厂");
        AbstractFactory factory = new HumanFactory(10 ,10);

        LowClassUnit marine = factory.cteateLowClass();
        marine.show();

        MidClassUnit tank = factory.cteateMidClass();
        tank.show();

        HithClassUnit battleship = factory.cteateHithClass();
        battleship.show();

        System.out.println("--------------------------------");
        System.out.println("虫族建造工厂");
        factory = new AlienFactory(200 ,200);
        LowClassUnit roach = factory.cteateLowClass();
        roach.show();

        MidClassUnit poison = factory.cteateMidClass();
        poison.show();

        HithClassUnit mammoth = factory.cteateHithClass();
        mammoth.show();

        System.out.println("两族开始混战");

        marine.attack();
        tank.attack();
        battleship.attack();
        roach.attack();
        poison.attack();
        mammoth.attack();

    }
}
