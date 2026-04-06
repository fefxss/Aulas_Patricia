package TesteFila;

import ExercicioFilas.Filaint;

public class MainTeste {
    public static void main(String[] args) {
        Filaint fila = new Filaint();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        fila.enqueue(44);
        if (fila.isEmpty()){
            System.out.println("Fila vazia");
        }
        else {
            System.out.println("Valor reirado da fila: " + fila.dequeue());
        }

        System.out.println("Valor que esta no inicio da fila: " + fila.first());
    }
}
