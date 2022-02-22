package IOStream;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.sql.SQLOutput;

public class FileWriterTest {
    /*
    结论：对于文本文件(.c,.cpp,.java,.txt),使用字符流处理
         对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc...),使用字节流处理
     */
    @Test
    public void test1() throws IOException {
        //1.提供File类的对象，指明写出到的文件
        File file = new File("Hello.txt");

        //2.构建FileWriter类的对象写出数据
        FileWriter fileWriter = new FileWriter(file);

        //3.写出的操作
        fileWriter.write("I have a dream!\n");
        fileWriter.write("Just do it!");

        //4.流的关闭
        fileWriter.close();
    }

    @Test
    public void testFileReaderFileWriter()  {
        //不能使用字符流处理图片等字节流文件
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;
            while ((len =fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    /*
        实现对图片的复制：FileInputStream FIleOutputStream
     */
     public void testFileInputOutputStream(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File srcFile = new File("C:\\Users\\xiehan\\Desktop\\男孩的成长.jpg");
            File destFile = new File("C:\\Users\\xiehan\\Desktop\\男孩的成长2.jpg");

            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            byte[] buffer = new byte[5];
            int len;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copeFile(String srcPath, String destPath){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int len;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void VideoTest(){
         long start = System.currentTimeMillis();
         String srcPath = "D:\\MobileFile\\人质-韦礼安.mp4";
         String destPath = "D:\\MobileFile\\人质2-韦礼安.mp4";
         copeFile(srcPath,destPath);
         long end = System.currentTimeMillis();
         System.out.println("复制所花费的时间为:" + (end - start));
    }


}
