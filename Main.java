import java.io.*;

public class Main {
    public static void main(String[] args) {
        File Games = new File("D://Games");
        if (Games.mkdir()) {
            System.out.println("Directory created"+ Games.getName());

        } else {
            System.out.println("Directory not created");
        }
        File src = new File("D://Games/src");
        if (src.mkdir()) {
            System.out.println("Directory created "+ src.getName());
        } else {
            System.out.println("Directory not created");
        }
        File main = new File("D://Games/src/main");
        if (main.mkdir()) {
            System.out.println("Directory created "+ main.getName());

        } else {
            System.out.println("Directory not created");
        }
// Создание файлов в папке main- Main.java
        File mainjava = new File("D://Games/src/main", "Main.java");
        try {
            if (mainjava.createNewFile()) {
                System.out.println("File created " + mainjava.getName());
            } else {
                System.out.println("File not created " + mainjava.getName());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Создание файла в папке main - Utils.java
        File Utils = new File("D://Games/src/main", "Utils.java");
        try {
            if (Utils.createNewFile()) {
                System.out.println("File created " + Utils.getName());
            } else {
                System.out.println("File not created " + Utils.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File test = new File("D://Games/src/test");
        if (test.mkdir()) {
            System.out.println("Directory created "+ test.getName());
        } else {
            System.out.println("Directory not created");
        }

        File res = new File("D://Games/res");
        if (res.mkdir()) {
            System.out.println("Directory created "+ res.getName());

        } else {
            System.out.println("Directory not created");
        }

        File drawables = new File("D://Games/res/drawables");
        if (drawables.mkdir()) {
            System.out.println("Directory created"+ drawables.getName());
        } else {
            System.out.println("Directory not created");
        }

        File vectors = new File("D://Games/res/vectors");
        if (vectors.mkdir()) {
            System.out.println("Directory created "+ vectors.getName());

        } else {
            System.out.println("Directory not created");
        }

        File icons = new File("D://Games/res/icons");
        if (icons.mkdir()) {
            System.out.println("Directory created "+ icons.getName());

        } else {
            System.out.println("Directory not created");
        }


        File savegames = new File("D://Games/savegames");
        if (savegames.mkdir()) {
            System.out.println("Directory created "+ savegames.getName());

        } else {
            System.out.println("Directory not created");
        }

        File temp = new File("D://Games/temp");
        if (temp.mkdir()) {
            System.out.println("Directory created "+ temp.getName());

        } else {
            System.out.println("Directory not created");
        }
        // Создание файла в папке temp - temp.txt
        File temptxt = new File("D://Games/temp", "temp.txt");
        try {
            if (temptxt.createNewFile()) {
                System.out.println("File created " + temptxt.getName());
            } else {
                System.out.println("File not created " + temptxt.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // сохранение в файл лога
        StringBuilder StringBuilder = new StringBuilder();
        StringBuilder.append ("Директорий \"res\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Директорий \"savegames\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Директорий \"src\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Директорий \"temp\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Файл \"temp.txt\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Файл \"Main.java\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Файл \"Utils.java\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Директорий \"drawables\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Директорий \"icons\" cоздан успешно "  + "\r\n" );
        StringBuilder.append ("Директорий \"vectors\" cоздан успешно "  + "\r\n" );



        FileWriter write = null;
        try {
            write = new FileWriter("D:\\Games\\temp\\temp.txt", false);

            System.out.println("Запись в файл");
            write.write(StringBuilder.toString());
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {

            try {
                if (write != null) {

                    System.out.println("Поток закрыт");
                    write.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




















