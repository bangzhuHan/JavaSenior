package IOStream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferTest {
    @Test
    public void BufferedStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.提供File类的对象，指明写出到的文件
            /**
                对于非文本文件，在创建File类对象时要使用绝对路径
             */
            File srcFile = new File("C:\\Users\\xiehan\\Desktop\\男孩的成长.jpg");
            File destFile = new File("C:\\Users\\xiehan\\Desktop\\男孩的成长2.jpg");

            //2.创建输入流和输出流的对象
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //3.创建输入缓冲流和输出缓冲流的对象
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[1024];
            int len;
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流资源的关闭
            try {
                if(bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
