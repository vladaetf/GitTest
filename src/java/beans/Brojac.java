
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "brojac")
@Dependent
public class Brojac {

    
    
    public Brojac() {
    }
    
    public String poruka(){
        return "Nova poruka iz brojaca";
    }
    
}
