package buap.intro_programacion.models;

//Rey
public class Direccion {

    private String calle;
    private String colonia;
    private Integer codigoPostal;
    private String ciudad;

    public Direccion(String calle, String colonia, Integer codigoPostal, String ciudad) {
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public Direccion() {

    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{"
                + "calle='" + calle + '\''
                + ", colonia='" + colonia + '\''
                + ", codigoPostal=" + codigoPostal
                + ", ciudad='" + ciudad + '\''
                + '}';
    }
}
