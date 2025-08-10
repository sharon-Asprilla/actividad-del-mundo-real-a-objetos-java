package com.example;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("-----------------------------------inicio de copilacion computador -------------------------------------------------------");
       
        Computador mycomputador1 = new Computador();
        mycomputador1.setMarca("lenovo");
        System.out.println("Marca del computador: " + mycomputador1.getMarca());

        mycomputador1.setmodelo("controlz 15");
        System.out.println("Modelo del computador: " + mycomputador1.getmodelo());

        mycomputador1.setmemoriaRam ( 16);
        System.out.println("Memoria Ram del computador: " + mycomputador1.getmemoriaRam() + " GB"); 

        mycomputador1.setalmazenamento(512);
         System.out.println("Almacenamento del computador: " + mycomputador1.getalmazenamento() + " GB");  

        mycomputador1.setencendido(true);
        System.out.println("El computador esta encendido: " + mycomputador1.getencendido());

        System.out.println("--------------------------------------fin del computador ------------------------------------------------");

        System.out.println("--------------------------------------inicio de copilacion ventilador-------------------------------------------------------");

        Ventilador myventilador1 = new Ventilador();

        myventilador1.setMarca("LG");
        System.out.println("Marca del ventilador: " + myventilador1.getMarca());    

        myventilador1.setModelo("TurboFan 3000");
        System.out.println("Modelo del ventilador: " + myventilador1.getModelo());  
        myventilador1.setVelocidad(3);          
        System.out.println("Velocidad del ventilador: " + myventilador1.getVelocidad() + " niveles"); 
        
        myventilador1.setTamaño(16 );
        System.out.println("Tamaño del ventilador: " + myventilador1.getTamaño() + " pulgadas");    
        
        myventilador1.setEncendido(false);
        System.out.println("El ventilador esta encendido: " + myventilador1.isEncendido()); 
          
        
        System.out.println("--------------------------------------fin del ventilador ------------------------------------------------");    

        System.out.println("--------------------------------inicio de copilacion aire acondicionado-------------------------------------------------------"); 

        Aireacondicionado myaireacondicionado1 = new Aireacondicionado();
        myaireacondicionado1.setMarca("Samsung");
        System.out.println("Marca del aire acondicionado: " + myaireacondicionado1.getMarca());     
        myaireacondicionado1.setModelo("CoolBreeze 5000");
        
        System.out.println("Modelo del aire acondicionado: " + myaireacondicionado1.getModelo());  
        myaireacondicionado1.setTemperatura(22);
        System.out.println("Temperatura del aire acondicionado: " + myaireacondicionado1.getTemperatura() + " °C"); 
        myaireacondicionado1.setTamaño(24);
        System.out.println("Tamaño del aire acondicionado: " + myaireacondicionado1.getTamaño() + " BTU");  
        myaireacondicionado1.setColor("Blanco");
        System.out.println("Color del aire acondicionado: " + myaireacondicionado1.getColor());  
        myaireacondicionado1.setEncendido(true);
        System.out.println("El aire acondicionado esta encendido: " + myaireacondicionado1.isEncendido());      

        System.out.println("--------------------------------------fin del aire acondicionado ------------------------------------------------");    
}

}