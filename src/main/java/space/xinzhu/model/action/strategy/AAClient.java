package space.xinzhu.model.action.strategy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Addition());
        System.out.println(calculator.getResult(1 , 1));
        calculator.setStrategy(new Subtraction());
        System.out.println(calculator.getResult(1 , 1));
    }
}
