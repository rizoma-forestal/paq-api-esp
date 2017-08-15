

package ar.gob.ambiente.sacvefor.servicios.especies;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Géneros provenientes del servicio de especies
 * @author rincostante
 */
@XmlRootElement(name = "genero")
public class Genero implements Serializable {

    private Long id;
    private String nombre;
    private Familia familia;  
    private boolean esSacvefor;    

    /******************
     * Constructores **
     ******************/    
    public Genero(){
        this.id = Long.valueOf(0);
        this.nombre = "default";
        this.familia = new Familia();
        this.esSacvefor = true;
    }
    
    public Genero(Long id, String nombre, Familia familia, boolean esSacvefor){
        this.id = id;
        this.nombre = nombre;
        this.familia = familia;
        this.esSacvefor = esSacvefor;
    }    

    /**********************
     * Métodos de acceso **
     **********************/       
    public boolean isEsSacvefor() {
        return esSacvefor;
    }

    public void setEsSacvefor(boolean esSacvefor) {
        this.esSacvefor = esSacvefor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**************************
     * Métodos sobreescritos **
     **************************/       
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" nombre: ").append(nombre).
                append(" familia: ").append(familia.getNombre()).
                append(" esSacvefor: ").append(esSacvefor).toString();
    }
}
 