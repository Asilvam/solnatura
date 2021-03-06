package controller.modelos;
// Generated 29-03-2018 17:38:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name="producto"
    ,schema="solnatura"
)
public class Producto  implements java.io.Serializable {


     private int id;
     private String nombreProducto;
     private Integer codigoProducto;
     private String imagenProducto;

    public Producto() {
    }

	
    public Producto(int id) {
        this.id = id;
    }
    public Producto(int id, String nombreProducto, Integer codigoProducto, String imagenProducto) {
       this.id = id;
       this.nombreProducto = nombreProducto;
       this.codigoProducto = codigoProducto;
       this.imagenProducto = imagenProducto;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre_producto", length=50)
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    @Column(name="codigo_producto")
    public Integer getCodigoProducto() {
        return this.codigoProducto;
    }
    
    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    
    @Column(name="imagen_producto", length=50)
    public String getImagenProducto() {
        return this.imagenProducto;
    }
    
    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }




}


