public class PruebaConsola {
    public static void main(String[] args) {
        // Crear un objeto de tipo ConsolaDeVideoJuegos e inicializarlo con el constructor
        ConsolaDeVideoJuegos miConsola = new ConsolaDeVideoJuegos("Microsoft", "Xbox", "1TB");

        // Invocar los métodos encender() y apagar()
        System.out.println("--- PRUEBA DE CONSOLA ---");
        miConsola.encender();
        miConsola.apagar();
    }
}
