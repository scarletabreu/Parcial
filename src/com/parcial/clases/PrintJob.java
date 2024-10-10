package com.parcial.clases;

public class PrintJob {
    private String userName;
    private String time;
    private Prioridad priority = Prioridad.M;
    private String TrabajoImpresion;

    public PrintJob(String userName, String time, Prioridad priority, String TrabajoImpresion) {
        this.userName = userName;
        this.time = time;
        this.priority = priority;
        this.TrabajoImpresion = TrabajoImpresion;
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public String getTime() {
        return time;
    }

    public Prioridad getPriority() {
        return priority;
    }

    public String getTrabajoImpresion() {
        return TrabajoImpresion;
    }

    // Override toString
    @Override
    public String toString() {
        return "com.parcial.clases.PrintJob{" +
                "userName='" + userName + '\'' +
                ", time='" + time + '\'' +
                ", priority=" + priority +  '\'' +
                ", Trabajo Impresion='" + TrabajoImpresion + '\'' +
                '}';
    }

}
