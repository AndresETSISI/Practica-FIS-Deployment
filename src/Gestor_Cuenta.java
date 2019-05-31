import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Gestor_Cuenta.java
//  @ Date : 30/05/2019
//  @ Author : 
//
//




/** */
public class Gestor_Cuenta
{
  /** */
  private ArrayList<Cuenta> cuentas;
  
  /** */
  private Servidor_UPM Servidor_UPM;
  
  
  
  /** */
  public Gestor_Cuenta()
  {
	  cuentas = new ArrayList<Cuenta>();
	  
	  //Servidor_UPM = new Servidor_UPM();
  }
  
  public ArrayList<Cuenta> getCuentas() {
	return cuentas;
}

public void setCuentas(ArrayList<Cuenta> cuentas) {
	this.cuentas = cuentas;
}

public Servidor_UPM getServidor_UPM() {
	return Servidor_UPM;
}

public void setServidor_UPM(Servidor_UPM servidor_UPM) {
	Servidor_UPM = servidor_UPM;
}

/** */
  public void Login(String Alias, String Contrase�a)
  {
  
  }
  
  /** */
  public void Alta()
  {
	  //Creamos Directorio root del JSON donde vamos a a�adir las cuentas
	  JSONArray lista_usuarios = new JSONArray();
	 
	  //Damos de alta una cuenta
	  cuentas.add(new Cuenta());
	  
	  //Creamos el iterator de cuentas
	  Iterator<Cuenta> iter = cuentas.iterator();
	  
	  //A�adimos todas las cuentas al directorio root del JSON
	  while(iter.hasNext()) {
		 lista_usuarios.add(iter.next().guardarDatos());
	  }
	  
	  //Actualizamos la informaci�n en el fichero JSON
	  try(FileWriter file = new FileWriter("Usuarios.json")){
			file.write(lista_usuarios.toJSONString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	  
  }
  
 
  /** */
  public void RemoveCuenta(Cuenta cuenta)
  {
  
  }
  
  /** */
  public Boolean Comprobar_Correo_Registrado(String correo)
  {
	return null;
  
  }
  
  /** */
  public void Cambiar_Contrasenia(String contrasenia1, String contrasenia2)
  {
  
  }
  
  
  /** */
  public void Destroy()
  {
  
  }
}
