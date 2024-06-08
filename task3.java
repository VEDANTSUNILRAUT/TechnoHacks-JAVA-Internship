import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("Welcome to the To-Do List program!");
        System.out.println("You can add, remove, and view tasks on your list.");
        System.out.println("To add a task, type 'add' followed by the task name.");
        System.out.println("To remove a task, type 'remove' followed by the task number.");
        System.out.println("To view your tasks, type 'view'.");
        System.out.println("To exit the program, type 'exit'.");
        while (true) {
            System.out.print("Enter your command: ");
            String command = input.nextLine();

            if (command.equals("exit")) {
                System.out.println("Thank you for using the To-Do List.");
                break;
            } else if (command.startsWith("add")) {
                String task = command.substring(4);
                tasks.add(task);
                System.out.println("Added '" + task + "' to your list.");
            } else if (command.startsWith("remove")) {
                int index = Integer.parseInt(command.substring(7)) - 1;

                if (index >= 0 && index < tasks.size()) {
                    String task = tasks.remove(index);
                    System.out.println("Removed '" + task + "' from your list.");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (command.equals("view")) {
                if (tasks.isEmpty()) {
                    System.out.println("Your list is empty.");
                } else {
                    System.out.println("Your tasks are:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }

            } else {
                System.out.println("Invalid command.");

            }

        }

        input.close();

    }

}
