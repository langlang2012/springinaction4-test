package mock;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

public class MockTest {


    public static final void main(String args[]){
        // 模拟LinkedList 的一个对象
        LinkedList mockedList = mock(LinkedList.class);

        // 此时调用get方法，会返回null，因为还没有对方法调用的返回值做模拟
        System.out.println(mockedList.get(0));

        // 模拟获取第一个元素时，返回字符串first。  给特定的方法调用返回固定值在官方说法中称为stub。
        when(mockedList.get(0)).thenReturn("first");
        // 此时打印输出first
        System.out.println(mockedList.get(0));
    }

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class); //创建mock Quest
        BraveKnight knight = new BraveKnight(mockQuest); //注入mock Quest
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();

    }
}
