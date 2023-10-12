package baiTap.bai2;

import java.io.*;

public class Main {
    //Viết một chương trình cho phép người dùng sao chép các tập tin.
    // Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).
    //Chương trình sao chép tệp nguồn vào tệp tin đích và hiển thị số byte trong tệp.
    // Chương trình nên cảnh báo người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin đích đã tồn tại.
    //Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích, bạn nên sử dụng luồng đầu vào để đọc byte từ tệp nguồn và luồng đầu ra để gửi byte đến tệp tin đích, bất kể nội dung của tệp.
    public static void main(String[] args) {
        File file = new File("file/products.dat");
        File fileTarget = new File("src/baitap/bai2/pakage2/target.dat");
        try {
            fileTarget.createNewFile();
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
            Object copy = inputStream1.readObject();
            copy.toString();
            inputStream1.close();
            FileOutputStream outputStream = new FileOutputStream(fileTarget);
            ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
            outputStream1.writeObject(copy);
            outputStream1.close();
            System.out.println("Copy thành công");
        } catch (IOException e) {
            System.out.println("Nguồn không tồn tại");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tồn tại class trong file gốc");
        }


    }
}
