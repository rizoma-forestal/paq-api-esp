

package ar.gob.ambiente.sacvefor.servicios.especies;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular las Familias provenientes del servicio de especies
 * @author rincostante
 */
@XmlRootElement(name = "familia")
public class Familia implements Serializable {

    private Long id;
    private String nombre;
    private String subFamilia;     
    private boolean esSacvefor;    

    /******************
     * Constructores **
     ******************/
    public Familia(){
        this.id = Long.valueOf(0);
        this.nombre = "dafault";
        this.subFamilia = "default";
        this.esSacvefor = true;
    }
    
    public Familia(Long id, String nombre, String subFamilia, boolean esSacvefor){
        this.id = id;
        this.nombre = nombre;
        this.subFamilia = subFamilia;
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

    public String getSubFamilia() {
        return subFamilia;
    }

    public void setSubFamilia(String subFamilia) {
        this.subFamilia = subFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof Familia)) {
            return false;
        }
        Familia other = (Familia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" nombre: ").append(nombre).
                append(" subFamilia: ").append(subFamilia).
                append(" esSacvefor: ").append(esSacvefor).toString();
    }
}
