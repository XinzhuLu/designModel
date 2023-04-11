package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AlienFactory implements AbstractFactory{

    public int x ;
    public int y ;

    public AlienFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit cteateLowClass() {
        LowClassUnit unit = new Roach(x , y);
        System.out.println("制造蟑螂成功");
        return unit;
    }

    @Override
    public MidClassUnit cteateMidClass() {
        MidClassUnit unit = new Poison(x , y);
        System.out.println("制造毒液成功");
        return unit;    }

    @Override
    public HithClassUnit cteateHithClass() {
        HithClassUnit unit = new Mamoth(x , y);
        System.out.println("制造猛犸成功");
        return unit;
    }

}
