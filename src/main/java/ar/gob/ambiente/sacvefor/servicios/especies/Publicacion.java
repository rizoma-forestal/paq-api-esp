
package ar.gob.ambiente.sacvefor.servicios.especies;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular las publicaciones provenientes del servicio de especies
 * extiende de la clase Paramétrica
 * @author rincostante
 */
@XmlRootElement(name = "publicacion")
public class Publicacion extends Parametrica implements Serializable{

    private int anio;    
 
    /******************
     * Constructores **
     ******************/       
    public Publicacion(){
        super.setId(Long.valueOf(0));
        super.setNombre("default");
        this.anio = 0;
    }
    
    public Publicacion(Long id, String nombre, int anio){
        super.setId(id);
        super.setNombre(nombre);
        this.anio = anio;
    }

    /**********************
     * Métodos de acceso **
     **********************/      
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**************************
     * Métodos sobreescritos **
     **************************/  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (super.getId() != null ? super.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((super.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(super.getId()).
                append(" nombre: ").append(super.getNombre()).
                append(" anio: ").append(anio).toString();
    }
    
}
