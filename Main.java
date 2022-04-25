package com.Sofka.Taller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.math.*;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //Punto 1
        /*System.out.println("");
        System.out.println("----------   Punto 1   -----------");
        Integer num1 = 7,
                num2 = 7;
        validaNumeros(num1, num2);

        //Punto 2
        System.out.println("");
        System.out.println("----------   Punto 2   -----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        validaNumeros(num1, num2);

        //Punto 3
        System.out.println("");
        System.out.println("----------   Punto 3   -----------");
        System.out.println("Ingrese el radio del circulo: ");
        Integer radio = input.nextInt();
        arearCirculo(radio);

        //Punto 4
        System.out.println("");
        System.out.println("----------   Punto 4   -----------");
        System.out.println("Ingrese el precio a verificar: ");
        Double price = input.nextDouble();
        final Double tax = 0.21;
        taxes(price, tax);

        //Punto 5
        System.out.println("");
        System.out.println("----------   Punto 5   -----------");
        System.out.println("Se mostrarán los número pares e impares de 1 a 100 (ciclo While)");
        Integer x = 1;
        String ood = "Números pares: ";
        String even = "Números impares: ";
        while (x<101){
            if(x%2 == 0){
                ood += x +", ";
            }else{
                even += x +", ";
            }
            x ++;
        }
        System.out.println(ood);
        System.out.println(even);

        //Punto 6
        System.out.println("");
        System.out.println("----------   Punto 6   -----------");
        ood = "Números pares: ";
        even = "Números impares: ";
        System.out.println("Se mostrarán los número pares e impares de 1 a 100 (ciclo for)");
        for (int i = 1; i<=100; i++){
            if(i%2 == 0){
                ood += i +", ";
            }else{
                even += i +", ";
            }
        }
        System.out.println(ood);
        System.out.println(even);

        //Punto 7
        System.out.println("");
        System.out.println("----------   Punto 7   -----------");
        Integer num ;
        do{
            System.out.println("Ingresa un número:");
            num = input.nextInt();
        }while (num >0);
        System.out.println("El número ingresado es: " + num);

        //Punto 8
        System.out.println("");
        System.out.println("----------   Punto 8   -----------");
        System.out.println("Ingrese un día de la semana: ");
        String day = input.next();
        switch (day){
            case "Domingo":
                System.out.println("No es día laboral");
                break;
            case "Lunes":
                System.out.println("Es día laboral");
                break;
            case "Martes":
                System.out.println("Es día laboral");
                break;
            case "Miercoles":
                System.out.println("Es día laboral");
                break;
            case "Jueves":
                System.out.println("Es día laboral");
                break;
            case "Sábado":
                System.out.println("No es día laboral");
                break;
            default:
                System.out.println("No es una opción valida");
        }

        //Punto 9
        System.out.println("");
        System.out.println("----------   Punto 9   -----------");
        String cadena ="La sonrisa sera la mejor arma contra la tristeza";
        System.out.println(cadena);
        System.out.println(cadena.replace('a', 'e'));
        System.out.println("Ingrese una frase: ");
        String cadena2 = input.nextLine();
        System.out.println(cadena2);
        System.out.println(cadena.replace('a', 'e') + " --- " + cadena2);

        //Punto 10
        System.out.println("");
        System.out.println("----------   Punto 10   -----------");
        System.out.println("Ingrese una frase: ");
        String noSpaces = input.nextLine();
        System.out.println(noSpaces.replace(" ", ""));

        //Punto 11
        System.out.println("");
        System.out.println("----------   Punto 11   -----------");
        System.out.println("Ingrese una frase: ");
        String prhase = input.nextLine();
        char[] iterablePrhase = prhase.toCharArray();
        System.out.println(iterablePrhase);
        System.out.println("La longitud de la frase son " + prhase.length() + " caracteres");
        Integer aVowel = 0;
        Integer eVowel = 0;
        Integer iVowel = 0;
        Integer oVowel = 0;
        Integer uVowel = 0;
        for (char letter : iterablePrhase){
            switch (letter){
                case 'a':
                    aVowel ++;
                    break;
                case 'e':
                    eVowel ++;
                    break;
                case 'i':
                    iVowel ++;
                    break;
                case 'o':
                    oVowel ++;
                    break;
                case 'u':
                    uVowel ++;
                    break;
            }
        }
        System.out.println("La letra a se repite : " + aVowel + " veces");
        System.out.println("La letra e se repite : " + eVowel + " veces");
        System.out.println("La letra i se repite : " + iVowel + " veces");
        System.out.println("La letra o se repite : " + oVowel + " veces");
        System.out.println("La letra u se repite : " + uVowel + " veces");


        System.out.println("Ingrese la primera palabra");
        String word1 = input.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String word2 = input.nextLine();
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Las palabras son iguales");
        }else{
            char[] word1Array = word1.toCharArray();
            char[] word2Array = word2.toCharArray();
            for (int i=0; i<word1Array.length; i++){
                System.out.println("La letra en la primera palabara es: " + word1Array[i] + " y en la segunda palabra es: " + word2Array[i]);
            }
        }

        //Punto 13
        System.out.println("");
        System.out.println("----------   Punto 13   -----------");
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));

        //Punto 14
        System.out.println("");
        System.out.println("----------   Punto 14   -----------");
        System.out.println("Ingrese un número: ");
        Integer numBase = input.nextInt();
        System.out.println("Los números desde el ingresado hasta 1000 con salto de 2 en 2 son: ");
        System.out.println(numBase);
        while (numBase <= 1000 && numBase+2 <= 1000){
            System.out.println(numBase +=2);
        }

        //Punto 15
        System.out.println("");
        System.out.println("----------   Punto 15   -----------");
        Integer option;
        do {
            System.out.println("****** GESTION CINEMATOGRAFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR\n");
            System.out.println("Seleccione una opción:");
            option = input.nextInt();
            if(option<1 || option>8){
                System.out.println("OPCION INCORRECTO\n");
            }

        }while (option != 8);*/


    }

    private static void validaNumeros(Integer num1, Integer num2) {
        if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        }
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        if (num1 == num2){
            System.out.println(num1 + " es igual que " + num2);
        }
    }

    private static void arearCirculo(Integer radio){

        System.out.println("El área del circulo con radio " + radio + " es: " + Math.PI * Math.pow(radio, 2));
    }

    private static void taxes(Double price, Double tax){
        System.out.println("Los impuestos de 21% del articulo con el precio " + price + " son: " + (price * tax));

    }


}
