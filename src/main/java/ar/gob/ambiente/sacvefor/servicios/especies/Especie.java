

package ar.gob.ambiente.sacvefor.servicios.especies;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Clase para manipular las Especies provenientes del servicio de especies
 * @author rincostante
 */
@XmlRootElement(name = "especie")
public class Especie implements Serializable {

    private Long id;
    private String nombre;   
    private Genero genero;
    

    private Parametrica autorEspecie;    
    private Parametrica autores;      
    private Parametrica cites;
    private Parametrica morfologia;
    private Parametrica origen;
    private Publicacion publicacion; 
    private Parametrica rango;    
    
    private String subEspecie;   
    private String sinonimo;    
    private boolean esSacvefor;
    private String nombrecientifico;
    private String nombreCompleto;
    
    
    

    public boolean isEsSacvefor() {
        return esSacvefor;
    }

    public void setEsSacvefor(boolean esSacvefor) {
        this.esSacvefor = esSacvefor;
    }
    
    public String getNombreCompleto() {
        nombreCompleto = getGenero().getFamilia().getNombre() + " " + getGenero().getNombre() + " " + getNombre();
        if(this.autorEspecie != null){
            nombreCompleto = nombreCompleto + " " + getAutorEspecie().getNombre();
        }
        if(this.subEspecie != null){
            nombreCompleto = nombreCompleto + " " + getSubEspecie();
        }
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }    

    public Parametrica getAutorEspecie() {
        return autorEspecie;
    }

    public void setAutorEspecie(Parametrica autorEspecie) {
        this.autorEspecie = autorEspecie;
    }

    public Parametrica getAutores() {
        return autores;
    }

    public void setAutores(Parametrica autores) {
        this.autores = autores;
    }

    public Parametrica getCites() {
        return cites;
    }

    public void setCites(Parametrica cites) {
        this.cites = cites;
    }

    public Parametrica getMorfologia() {
        return morfologia;
    }

    public void setMorfologia(Parametrica morfologia) {
        this.morfologia = morfologia;
    }

    public Parametrica getOrigen() {
        return origen;
    }

    public void setOrigen(Parametrica origen) {
        this.origen = origen;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Parametrica getRango() {
        return rango;
    }

    public void setRango(Parametrica rango) {
        this.rango = rango;
    }

    public String getSubEspecie() {
        return subEspecie;
    }

    public void setSubEspecie(String subEspecie) {
        this.subEspecie = subEspecie;
    }

    public String getSinonimo() {
        return sinonimo;
    }

    public void setSinonimo(String sinonimo) {
        this.sinonimo = sinonimo;
    }

    public String getNombrecientifico() {
        return genero.getNombre()+ " " + getNombre();
    }

    public void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especie)) {
            return false;
        }
        Especie other = (Especie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.servicios.especiesforestales.entidades.Especie[ id=" + id + " ]";
    }
    
}
