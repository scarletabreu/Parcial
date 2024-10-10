package com.parcial.clases;
import java.util.ArrayList;
import java.util.List;

public class PrintQueue {
    private List<PrintJob> jobs;
    private int size;

    public PrintQueue() {
        this.size = 0;
        this.jobs = new ArrayList<>();
    }

    // Método para agregar un trabajo de impresión a la cola
    public void add(PrintJob job) {
        jobs.add(job);
        size++;
    }

    // Método para remover un trabajo de impresión de la cola
    public PrintJob remove() {
        if (isEmpty()) {
            return null;
        }
        size--;
        return jobs.removeFirst();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    public List<PrintJob> getJobs() {
        return jobs;
    }
}
