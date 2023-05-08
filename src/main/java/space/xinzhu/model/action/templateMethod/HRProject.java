package space.xinzhu.model.action.templateMethod;

import java.util.Random;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class HRProject extends PM{

    private Random random = new Random();


    @Override
    public String analyze() {
        System.out.println("analyze...");

        return "HRProject requirements";
    }

    @Override
    public String design(String project) {
        System.out.println("design...");

        return "design[" + project + "]";
    }

    @Override
    public String develop(String project) {

        if(project.contains("bug")){
            System.out.println(" bug.....");
            project = project.replaceAll("bug" , "");
            project = "debuug[" + project + "]";
            if (random.nextBoolean()){
                project += "bug";
            }
        }


        System.out.println("develop...");
        if (random.nextBoolean()){
            project += "bug";
        }

        return "develop[" + project + "]";
    }

    @Override
    public boolean test(String project) {
        if (project.contains("bug")){
            System.out.println("test::bug");
            return false;
        }

        System.out.println("test::ok");
        return true;
    }

    @Override
    public void release(String code) {

        System.out.println("release");
        System.out.println("...==============...");
        System.out.println(code);
        System.out.println("...==============...");

    }
}
