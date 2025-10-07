import java.util.Scanner;

class GenericMaxInput {

    // Generic method to find maximum element
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer array
        System.out.print("Enter number of students (Total marks): ");
        int n1 = sc.nextInt();
        Integer[] totals = new Integer[n1];
        System.out.println("Enter the total marks:");
        for (int i = 0; i < n1; i++) {
            totals[i] = sc.nextInt();
        }

        // Float array
        System.out.print("\nEnter number of students (CGPA): ");
        int n2 = sc.nextInt();
        Float[] cgpas = new Float[n2];
        System.out.println("Enter the CGPA values:");
        for (int i = 0; i < n2; i++) {
            cgpas[i] = sc.nextFloat();
        }

        // String array
        System.out.print("\nEnter number of students (Names): ");
        int n3 = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] names = new String[n3];
        System.out.println("Enter the student names:");
        for (int i = 0; i < n3; i++) {
            names[i] = sc.nextLine();
        }

        // Finding and displaying maximum values
        System.out.println("\n===== RESULTS =====");
        System.out.println("Highest Total: " + findMax(totals));
        System.out.println("Highest CGPA: " + findMax(cgpas));
        System.out.println("Name comes last alphabetically: " + findMax(names));

        sc.close();
    }
}
