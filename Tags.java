
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;


/**
 *
 * @author rahil
 */
@ManagedBean
@SessionScoped
public class Tags implements Serializable{
    
    //array of strings for tags
    private String[] addedTags;
    
    //constructor
    public Tags() {
        
    }
        
    //getter and setter methods
    public String[] getAddedTags() {
        return addedTags;
    }

    public void setAddedTags(String[] addedTags) {
        this.addedTags = addedTags;
    }   
    
    
}
