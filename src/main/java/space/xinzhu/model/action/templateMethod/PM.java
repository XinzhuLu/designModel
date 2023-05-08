package space.xinzhu.model.action.templateMethod;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public abstract class PM {

    public abstract String analyze();
    public abstract String design(String project);
    public abstract String develop(String project);
    public abstract boolean test(String project);
    public abstract void release(String code);

    protected final void kickoff(){
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        }while (!test(designCode));

        release(designCode);
    }
}
