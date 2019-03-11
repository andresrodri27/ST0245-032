
import java.util.Arrays;
public class myArrayList{
    public int elements[];
    public static final int DEFAULT_CAPACITY = 10;
    public int size;
 

    public myArrayList(){
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public void add(int a) {
        elements[size]=a;
        size = size+1;
    }

    public void addOutOfBounds(int index, int a) throws ArrayIndexOutOfBoundsException{
        if(index<=size) {
            for(int i = size+1;i>index;i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=a;
        }else {
            throw new ArrayIndexOutOfBoundsException("Index overpass capacity");
        }
    }

    public void createNewArray(int index,int a) throws ArrayIndexOutOfBoundsException{
        if(index== elements.length+1){
            elements = new int[DEFAULT_CAPACITY*2];
            elements[index]=a;
        }else{
            throw new ArrayIndexOutOfBoundsException("Index overpass capacity");
        }
    }

    public void deleteFromArray(int index){ 
        elements[index]=0;
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        size=size-1;   
    }
}
