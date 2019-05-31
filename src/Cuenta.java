import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Cuenta.java
//  @ Date : 30/05/2019
//  @ Author : 
//
//




/** */
public class Cuenta
{
	
  private Scanner scan = new Scanner(System.in);
  /** */
  private String correo;
  
  /** */
  private String alias;
  
  /** */
  private String contrasenia;
  
  /** */
  private ArrayList<Comunidad> comunidades;
  
  /** */
  private ArrayList<Publicacion> publicaciones;
  
  /** */
  private ArrayList<Comentario> comentarios;
  
  /** */
  private ArrayList<Cuenta> usuarios;
  
  /** */
  private Factory_Publicacion factoryPublicacion;
  
  private boolean logged_in;
  
  /** */
  public Cuenta() //contructor de cuenta
  {
	  System.out.println("Escriba Alias:");
	  this.alias = scan.nextLine();
	  System.out.println("Escriba Correo:");
	  this.correo = scan.nextLine();
	  System.out.println("Escriba Contrasenia:");
	  this.contrasenia = scan.nextLine();
	  this.comunidades = new ArrayList<Comunidad>();
	  this.publicaciones = new ArrayList<Publicacion>();
	  this.comentarios = new ArrayList<Comentario>();
	  this.usuarios = new ArrayList<Cuenta>();
	  //this.factoryPublicacion = new Factory_Publicion();
	  this.logged_in = false;
	  
	  
	  
	}
  
  	/** */
  	public Cuenta(String alias, String correo, String contrasenia,ArrayList<Comunidad> comunidades,ArrayList<Publicacion> publicaciones,ArrayList<Comentario> comentarios ,ArrayList<Cuenta> usuarios) //Segundo contructor de cuenta
  	{
	 
	  this.alias = alias;
	  this.correo = correo;
	  this.contrasenia = contrasenia;
	  this.comunidades = comunidades;
	  this.publicaciones = publicaciones;
	  this.comentarios = comentarios;
	  this.usuarios = null;
	  //this.factoryPublicacion = new Factory_Publicion();
	  this.logged_in = false;
	 }
  
  public JSONObject guardarDatos() { //crea el formato JSON de las cuentas y lo devuelve
	  
	  
	  JSONObject usuario = new JSONObject();
		usuario.put("alias", this.alias);
		usuario.put("correo", this.correo);
		usuario.put("contrasenia", this.contrasenia);
		usuario.put("Comunidades", comunidades);
		usuario.put("publicaciones", publicaciones);
		usuario.put("comentarios", comentarios);
		usuario.put("usuarios", usuarios);
		
		
		
		return usuario;
			
  }
  
  
  
  public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	correo = correo;
}

public String getAlias() {
	return alias;
}

public void setAlias(String alias) {
	alias = alias;
}

public String getContrasenia() {
	return contrasenia;
}

public void setContrasenia(String contrasenia) {
	contrasenia = contrasenia;
}

public ArrayList<Comunidad> getComunidades() {
	return comunidades;
}

public void setComunidades(Comunidad comunidades) {
	comunidades = comunidades;
}

public ArrayList<Publicacion> getPublicaciones() {
	return publicaciones;
}

public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
	publicaciones = publicaciones;
}

public ArrayList<Comentario> getComentarios() {
	return comentarios;
}

public void setComentarios(ArrayList<Comentario> comentarios) {
	comentarios = comentarios;
}

public ArrayList<Cuenta> getUsuarios() {
	return usuarios;
}

public void setUsuarios(ArrayList<Cuenta> usuarios) {
	usuarios = usuarios;
}

public Factory_Publicacion getFactoryPublicacion() {
	return factoryPublicacion;
}

public void setFactoryPublicacion(Factory_Publicacion factoryPublicacion) {
	factoryPublicacion = factoryPublicacion;
}

  
  /** */
  public void Baja()
  {

	  
  }
  
  /** */
  public void Cambiar_contrasenia(String constrasenia, String nuevaContrasenia)
  {
  
  }
  
  /** */
  public boolean Login(String alias, String contrasenia)
  {
	 boolean result = false;
	  
	 if(this.alias.equals(alias) && this.contrasenia.equals(contrasenia)) {
		result = true;
	 }
	 return result;
  }
  
  /** */
  public void Insertar_datos(String correo, String alias, String contrasenia)
  {
  
  }
  
  /** */
  public void Notificacion_contrasenia_no_coincide()
  {
  
  }
  
  /** */
  public void Notificacion_cuenta_creada_usuario()
  {
  
  }
  
  /** */
  public void InsertarComunidad(Comunidad comunidad)
  {
  
  }
  
  /** */
  public void InsertarPublicacion()
  {
	  Publicacion pub = new Publicacion();
	  this.publicaciones.add(pub);
  }
  
  /** */
  public void InsertarComentario(Comentario comentario)
  {
  
  }
  
  /** */
  public void InsertarUsuario(Cuenta usuario)
  {
  
  }
  
  /** */
  public void InsertarFactoryPublicacion(Factory_Publicacion factory)
  {
  
  }
  
  public void EliminarComunidad(Comunidad comunidad)
  {
  
  }
  
  /** */
  public void EliminarPublicacion(Publicacion publicacion)
  {
  
  }
  
  /** */
  public void EliminarComentario(Comentario comentario)
  {
  
  }
  
  /** */
  public void EliminarFactoryPublicacion()
  {
  
  }
}
