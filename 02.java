import java.io.*;

public class J02 {
    public static void main(String[] args) {
        char data[] = new char[128];
        try {
            FileReader fr = new FileReader("C:\\新增資料夾\\knowledge is power.txt");
            int num = fr.read(data);
            System.out.println("Characters read = " + num);

            String str = new String(data).toUpperCase();
            System.out.println(str);

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

