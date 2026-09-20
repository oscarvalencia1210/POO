import java.util.*;
public class Ejercicio1
{
	public static class Usuarios{
	/*atributos*/
	private String nombre;
	private String apellido;
	private String id;
	private String contraseña;
	private String tipo;

	/*metodos*/
	public void registro(){
		System.out.println("registrando usuario");
		}
		public void mostrarDatos(){
			System.out.println("nombre: "+nombre+"\n");
			System.out.println("apellido: "+apellido+"\n");
			System.out.println("id: "+id+"\n");
			System.out.println("contraseña: "+contraseña+"\n");
			System.out.println("tipo: "+tipo+"\n");
		}

		/*construir metodo de inicio de sesion */
		public boolean inicioSesion(String id, String contraseña){
			if(this.id.equals(id)&& this.contraseña.equals(contraseña))
				return true;
		else
			return false;
		}

		Usuarios(String n, String a, String i, String c, String t){
			this.nombre=n;
			this.apellido=a;
			this.id=i;
			this.contraseña=c;
			this.tipo=t;
		}
    }

public static void main(String[] arg) {
	Scanner lecturaTeclado = new Scanner(System.in);

	System.out.println(" clase usuarios");
	/*instanciacion de objetos*/
	/*creacion de objeto estudiante x */
	Usuarios estudiantex=new Usuarios("Oscar", "Valencia", "valencia@gmail.com", "1234", "estudiante");
	/*Ingresando al sistema */
	String id, contraseña;
		System.out.println("Inicio de sesion \n");
		System.out.println("Ingresa tu id \n");
		id = lecturaTeclado.nextLine();
		System.out.println("Ingresa tu contraseña \n");
		contraseña = lecturaTeclado.nextLine();
		if(estudiantex.inicioSesion(id, contraseña)== true)
		{
			System.out.println("Inicio de sesion exitoso \n");
		/*mostramos los datos */
		estudiantex.mostrarDatos();
		}else
		{
			System.out.println("Error en los datos");
		}

    }
	
}
/*buscar propiedad de agregacion en un diagrama de clases*/
/*es una relación de asociación débil que indica que una clase es parte de otra, pero los objetos componentes pueden existir de forma independiente */
/*sintaxis para entrada/lectura de datos desde teclado para java*/
/* */