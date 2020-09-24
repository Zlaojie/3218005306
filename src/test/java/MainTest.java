import java.io.IOException;
// 测试的类
public class MainTest {

    @org.junit.Test
    public void testMain(){
        String[] paths = {
                "D:\\test\\test\\orig.txt",
                "D:\\test\\test\\orig_0.8_add.txt",
                "D:\\test\\test\\res.txt"
        };
        try {
            PaperPath.main(paths);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO流异常");
        }
    }
}