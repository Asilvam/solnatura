
package controller.modelos;

public class Usuario {
    
    private int id;
    private String pass;
    private String tipo;
    private String user;
    private String email;

    public Usuario() {
    }

    
    public Usuario(int id, String pass, String tipo, String user, String email) {
        this.id = id;
        this.pass = pass;
        this.tipo = tipo;
        this.user = user;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
