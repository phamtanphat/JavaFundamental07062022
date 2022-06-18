import java.util.Arrays;
import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] args) {
//          1: Kiểu dữ liệu (Data type)
//         Nhóm 1: Kiểu nguyên thủy
//         Ví dụ: char (ký tự), int or long (số nguyên), float or double (số thực), boolean (kiểu đúng sai)
//         Nhóm 2: Kiểu object (Kiểu preference)
//         Ví dụ: Person (Đối tượng tự tạo ra)
//
//         2: Khai báo biến
//        char gender = 'M';
//        String name = "Phạm Tấn Phát";
//        int age = 28;
//        float weigh = 75.1f;
//        float height = 1.75f;
//        boolean isBusy = true;
//
//         3: Phương thức (method or function)
//         Phương thức in trong hệ thống: System
//        System.out.println("Giới tính: " + gender);
//        System.out.println("Tuổi: " + age);

//         4: Toán tử
//         Toán tử: ++, --
//         Trường hợp 1: a++
//              - Lấy giá trị của a và thế vào vị trí a++
//              - Sau khi gán xong thì sẽ chạy a = a + 1
//         Trường hợp 2: ++a
//              - Chạy a = a + 1
//              - Lấy giá trị của a và thế vào vị trí a++
//         int a = 5;
//         int b = 5;
//
//         int result = ++a - --b + a-- - b-- + a++ - --b - --a;
//         6 - --b + a-- - b-- + a++ - --b - --a; a = 6, b = 5
//         6 - 4 + a-- - b-- + a++ - --b - --a; a = 6, b = 4
//         6 - 4 + 6 - b-- + a++ - --b - --a; a = 5, b = 4
//         6 - 4 + 6 - 4 + a++ - --b - --a; a = 5, b = 3
//         6 - 4 + 6 - 4 + 5 - --b - --a; a = 6, b = 3
//         6 - 4 + 6 - 4 + 5 - 2 - --a; a = 6, b = 2
//         6 - 4 + 6 - 4 + 5 - 2 - 5; a = 5, b = 2
//         result = 2, a = 5, b = 2
//         System.out.println("Result " + result);
//         System.out.println("A " + a);
//         System.out.println("B " + b);

//         int a = 10;
//         int b = 3;
//         int result = a-- - --a + b-- + --b - a++ + b-- + b++ + a--;
//         10 - --a + b-- + --b - a++ + b-- + b++ + a--; a = 9, b = 3
//         10 - 8 + b-- + --b - a++ + b-- + b++ + a--; a = 8, b = 3
//         10 - 8 + 3 + --b - a++ + b-- + b++ + a--; a = 8, b = 2
//         10 - 8 + 3 + 1 - a++ + b-- + b++ + a--; a = 8, b = 1
//         10 - 8 + 3 + 1 - 8 + b-- + b++ + a--; a = 9, b = 1
//         10 - 8 + 3 + 1 - 8 + 1 + b++ + a--; a = 9, b = 0
//         10 - 8 + 3 + 1 - 8 + 1 + 0 + a--; a = 9, b = 1
//         10 - 8 + 3 + 1 - 8 + 1 + 0 + 9; a = 8, b = 1
//         result = 8, a = 8, b = 1
//
//         System.out.println("Result " + result);
//         System.out.println("A " + a);
//         System.out.println("B " + b);

//         Toán tử so sánh: > <, ==, &&, ||, !isMale

//         5: Câu điều kiện if else
//        int teo = 1999;
//        int ty = 2000;
//
//        if (teo > ty) {
//            System.out.println("Tèo nhỏ tuổi hơn Tý");
//        } else if (teo == ty) {
//            System.out.println("Tèo băng tuổi Tý");
//        } else {
//            System.out.println("Tèo lớn hơn Tý");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập chiều cao(m): ");
//        float height = scanner.nextFloat();
//        System.out.print("Mời bạn nhập cân nặng(kg): ");
//        float weight = scanner.nextFloat();
//
//        double bmi = weight/(height*height);
//
//        String message = "";
//        if (bmi < 18.5) {
//            message = "Gầy";
//        } else if (bmi <= 24.9) {
//            message = "Bình thường";
//        } else if (bmi <= 29.9) {
//            message = "Tiền béo phì";
//        } else if (bmi <= 34.9) {
//            message = "Béo phì độ 1";
//        } else if (bmi <= 39.9) {
//            message = "Béo phì độ 2";
//        } else {
//            message = "Béo phì cấp độ 3";
//        }
//        System.out.println("Chỉ số cơ thể(Bmi): " + bmi);
//        System.out.println(message);


//        Nhập 1 năm bất kỳ và tính coi năm có nhuận hay không

//        5: Câu điều kiện switch case

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập tháng: ");
//        int month = scanner.nextInt();
//
//        switch (month) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Quý 1");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Quý 2");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Quý 3");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("Quý 4");
//                break;
//            default:
//                System.out.println("Giá trị đưa vào không thỏa");
//                break;
//        }
//        System.out.println("Kết thúc chương trình");

//        6: Vòng lặp for

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }

//        Dùng vòng lặp for chạy từ 1 đến 100
//        1 - In ra số chẳn
//        2 - In ra số lẻ
//        3 - In ra số chia 3 dư 1

//        Kiểm tra số nguyên tố
//        Người dùng nhập vào 1 số bất kỳ

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập 1 số bất kỳ: ");
//        int number = scanner.nextInt();
//        int count = 0;
//
//        if (number < 2) {
//            System.out.println("Không phải là số nguyên tố");
//        } else {
//            for (int i = 2; i <= number / 2; i++) {
//                if (number % 2 == 0) {
//                    count++;
//                }
//            }
//
//            if (count > 2) {
//                System.out.println("Không phải là số nguyên tố");
//            } else {
//                System.out.println("Số " + number + " là số nguyên tố");
//            }
//        }

//        Vòng lặp while

//        int count = 1;
//        int currentIndex = 1;
//        String title = "";
//        String content = "";
//
//        for (int i = 1; i < 11; i++) {
//            title += "Cửu chương " + i + "\t";
//        }
//
//        while (count < 10){
//            currentIndex = 1;
//            while (currentIndex < 11){
//                content += String.format("%d x %d = %d \t", currentIndex, count, count * currentIndex);
//                currentIndex++;
//            }
//            count++;
//            content += "\n";
//        }
//
//        System.out.print(title + "\n" + content);
//
//        int number = -1;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Mời bạn nhập 1 số bất kỳ: ");
//            number = scanner.nextInt();
//        }while (number > 0 && number < 10);
    }
}
