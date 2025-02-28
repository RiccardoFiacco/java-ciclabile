package exercise.iterable;
import java.lang.reflect.Array;
import exercise.interfaces.interfaceIterable;

public class IterableArray implements interfaceIterable{
    
    private int[] list;
    private int index;
    
    public IterableArray(int[] list){
        this.list = list;
        this.index = 0;
    }
    
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
