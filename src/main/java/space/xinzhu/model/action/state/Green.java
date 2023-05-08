package space.xinzhu.model.action.state;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Green implements State{

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("ERROR");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("OK");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("ERROR");
    }
}
