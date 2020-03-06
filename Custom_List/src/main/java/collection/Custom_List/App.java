package collection.Custom_List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class App
{private static final Logger log=LogManager.getLogger(App.class);
    public static void main(String[] args) 
    {
    	CustomList list = new CustomList();
 
   
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("hello");
        list.add(2.5);
        log.info(list);
        list.remove(0);
        list.remove(list.size-1);
        log.info(list);
         
        log.info( list.get(0) );
        log.info( list.get(5) );
        list.add(10);
        log.info(list.get(3));
        list.remove(3);
        log.info(list.get(3));
        list.remove(7);
 
     
    }
}
 


