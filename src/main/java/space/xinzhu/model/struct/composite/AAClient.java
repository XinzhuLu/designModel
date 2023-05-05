package space.xinzhu.model.struct.composite;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {

        Node driveD = new Folder("Ddrive");
        Node doc = new Folder("someFolder");
        doc.add(new File("summary.doc"));
        doc.add(new File("project.doc"));

        driveD.add(doc);

        Node music = new Folder("music");

        Node jay = new Folder("jay");
        Node jack = new Folder("jack");

        jay.add(new File("songA.mp3"));
        jay.add(new File("songB.mp3"));
        jack.add(new File("song1.mp3"));
        jack.add(new File("song2.mp3"));

        music.add(jack);
        music.add(jay);

        driveD.add(music);

        driveD.tree();
    }

}
