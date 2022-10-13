import java.util.Scanner;

public class BubbleSortByStep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap kich thuoc danh sach:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " gia tri:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Danh sach dau vao cua ban la: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBat dau su ly sap sep...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Trao doi " + list[i] + " voi " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("mang co the bi sap sep va khong can chuyen");
                break;
            }
            /* Show the list after sort */
            System.out.print("liet ke sau " + k + "' loai: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}