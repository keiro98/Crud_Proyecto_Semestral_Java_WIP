
package capaEntidades;


public class Cliente {
    
    private int IDCliente;
    private String rutCliente;
    private String pNombreCliente;
    private String sNombreCliente;
    private String apPatCliente;
    private String apMatCliente;
    private int telefonoCliente;
    private String emailCliente;

    public Cliente() {
    }

    public Cliente(int IDCliente, String rutCliente, String pNombreCliente, String sNombreCliente, String apPatCliente, String apMatCliente, int telefonoCliente, String emailCliente) {
        this.IDCliente = IDCliente;
        this.rutCliente = rutCliente;
        this.pNombreCliente = pNombreCliente;
        this.sNombreCliente = sNombreCliente;
        this.apPatCliente = apPatCliente;
        this.apMatCliente = apMatCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getpNombreCliente() {
        return pNombreCliente;
    }

    public void setpNombreCliente(String pNombreCliente) {
        this.pNombreCliente = pNombreCliente;
    }

    public String getsNombreCliente() {
        return sNombreCliente;
    }

    public void setsNombreCliente(String sNombreCliente) {
        this.sNombreCliente = sNombreCliente;
    }

    public String getApPatCliente() {
        return apPatCliente;
    }

    public void setApPatCliente(String apPatCliente) {
        this.apPatCliente = apPatCliente;
    }

    public String getApMatCliente() {
        return apMatCliente;
    }

    public void setApMatCliente(String apMatCliente) {
        this.apMatCliente = apMatCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IDCliente=" + IDCliente + ", rutCliente=" + rutCliente + ", pNombreCliente=" + pNombreCliente + ", sNombreCliente=" + sNombreCliente + ", apPatCliente=" + apPatCliente + ", apMatCliente=" + apMatCliente + ", telefonoCliente=" + telefonoCliente + ", emailCliente=" + emailCliente + '}';
    }
    
}
