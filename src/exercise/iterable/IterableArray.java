package exercise.iterable;
import exercise.interfaces.interfaceIterable;

public class IterableArray implements interfaceIterable{
    
    private int[] array;
    private int index;

    //costruttori
    public IterableArray(){
        this.index = 0; 
    }

    public IterableArray(int[] list){
        this.array = list;
        this.index = 0;
    }
    //getter setter
    public int[] getList() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addElement(int num){
        int[] array = new int[this.array.length+1];
        
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }

        array[array.length-1] = num;
        this.array = array;
    }

    //override dei metodi implementati dall'interfaccia
    @Override
    public int getNextElement() {
        if(index <=  this.array.length){
           index+=1;
           return this.array[index-1]; 
        }else{
            return -1;
        }  
    }

    @Override
    public boolean hasOtherElement() {
        if(index == this.array.length){
           return false; 
        }else{
           return true;
        }  
    }

    @Override
    public String toString() {
        String str="";
        for (int i : array) {
          str += i +" "; 
        };
        return str;
    }
}
