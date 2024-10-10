package com.parcial.clases;

public class PrintQueue {
    private PrintJob[] jobs;
    private int capacity;
    private int size;

    public PrintQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.jobs = new PrintJob[capacity];
    }

    // Método para agregar un trabajo de impresión a la cola
    public void add(PrintJob job) {
        if (size < capacity) {
            jobs[size] = job;
            size++;
        }
    }

    // Método para remover un trabajo de impresión de la cola
    public PrintJob remove() {
        if (size == 0) {
            return null;
        }

        PrintJob job = jobs[0];
        for (int i = 1; i < size; i++) {
            jobs[i - 1] = jobs[i];
        }
        size--;
        return job;
    }

    // Método para imprimir los trabajos de impresión en la cola
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(jobs[i]);
        }
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para obtener los trabajos de impresión en la cola
    public PrintJob[] getJobs(){
        return jobs;
    }
}
