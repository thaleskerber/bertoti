package padraocomposite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
   
    private List<Component> children = new ArrayList<>();
    
    public void addChildren(Component c){
        children.add(c);
    }
    
    public void execute(){
        children.forEach(item -> {
            item.execute();
        });
    }
}
