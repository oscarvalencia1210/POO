public class ConsolaDeVideoJuegos {
    // 1. Declaración de atributos
    private String marca;
    private String modelo;
    private String almacenamiento;

    // 2. Constructor para inicializar los atributos
    public ConsolaDeVideoJuegos(String marca, String modelo, String almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
    }

    // 3. Método para encender la consola
    public void encender() {
        System.out.println("Iniciando sistema...");
        System.out.println("La consola " + marca + " " + modelo + " con " + almacenamiento + " de almacenamiento esta encendiendo.");
    }

    // 4. Método para apagar la consola
    public void apagar() {
        System.out.println("Cerrando sesion...");
        System.out.println("La consola " + marca + " " + modelo + " con " + almacenamiento + " de almacenamiento se esta apagando.");
    }
}