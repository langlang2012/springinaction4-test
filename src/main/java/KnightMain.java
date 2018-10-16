import org.springframework.context.support.ClassPathXmlApplicationContext;
import mock.Knight;

public class KnightMain {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight) context.getBean("knight");//.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
