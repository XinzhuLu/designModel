package space.xinzhu.model.action.state;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Yellow implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        trafficLight.setState(new Green());
        System.out.println("OK");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("ERROR");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        trafficLight.setState(new Red());
        System.out.println("Ok");
    }
}
