package java_intro;
import javax.swing.JOptionPane;

public class HelloWorld{
    public static void main(String[] args) {
        String result;
        System.out.println("Hello World");
        result = JOptionPane.showInputDialog("Tên của bạn là:");
        JOptionPane.showMessageDialog(null,"Xin chào " + result +" !");
        System.exit(0);
    }

}
