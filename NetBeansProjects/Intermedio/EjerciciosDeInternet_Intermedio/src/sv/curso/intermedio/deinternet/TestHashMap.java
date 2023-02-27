/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.deinternet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Saúl Valencia
 */

    public class TestHashMap {
public static void main(String[] args) {
String cod_banco;
Map  bancos = new HashMap ();
bancos.put("1827","BBVA");
bancos.put("0049","Santander");
bancos.put("2038","Bankia");
bancos.put("2100","La Caixa");
Iterator it = bancos.keySet().iterator();
while(it.hasNext()) {
cod_banco = (String) it.next();
System.out.println(cod_banco + ": " + bancos.get(cod_banco));
 
}
 
}
}
