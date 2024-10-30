import javax.swing.*;
import java.awt.*;

public class PDFMergerGUI extends JFrame {

    public PDFMergerGUI() {
        setTitle("PDF Merger");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PDFMergerGUI frame = new PDFMergerGUI();
            frame.setVisible(true);
        });
    }
}

