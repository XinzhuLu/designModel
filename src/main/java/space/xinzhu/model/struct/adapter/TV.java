package space.xinzhu.model.struct.adapter;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class TV implements DualPin {

    @Override
    public void electrify(int l, int n) {
        System.out.println("fire:" + l + ",zero:" + n);
        System.out.println("TV turn on");
    }
}
