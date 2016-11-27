package Application.Domain;

import java.io.Serializable;

public class User implements Serializable {   
   /**
    * 
    */
   private static final long serialVersionUID = -6365743330089212031L;
   
   private String id;
   private String pwd;
   private String name = null;
   
    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}