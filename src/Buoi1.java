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
        int a = 5;
        int b = 5;

        int result = ++a - --b + a-- - b-- + a++ - --b - --a;
        // 6 - --b + a-- - b-- + a++ - --b - --a; a = 6, b = 5
        // 6 - 4 + a-- - b-- + a++ - --b - --a; a = 6, b = 4
        // 6 - 4 + 6 - b-- + a++ - --b - --a; a = 5, b = 4
        // 6 - 4 + 6 - 4 + a++ - --b - --a; a = 5, b = 3
        // 6 - 4 + 6 - 4 + 5 - --b - --a; a = 6, b = 3
        // 6 - 4 + 6 - 4 + 5 - 2 - --a; a = 6, b = 2
        // 6 - 4 + 6 - 4 + 5 - 2 - 5; a = 5, b = 2
        // result = 2, a = 5, b = 2
        System.out.println("Result " + result);
        System.out.println("A " + a);
        System.out.println("B " + b);
    }
}
