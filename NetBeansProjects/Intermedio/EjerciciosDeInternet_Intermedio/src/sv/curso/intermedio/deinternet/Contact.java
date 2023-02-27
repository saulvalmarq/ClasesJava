/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.deinternet;

import java.io.Serializable;

/**
 *
 * @author Saúl Valencia
 */
    public class Contact implements Serializable {
	private String name;
	private String sex;
	private int age;
	private String phonenum;
	private String QQnum;
	private String address;


	// constructor

	public Contact(){}
	public Contact(String name,String sex,int age,
			String phonenum,String QQnum,String address){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.phonenum=phonenum;
		this.QQnum=QQnum;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getQQnum() {
		return QQnum;
	}
	public void setQQnum(String QQnum) {
		this.QQnum=QQnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	// método toString
	public String toString() {
		return "Contacto [Nombre:" + name + ", Género:" + sex + ", Edad:" + age + ", Teléfono:" + phonenum + ", QQ:" + QQnum + ", Dirección:" + address + "]";
	}

}


