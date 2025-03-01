package exercise.iterable;
import java.lang.reflect.Array;
import exercise.interfaces.interfaceIterable;

public class IterableArray implements interfaceIterable{
    
    private int[] list;
    private int index;

    //costruttori
    public IterableArray(){}
    public IterableArray(int[] list){
        this.list = list;
        this.index = 0;
    }
    //getter setter
    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addElement(int num){
        int[] array = new int[list.length+1];

        for (int i = 0; i < list.length; i++) {
            array[i] = list[i];
        }

        array[list.length-1] = num;
        list = array;
    }

    //override dei metodi implementati dall'interfaccia
    @Override
    public int getNextElement() {
        if(index <= Array.getLength(list)){
           index+=1;
           return list[index-1]; 
        }else{
            return 00;
        }  
    }

    @Override
    public boolean hasOtherElement() {
        if(index == Array.getLength(list)){
            return false; 
         }else{
            return true;
         }  
    }
}
