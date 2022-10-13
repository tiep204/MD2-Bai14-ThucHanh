import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap kich thuoc danh dach");
        double size = sc.nextDouble();
        double[] list = new double[(int) size];
        System.out.println("mang cua ban co: "+ list.length + " gia tri:");

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("mang da duoc sap sep la:");
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.printf(list[i] + " ");

        }
    }
    public static void selectionSort(double[] list){

        for (int i = 0; i < list.length-1; i++) {
            double currenMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1; j < list.length; j++) {
                if(currenMin > list[j]){
                    currenMin = list[j];
                    currentMinIndex  = j;
                }
            }
            if (currentMinIndex !=i){
                list[currentMinIndex] =list[i];
                list[i] = currenMin;
            }
        }
    }


}
