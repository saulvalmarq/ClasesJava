/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;
    import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Saúl Valencia
 */
public class OtraPrueba {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        HashMap<Integer, String> pessoas = new HashMap<Integer, String>();
        int numero;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o número da pessoa: ");
            numero = leitor.nextInt();
            System.out.println("Digite o nome da pessoa: ");
            String nome = leitor.next();  // Alteração neste ponto   
            pessoas.put(numero, nome);
        }

        System.out.println("Digite o número da pessoa que você deseja buscar: ");
        numero = leitor.nextInt();

        System.out.println("O nome da pessoa " + numero + " é " + pessoas.get(numero));
    }
}

