package space.xinzhu.model.action.state;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {

/*        Switcher s = new Switcher();
        s.switchOff();
        s.switchOn();
        s.switchOn();
        s.switchOff();*/

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
    }
}
