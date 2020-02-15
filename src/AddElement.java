import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        int size = input.nextInt(); // nhap do dai//
        int [] array = new int[size];
        for (int i=0; i < size ; i++){
            System.out.println("so phan tu thu" +i);
            array[i] = input.nextInt(); // nhap tung phan tu cua mang//
        }

        System.out.println("nhap vao vi tri can them");
        int index = input.nextInt(); //nhap vi tri can them//
        System.out.println("nhap gia tri phan tu can them");
        int value = input.nextInt();

        // tao 1 mang moi co do dai =  do dai cu tang len 1//
        int [] number = new int[size + 1];
        if (index <= 0 || index >= array.length -1){
            System.out.println("Khong chen duoc them phan tu vao trong mang");

        }else {
            for (int i = 0 ; i < size ; i++){ // chen cac phan tu cua mang cu vao mang moi//
                number[i] = array[i];
            }
            number[index] = value ; // gan gia tri cho phan tu moi cua mang//
            for (int i = index + 1 ; i <size + 1 ; i++){
                number[i] = array[i - 1]; // don phan tu vi du nhu vi tri number[3] se bang vi tri array//
            }
        }
        for (int x : number ){ //duyet vong lap trong mang moi//
            System.out.print(x + "\t"); // in ra phan tu trong mang moi//
        }

    }
}
