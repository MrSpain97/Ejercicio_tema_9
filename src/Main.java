public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(25);
        cliente1.setTelefono(617787780);
        cliente1.setNombre("David");
        cliente1.setCredito(2500);

        System.out.println("Edad: "+cliente1.getEdad()+"\n"
                +cliente1.getNombre()+"\n"
                +"Telefono: "+cliente1.getTelefono()+"\n"
                +"Credito"+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(25);
        trabajador1.setTelefono(617787780);
        trabajador1.setNombre("David");
        trabajador1.setSalario(1900);


        System.out.println("Edad: "+trabajador1.getEdad()+"\n"
                +trabajador1.getNombre()+"\n"
                +"Telefono: "+trabajador1.getTelefono()+"\n"
                +"Salario"+trabajador1.getSalario());


    }
}