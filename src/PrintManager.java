import com.parcial.clases.PrintJob;
import com.parcial.clases.PrintQueue;
import com.parcial.clases.PrintService;
import com.parcial.clases.Prioridad;

public class PrintManager {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue(5);
        PrintJob job1 = new PrintJob("John Doe", "10:00", Prioridad.H, "Print job 1");
        PrintJob job2 = new PrintJob("Ana Smith", "10:01", Prioridad.L, "Print job 2");
        PrintJob job3 = new PrintJob("John Smith", "10:02", Prioridad.L, "Print job 3");
        PrintJob job4 = new PrintJob("Jane Doe", "10:03", Prioridad.L, "Print job 4");
        PrintJob job5 = new PrintJob("Jonas Smith", "10:04", Prioridad.M, "Print job 5");
        PrintJob job6 = new PrintJob("Jane Smith", "10:05", Prioridad.L, "Print job 6");
        PrintJob job7 = new PrintJob("Jonathan Smith", "10:06", Prioridad.H, "Print job 7");
        PrintJob job8 = new PrintJob("Clara Smith", "10:07", Prioridad.M, "Print job 8");
        PrintJob job9 = new PrintJob("Clark Doe", "10:08", Prioridad.L, "Print job 9");
        PrintJob job10 = new PrintJob("Lana Doe", "10:09", Prioridad.H, "Print job 10");

        printQueue.add(job1);
        printQueue.add(job2);
        printQueue.add(job3);
        printQueue.add(job4);
        printQueue.add(job5);
        printQueue.add(job6);
        printQueue.add(job7);
        printQueue.add(job8);
        printQueue.add(job9);
        printQueue.add(job10);
        printQueue.remove();

        PrintService printService = new PrintService(5);
        printService.addJob(job1);
        printService.addJob(job2);
        printService.addJob(job3);
        printService.addJob(job4);
        printService.addJob(job5);
        printService.PrintTrabajosPorPrioridad();
    }
}