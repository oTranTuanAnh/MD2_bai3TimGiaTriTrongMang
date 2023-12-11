import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Nguyen Van A", "Pham Thi B", "Nguyen Van C", "Le Van D", "Nguyen Thi E"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        String inputName = sc.nextLine();

        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)){
                System.out.println("Vi tri trong list cua "+ inputName + " la: "+ i);
                isExit = true;
                break;
            }
        }

        if (!isExit){
            System.out.println("Khong tim thay "+ inputName);
        }

    }

}
