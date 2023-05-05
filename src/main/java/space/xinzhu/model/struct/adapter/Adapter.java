package space.xinzhu.model.struct.adapter;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Adapter implements TriplePin{

    private DualPin dualPinDevice;

    public Adapter(DualPin dualPinDevice){
        this.dualPinDevice = dualPinDevice;
    }
    @Override
    public void electrify(int l, int n, int e) {
        dualPinDevice.electrify(l , n);
    }
}
