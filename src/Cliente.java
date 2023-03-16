public class Cliente extends  Persona{
    private int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super();
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Cliente() {
        super();
    }
}
