package Cliente;

import java.net.*;
import java.io.*;

public class Client {
	
	final String HOST = "localhost";
	final int PUERTO=5000;
	Socket miCliente;
	DataOutputStream mensaje;
	DataInputStream entrada;

	//Cliente


	public void intClient(String dato){ /*ejecuta este metodo para correr el cliente */

		try{

			miCliente = new Socket( HOST , PUERTO );/*conectar a un servidor en localhost con puerto 5000*/
			
			//creamos el flujo de datos por el que se enviara un mensaje
			mensaje= new DataOutputStream(miCliente.getOutputStream());
			
			//enviamos el mensaje
			mensaje.writeUTF(dato);

			//cerramos la conexión
			miCliente.close();
			
			
		}
		catch(Exception e ){
			System.out.println("Error: "+e.getMessage());
		}

	}


}

