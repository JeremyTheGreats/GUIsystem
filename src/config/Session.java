
package config;


public class Session {
    
    private static Session instance;

    
    private int id;
    private String fullname;
    private String email;
    private String role;
    private String status;
    
        private Session (){

        }
        
        public static Session getInstance(){
            
            if (instance == null) {
            instance = new Session();
        }
            
            return instance;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
    
    
    
}
