/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_josuerivera;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author josue
 */
public class Examen1P1_JosueRivera {
static Scanner Sc = new Scanner(System.in);
 static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca su opcion ");
        System.out.println("1.Fight or flight");
        System.out.println("2.tri fuerza");
        System.out.println("3.Salir");
        int option = Sc.nextInt();
        while (option > 0 && option  < 3){
            switch (option){
                case 1:
                    char fin_ronda = 'S';
                    int distancia =random.nextInt(16)+15;
                    int balas = 25;
                    int vida_zomb = 25;
                    int dano = 65;
                    System.out.println("1. Principiante "
                            + "a. La probabilidad de hacer "
                            + "daño incrementa en un 0%");
                    System.out.println("2. Intermedio "
                            + "a. La probabilidad de hacer "
                            + "daño incrementa en un 5%");
                    System.out.println("3. Experto "
                            + "a. La probabilidad de hacer daño "
                            + "incrementa en un 15%");
                    int dificultad = Sc.nextInt();
                    int prob_dano = 65;
                    if (dificultad == 1){
                        prob_dano += 0;
                    }
                    else if (dificultad == 2){
                        prob_dano += 5;
                    }
                    else if (dificultad == 3){
                        prob_dano += 15;
                    }
                    while (fin_ronda == 'S'||fin_ronda =='s'){
                        System.out.println("el zombie se encuentra a "+ distancia+" metros de distancia");
                        balas -= 1;
                        System.out.println("el jugador cuenta con: "+balas+" balas");
                        System.out.println("el zombie tiene "+vida_zomb+" de vida");
                        int impacto = random.nextInt(101)+1;
                        if (impacto >= prob_dano){
                            int dano_a_zombi = random.nextInt(6)+1;
                            vida_zomb -= dano_a_zombi;
                            System.out.println("Hit, el tiro reduce "+dano_a_zombi+" la vida del zombi");
                            System.out.println("el zombi tiene "+ vida_zomb+" de vida");
                        }
                        else{
                            int acercamiento = random.nextInt(6)+1;
                            distancia -= acercamiento;
                            System.out.println("Fallaste, el zombi se acerca "+acercamiento+" metros");
                            System.out.println("Se encuantra a "+distancia+" metros");
                        }
                        if (vida_zomb <= 0){
                            System.out.println("la vida del zombi es 0");
                            break;
                        }
                        else if (balas == 0){
                            System.out.println("ya no tienes balas");
                            break;
                        }
                        else if(distancia <= 0){
                            System.out.println("el zombi esta demasiado cerca perdiste");
                            break;
                        }
                        System.out.println("al");
                        fin_ronda = Sc.next().charAt(0);
                    }
                    System.out.println(distancia);
                    break;
                
                case 2:
                    System.out.println("Introduzca el tamano");
                    int tam = Sc.nextInt();
                    while (tam < 20 || tam % 2 != 0 || (tam/2) % 2 == 0){
                        System.out.println("el numero tiene que "
                                + "ser mayor a 20, par y "
                                + "la division tiene que ser impar");
                        tam = Sc.nextInt();
                    }
                    //int num =tam;
                    System.out.println("");
                    int tam2 = tam / 2;
                    for(int i = 0; i < tam2 ;i++){
                        for(int j = 0; j < tam+1 ; j++){
                            /*if(i+num == j){
                                System.out.print(" ");
                            }*/
                            if (j >= tam2-i-1 && j <= tam2 +i +1){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                            //if (j >= tam2 -i +1 && j<= tam2 +i -1)
                            //System.out.print("*");
                        }
                        
                        System.out.println("");
                    }
                    System.out.println("ok2");
                    break;
                            
            }
            System.out.println("Introduzca su opcion ");
            System.out.println("1.Fight or flight");
            System.out.println("2.tri fuerza");
            System.out.println("3.Salir");



            option = Sc.nextInt();
        }
        // TODO code application logic here
    }
    
}
