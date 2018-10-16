package aop;

import java.io.PrintStream;

/**
 * 吟游诗人---用诗歌记载骑士的事迹
 */
public class Minsrel {

    private PrintStream stream;
    public Minsrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight did embark on a quest!");
    }

}
