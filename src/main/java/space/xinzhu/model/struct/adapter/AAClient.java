package space.xinzhu.model.struct.adapter;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {

        //TriplePin triplePin = new TV();

        DualPin dualPinDevice = new TV();
        TriplePin triplePinDevice = new Adapter(dualPinDevice);

        triplePinDevice.electrify(1,0,-1);

        System.out.println("------------类适配器--------------");

        TriplePin tvAdapter = new TVAdapter();
        tvAdapter.electrify(1 , 0 , -1);

    }
}
