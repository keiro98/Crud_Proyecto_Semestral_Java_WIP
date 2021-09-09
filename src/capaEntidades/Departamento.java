
package capaEntidades;


public class Departamento {
    private int IDDepartamento;
    private String nombCiudadDepartamento;
    private String direccionDepartamento;

    public Departamento() {
    }

    public Departamento(int IDDepartamento, String nombCiudadDepartamento, String direccionDepartamento) {
        this.IDDepartamento = IDDepartamento;
        this.nombCiudadDepartamento = nombCiudadDepartamento;
        this.direccionDepartamento = direccionDepartamento;
    }

    public int getIDDepartamento() {
        return IDDepartamento;
    }

    public void setIDDepartamento(int IDDepartamento) {
        this.IDDepartamento = IDDepartamento;
    }

    public String getNombCiudadDepartamento() {
        return nombCiudadDepartamento;
    }

    public void setNombCiudadDepartamento(String nombCiudadDepartamento) {
        this.nombCiudadDepartamento = nombCiudadDepartamento;
    }

    public String getDireccionDepartamento() {
        return direccionDepartamento;
    }

    public void setDireccionDepartamento(String direccionDepartamento) {
        this.direccionDepartamento = direccionDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "IDDepartamento=" + IDDepartamento + ", nombCiudadDepartamento=" + nombCiudadDepartamento + ", direccionDepartamento=" + direccionDepartamento + '}';
    }
    
}
