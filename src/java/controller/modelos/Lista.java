package controller.modelos;
// Generated 29-03-2018 17:38:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="lista"
    ,schema="solnatura"
)
public class Lista  implements java.io.Serializable {


     private int id;
     private String tabla;
     private String campo;
     private String valor;
     private Integer codTupla;

    public Lista() {
    }

	
    public Lista(int id) {
        this.id = id;
    }
    public Lista(int id, String tabla, String campo, String valor, Integer codTupla) {
       this.id = id;
       this.tabla = tabla;
       this.campo = campo;
       this.valor = valor;
       this.codTupla = codTupla;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="tabla", length=20)
    public String getTabla() {
        return this.tabla;
    }
    
    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    
    @Column(name="campo", length=20)
    public String getCampo() {
        return this.campo;
    }
    
    public void setCampo(String campo) {
        this.campo = campo;
    }

    
    @Column(name="valor", length=20)
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }

    
    @Column(name="cod_tupla")
    public Integer getCodTupla() {
        return this.codTupla;
    }
    
    public void setCodTupla(Integer codTupla) {
        this.codTupla = codTupla;
    }




}


