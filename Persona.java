package com.Sofka.Taller;

public class Persona {
    private String nombre = "";
    private Integer edad = 0;
    private Integer dni;
    private char sexo = 'H';
    private Double peso = 0.0;
    private Double altura = 0.0;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, Integer edad, Integer dni, char sexo, Double peso, Integer altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer calcularIMC(Double peso, Double altura){
        Integer result =0;
        Double imc;
        imc = (peso/Math.pow(altura,2));
        if (imc <20){
            result = -1;
        }else if (imc >= 20 && imc <= 25){
            result = 0;
        }else if (imc > 25){
            result = 1;
        }
        return result;
    }

    public Boolean esMayorDeEdad(Integer edad){
        Boolean mayor = false;
        if(edad >= 18){
            mayor = true;
        }
        return mayor;
    }
}
