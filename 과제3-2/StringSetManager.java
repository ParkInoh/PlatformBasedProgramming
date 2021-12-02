import java.util.Scanner;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID}

public class StringSetManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        int index = 0;
        String temp;

        while (true) {
            StringCommand command = getCommand(scanner);

            if (command == StringCommand.QUIT) {
                System.out.println("BYE!");
                break;
            }

            switch (command) {
                case ADD:
                    temp = scanner.next();
                    boolean flag = true;
                    for (int i = 0; i < index; i++) {
                        if (stringSet[i].equals(temp))
                            flag = false;
                    }
                    if (flag)
                        stringSet[index++] = temp;
                    break;
                case REMOVE:
                    temp = scanner.next();
                    for (int i = 0; i < index; i++) {
                        if (stringSet[i].equals(temp)) {
                            for (int j = i; j < index; j++)
                                stringSet[j] = stringSet[j + 1];
                            index--;
                        }
                    }
                    break;
                case CLEAN:
                    stringSet = new String[100];
                    index = 0;
                    break;
                case INVALID:
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet, index);
        }

        scanner.close();
    }

    private static void print(String[] arr, int index) {
        System.out.print("Element Size: " + index + ", Values = [");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
            if (i < index - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    private static StringCommand getCommand(Scanner scanner) {
        switch (scanner.next().toUpperCase()) {
            case "ADD":
                return StringCommand.ADD;
            case "REMOVE":
                return StringCommand.REMOVE;
            case "CLEAN":
                return StringCommand.CLEAN;
            case "QUIT":
                return StringCommand.QUIT;
            default:
                return StringCommand.INVALID;
        }
    }
}
