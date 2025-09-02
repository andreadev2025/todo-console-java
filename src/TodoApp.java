import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        int nextId = 1; // contatore per ID dei ToDo

        while(running) {
            System.out.println("1) Aggiungi ToDo  2) Mostra ToDo  3) Esci");
            int choice = scanner.nextInt();
            scanner.nextLine(); // pulisce il buffer

            switch(choice) {
                case 1:
                    System.out.print("Scrivi ToDo: ");
                    String todo = scanner.nextLine();
                    todos.add(nextId + ". " + todo); // aggiungi l'ID davanti al testo
                    nextId++;
                case 2:
                    System.out.println("Lista ToDo:");
                    for(int i=0; i<todos.size(); i++) {
                        System.out.println((i+1) + ") " + todos.get(i));
                    }
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        }

        System.out.println("Bye!");
        scanner.close();
    }
}
