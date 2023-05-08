package space.xinzhu.model.struct.proxy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Modem implements Internet{

    public Modem(String password) throws Exception {
        if(!"123456".equals(password)){
            throw new Exception("撥號失敗");
        }
        System.out.println("撥號成功");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在訪問" + url);
    }
}
