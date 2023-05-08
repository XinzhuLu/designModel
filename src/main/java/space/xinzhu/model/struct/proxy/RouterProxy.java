package space.xinzhu.model.struct.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class RouterProxy implements Internet{

    private Internet modem;

    //private List<String> blackList = Arrays.asList("movie" , "game" , "music" , "novel");

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");
    }

/*    @Override
    public void httpAccess(String url) {
        for (String keyword : blackList){
            if (url.contains(keyword)){
                System.out.println("禁止訪問" + url);
                return;
            }
        }

        modem.httpAccess(url);
    }*/
        @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}
