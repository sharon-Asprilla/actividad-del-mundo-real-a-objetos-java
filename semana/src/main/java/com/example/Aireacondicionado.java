package com.example;

public class Aireacondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private int tamaño;
    private String color;
    private boolean encendido;

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }

    public void setTemperatura(int temperatura) { this.temperatura = temperatura; }
    public int getTemperatura() { return temperatura; }

    public void setEncendido(boolean encendido) { this.encendido = encendido; }
    public boolean isEncendido() { return encendido; }

    public void setTamaño(int tamaño) { this.tamaño = tamaño; }
    public int getTamaño() { return tamaño; }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

}
