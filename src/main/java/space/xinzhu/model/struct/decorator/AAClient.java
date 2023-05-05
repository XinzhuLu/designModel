package space.xinzhu.model.struct.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipInputStream;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) throws FileNotFoundException {
        //new Decorator(new Girl()).show();

        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();

        File file = new File("/abc.zip");
        ZipInputStream zipInputStream = new ZipInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)
                )
        );
    }
}
