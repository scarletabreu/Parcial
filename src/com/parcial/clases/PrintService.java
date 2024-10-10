package com.parcial.clases;

public class PrintService {
    private PrintQueue printQueue;

    public PrintService(int capacity) {
        printQueue = new PrintQueue(capacity);
    }

    // Método para agregar trabajos de impresion
    public void addJob(PrintJob job) {
        printQueue.add(job);
    }
    //procesa los trabajos de impresion
    public void PrintTrabajosPorPrioridad(){
        PrintJob[] jobs = printQueue.getJobs();
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i].getPriority().equals(Prioridad.H)){
                System.out.println("Imprimiendo trabajo de alta prioridad: " + jobs[i].getTrabajoImpresion());
            }
        }
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i].getPriority().equals(Prioridad.M)){
                System.out.println("Imprimiendo trabajo de media prioridad: " + jobs[i].getTrabajoImpresion());
            }
        }
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i].getPriority().equals(Prioridad.L)){
                System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[i].getTrabajoImpresion());
            }
        }
    }

    // Hacer que se impriman al mismo tiempo todas los trabajos de impresion dependiendo de su prioridad y si tienen la misma prioridad que sea por el tiempo

}
