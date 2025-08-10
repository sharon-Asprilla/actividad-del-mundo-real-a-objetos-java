package com.example;

public class Ventilador {
    private String marca;
    private String modelo;
    private int velocidad;
    private int tamaño;
    private boolean encendido;

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }

    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public int getVelocidad() { return velocidad; }

    public void setTamaño(int tamaño) { this.tamaño = tamaño; }
    public int getTamaño() { return tamaño; }

    public void setEncendido(boolean encendido) { this.encendido = encendido; }
    public boolean isEncendido() { return encendido; }
}
