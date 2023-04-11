package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class HumanFactory implements AbstractFactory {

    public int x ;
    public int y ;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit cteateLowClass() {
        LowClassUnit unit = new Marine(x , y);
        System.out.println("制造海军成功");
        return unit;
    }

    @Override
    public MidClassUnit cteateMidClass() {
        MidClassUnit unit = new Tank(x , y);
        System.out.println("制造坦克成功");
        return unit;    }

    @Override
    public HithClassUnit cteateHithClass() {
        HithClassUnit unit = new Battleship(x , y);
        System.out.println("制造战舰成功");
        return unit;
    }
}
