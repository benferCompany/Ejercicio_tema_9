public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Benjamin");
        cliente.setEdad(32);
        cliente.setTelefono("3624230777");
        cliente.setCredito(380000);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Fernanda");
        trabajador.setEdad(33);
        trabajador.setTelefono("3624519547");
        trabajador.setSalario(180000);

        System.out.println("Nombre: "+cliente.getNombre()+" Edad: "+cliente.getEdad()+" Telefono: "+cliente.getTelefono()+" Credito: "+cliente.getCredito());
        System.out.println("Nombre: "+trabajador.getNombre()+" Edad: "+trabajador.getEdad()+" Telefono: "+trabajador.getTelefono()+" Salario: "+trabajador.getSalario());


    }



}

