/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.deinternet;

/**
 *
 * @author Saúl Valencia
 */
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ContactPro {
	private  Scanner sc;
	HashMap hm=new HashMap();

		//incrementar
	public void add(){
		sc = new Scanner(System.in);
		System.out.println ("------ Agregar guía telefónica ------");
		System.out.println ("Nombre:");
		String name=sc.nextLine();
		System.out.println ("Género:");
		String sex=sc.nextLine();

		System.out.println ("Teléfono:");
		String phonenum=sc.nextLine();
		System.out.println("QQ：");
		String QQnum=sc.nextLine();
		System.out.println ("Dirección:");
		String address=sc.nextLine();
		System.out.println ("Edad:");
		int age=sc.nextInt();

		Contact newOne = new Contact (name, sex, age, phonenum, QQnum, address); // Los datos leídos construyen un Contacto
		hm.put (name, newOne); // Añadir a HashMap
		System.out.println ("Agregado correctamente");
	}


	//Eliminar
	public void del(){
		sc = new Scanner(System.in);
		System.out.println ("------ Eliminar la guía telefónica ------");
		System.out.println ("Ingrese el nombre que se eliminará:");
		String name=sc.nextLine();
		if (hm.containsKey (name)) {// Juzgue si existe esta persona
			System.out.println(hm.get(name).toString());
			System.out.println ("¿Está seguro de que desea eliminar 1 (sí) 0 (no)");
			int flag=sc.nextInt();
			if(flag==1){
				hm.remove(name);
				System.out.println ("Eliminado correctamente");
			}else{
				System.out.println ("Cancelar Eliminar");
			}
		}else{
			System.out.println ("Esta persona no existe");
		}

	}


	//Modificar
	public void change(){
		sc = new Scanner(System.in);
		System.out.println ("------ modificar directorio telefónico ------");
		System.out.println ("Ingrese el nombre a modificar:");
		String name=sc.nextLine();
		if (hm.containsKey (name)) {// Juzgue si existe esta persona
			System.out.println(hm.get(name).toString());

			hm.remove (name); // Eliminar a esta persona primero

			System.out.println ("Vuelva a ingresar la información");
			System.out.println ("Nombre:");
			String name1=sc.nextLine();
			System.out.println ("Género:");
			String sex=sc.nextLine();

			System.out.println ("Teléfono:");
			String phonenum=sc.nextLine();
			System.out.println("QQ：");
			String QQnum=sc.nextLine();
			System.out.println ("Dirección:");
			String adress=sc.nextLine();
			System.out.println ("Edad:");
			int age=sc.nextInt();
			Contact newOne=new Contact(name1,sex,age,phonenum,QQnum,adress);
			hm.put (name, newOne); // Agregar nuevo
			System.out.println ("Modificado con éxito");
		}else{
			System.out.println ("Esta persona no existe");
		}
	}


	//Imprimir todo
	public void show(){
		System.out.println ("------ Mostrar todo -----");
		Iterator iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getValue().toString());
		}
	}


	//Buscar por nombre
	public void search(){
		sc = new Scanner(System.in);
		System.out.println ("------ Eliminar la guía telefónica ------");
		System.out.println ("Ingrese el nombre a modificar:");
		String name=sc.nextLine();
		if(hm.containsKey(name)){
			System.out.println(hm.get(name).toString());
		}else{
			System.out.println ("Esta persona no existe");
		}
	}
                  // Vacío hm
	public void clear(){
		hm.clear();
	}


	// Inicialmente use DataInputStream y DataOutputStream para leer y almacenar información de la agenda telefónica
	/*public void open() throws IOException{
		System.out.println ("Leer ...");
		DataInputStream in=new DataInputStream(new FileInputStream("contact.txt"));
		boolean flag=true;
		while(flag){
			try{
				String name=in.readUTF();
				String sex=in.readUTF();
				String phonenum=in.readUTF();
				String QQnum=in.readUTF();
				String adress=in.readUTF();
				int age=in.readInt();
				Contacto newOne = nuevo Contacto (nombre, sexo, edad, teléfono, QQnum, dirección); // Los datos leídos construyen un Contacto
				hm.put (name, newOne); // Añadir a HashMap
			}catch(EOFException e){
				flag=false;
			}
		}
		in.close();
	}
	public void save() throws IOException{
		System.out.println ("Guardar ...");
		DataOutputStream out=new DataOutputStream(new FileOutputStream("contact.txt"));
		Iterator iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Contact val = (Contact) entry.getValue();
			out.writeUTF(val.getName());
			out.writeUTF(val.getSex());
			out.writeUTF(val.getPhonenum());
			out.writeUTF(val.getQQnum());
			out.writeUTF(val.getAddress());
			out.writeInt(val.getAge());

		}
		out.close();
		System.out.println ("Guardar correctamente");
	}
	*/

	// Serializar para almacenamiento y lectura

	//Leer
	public void open1() throws Exception{
		System.out.println ("Leer ...");
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("contact1.txt"));
		boolean flag=true;
		while(flag){
			try{
				Contact newOne=(Contact) in.readObject();
				hm.put (newOne.getName (), newOne); // Añadir a HashMap
			}catch(EOFException e){
				flag=false;
			}
		}
		in.close();
	}
	//Almacenamiento
	public void save1() throws Exception{
		System.out.println ("Guardar ...");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("contact1.txt"));
		Iterator iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Contact val = (Contact) entry.getValue();
			out.writeObject(val);
		}
		out.close();
		System.out.println ("Guardar correctamente");
	}
}

