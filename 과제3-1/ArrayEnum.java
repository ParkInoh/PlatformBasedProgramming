import java.util.Scanner;

public class ArrayEnum {
    public enum Command {
        QUIT, LIST, ADD, SUM, MIN, MAX, exception
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[100];
        int index = 0;
        boolean flag = true;

        while (flag) {
            Command command = getCommand(scanner);
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    int value = getValue(scanner);
                    try {
                        list[index++] = value;
                    }
                    catch (Exception e) {
                        flag = false;
                    }
                    break;
                case LIST:
                    printList(list, index);
                    break;
                case SUM:
                    System.out.println(getSum(list, index));
                    break;
                case MIN:
                    System.out.println(getMin(list, index));
                    break;
                case MAX:
                    System.out.println(getMax(list, index));
                    break;

                case exception:
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }

        scanner.close();
    }

    public static Command getCommand(Scanner scanner) {
        String temp = scanner.next().toUpperCase();
        switch (temp) {
            case "ADD":
                return Command.ADD;
            case "LIST":
                return Command.LIST;
            case "SUM":
                return Command.SUM;
            case "MIN":
                return Command.MIN;
            case "MAX":
                return Command.MAX;
            case "QUIT":
                return Command.QUIT;
            default:
                return Command.exception;
        }
    }

    public static int getValue(Scanner scanner) {
        return scanner.nextInt();
    }

    public static void printList(int[] list, int index) {
        for (int i = 0; i < index; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static int getSum(int[] list, int index) {
        int result = 0;
        for (int i = 0; i < index; i++)
            result += list[i];
        return result;
    }

    public static int getMin(int[] list, int index) {
        int result = list[0];
        for (int i = 0; i < index; i++)
            if (result > list[i]) result = list[i];
        return result;
    }

    public static int getMax(int[] list, int index) {
        int result = list[0];
        for (int i = 0; i < index; i++)
            if (result < list[i]) result = list[i];
        return result;
    }
}
