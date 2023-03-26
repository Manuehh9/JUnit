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
        
        //Crear stringbuilder con el parametro que queremos invertir
        StringBuilder sb = new StringBuilder(cadena);
        String resultat;

        //Invertimos la cadena guardada en el stringbuilder
        // y lo guardamos en resultat
        sb.reverse();
        resultat = sb.toString();

        //mostramos la variable
        System.out.println(resultat);
        
        //La devolvemos en caso de no ser nula
        //en caso de serlo se devuelve un null
        if (resultat != null) {
            return resultat;
        }else{
            return null;
        }
        
    }

    public static int edat(int day, int month, int year) {
        //Declaramos las variable y usamos Calendar.getInstance()
        //representa la fecha y la hora actuales. 
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();
        
        //Impide fechas invalidas
        fechaNacimiento.setLenient(false);

        try {
            //Se Resta 1 al mes porque en Calendar los meses empiezan en 0
            fechaNacimiento.set(year, month - 1, day);
            // Validar la fecha
            fechaNacimiento.getTime(); 
        } catch (IllegalArgumentException e) {
            // La fecha es inválida
            System.out.println("Fecha invalida");
            return -2;
        }

        //Se calcula la edad restando fecha actual a la fecha de nacimiento
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

    public static double factorial(double numero) {
        
        if (numero < 0) {
            //Si el numero es negativo, se devuelve -1
            return -1;
        } else if (numero == 0) {
            //Si el numero es 0, se devuelve 1
            return 1;
        } else {
            //Si el numero es mayor a 0, se devuelve se devuelve el factorial
            double factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
            return factorial;
        }
    }
}
