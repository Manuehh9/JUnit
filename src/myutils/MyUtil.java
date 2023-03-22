/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myutils;

import java.util.Calendar;

/**
 *
 * @author garci
 */
public class MyUtil {

    public static String inverteix(String cadena) {
        //Metodo invertir cadena de texto
        StringBuilder sb = new StringBuilder(cadena);
        String resultat;

        sb.reverse();
        resultat = sb.toString();

        System.out.println(resultat);
        return resultat;
    }

    public static int edat(int day, int month, int year) {
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setLenient(false);
                
        try {
            fechaNacimiento.set(year, month - 1, day); // Restar 1 al mes porque en Calendar los meses empiezan en 0
            fechaNacimiento.getTime(); // Validar la fecha
        } catch (IllegalArgumentException e) {
            // La fecha es inválida
            System.out.println("Fecha invalida");
            return -2;
        }
        
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH)) {
            edad--;
        } else if (fechaActual.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH)
                && fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
            edad--;
        }
        // Verificar que la edad sea válida
        if (edad > 150) {
            // La edad es mayor a 150 años
            System.out.println("Datos incorrectos no puedes tener mas de 150 años!!!");
            return -1;
        } else {
            System.out.println(edad);
            return edad;
        }
    }
    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
