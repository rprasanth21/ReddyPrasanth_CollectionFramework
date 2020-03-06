package collection.Custom_List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class CustomList
{
private static final Logger log=LogManager.getLogger(CustomList.class);
 int size = 0;
     static final int capacity = 10;
     Object data_array[];
 
    public CustomList() {
        data_array = new Object[capacity];
    }
 
    
    public void add(Object o) {
        if (size == data_array.length) {
        	 int newsize = data_array.length+capacity;
             Object[] newArray=new Object[newsize];
             for(int i=0;i<data_array.length;i++)
             {
            	 newArray[i]=data_array[i];
             }
             data_array=newArray;
        }
        data_array[size] = o;++size;
    }
  
     
    public Object remove(int i) {
        if (i<0 || i>size-1) {
 
        log.info("Index out of Range Exception While Removing an Element");
        return null;
        }
        Object del_element = data_array[i];
        System.arraycopy(data_array,i+1,data_array,i,data_array.length-i-1);
      
        size--;
        return del_element;
    }
     
    public Object get(int i) {
        if (i >= size || i < 0) {
           return ("Index Out Of Bounds Exception Raised While Fetching an Element");
           
        }
        return data_array[i];
    }
   

    public String toString()                  //this is print method
    {
         String s ="";
         s=s+'[';
         for(int i = 0; i < size ;i++) {
        	 if(i!=size-1) {
             s=s+data_array[i].toString()+",";
        	 }
        	 else
        	 {
        		 s=s+data_array[i].toString()+']'; 
        	 }
        	 
            }
         
         return s;
    }    
   
}
 


