package com.parcial.controlador;

import com.parcial.clases.PrintJob;

import java.util.Queue;

public class PrintManager {
    private Queue<PrintJob> printQueue;

    public PrintManager(Queue<PrintJob> printQueue) {
        this.printQueue = printQueue;
    }

    public void addPrintJob(PrintJob printJob) {
        printQueue.add(printJob);
    }

    public PrintJob getNextPrintJob() {
        return printQueue.poll();
    }

    public void printAllJobs() {
        while (!printQueue.isEmpty()) {
            System.out.println(printQueue.poll());
        }
    }


}
