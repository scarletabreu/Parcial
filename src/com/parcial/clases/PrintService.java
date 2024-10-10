package com.parcial.clases;

public class PrintService {
    private PrintQueue printQueue;

    public PrintService() {
        printQueue = new PrintQueue();
    }

    // Método para agregar trabajos de impresion
    public void addJob(PrintJob job) {
        printQueue.add(job);
    }

    // Método para imprimir todos los trabajos de impresion dependiendo la prioridad
    public void PrintTrabajosPorPrioridad(){
        PrintJob[] jobs = printQueue.getJobs().toArray(new PrintJob[0]);
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

    // Prototipo de función para imprimir trabajos de impresión por prioridad y hora
    public void PrintTrabajosPorPrioridadYPorHora(){
        PrintJob[] jobs = printQueue.getJobs().toArray(new PrintJob[0]);

        for (int i = 0; i < jobs.length; i++) {
            for (int j = 1; j < jobs.length; j++) {
                if((jobs[i].getPriority().equals(jobs[j].getPriority()) && (jobs[i].getPriority().equals(Prioridad.H)))){
                    if(jobs[i].getTime().compareTo(jobs[j].getTime()) < 0) {
                        System.out.println("Imprimiendo trabajo de alta prioridad: " + jobs[i].getTrabajoImpresion());
                    }else{
                        System.out.println("Imprimiendo trabajo de alta prioridad: " + jobs[j].getTrabajoImpresion());
                    }
                }else if(jobs[i].getPriority().equals(Prioridad.H) && jobs[j].getPriority() != Prioridad.H){
                    System.out.println("Imprimiendo trabajo de media prioridad: " + jobs[i].getTrabajoImpresion());
                }else if(jobs[j].getPriority().equals(Prioridad.H) && jobs[i].getPriority() != Prioridad.H){
                    System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[j].getTrabajoImpresion());
                }
                else if((jobs[i].getPriority().equals(jobs[j].getPriority()) && (jobs[i].getPriority().equals(Prioridad.M)))){
                    if(jobs[i].getTime().compareTo(jobs[j].getTime()) < 0) {
                        System.out.println("Imprimiendo trabajo de media prioridad: " + jobs[i].getTrabajoImpresion());
                    }else{
                        System.out.println("Imprimiendo trabajo de media prioridad: " + jobs[j].getTrabajoImpresion());
                    }
                }else if(jobs[i].getPriority().equals(Prioridad.M) && jobs[j].getPriority() != Prioridad.M){
                    System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[i].getTrabajoImpresion());
                } else if (jobs[j].getPriority().equals(Prioridad.M) && jobs[i].getPriority() != Prioridad.M) {
                    System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[j].getTrabajoImpresion());
                }
                else if((jobs[i].getPriority().equals(jobs[j].getPriority()) && (jobs[i].getPriority().equals(Prioridad.L)))){
                    if(jobs[i].getTime().compareTo(jobs[j].getTime()) < 0) {
                        System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[i].getTrabajoImpresion());
                    }else{
                        System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[j].getTrabajoImpresion());
                    }
                } else if (jobs[i].getPriority().equals(Prioridad.L) && jobs[j].getPriority() != Prioridad.L) {
                    System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[i].getTrabajoImpresion());
                } else if (jobs[j].getPriority().equals(Prioridad.L) && jobs[i].getPriority() != Prioridad.L) {
                    System.out.println("Imprimiendo trabajo de baja prioridad: " + jobs[j].getTrabajoImpresion());
                }
            }
        }

    }

}
