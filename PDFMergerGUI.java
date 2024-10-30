import javax.swing.*;
import java.awt.*;

public class PDFMergerGUI extends JFrame {

    private DefaultListModel<String> pdfListModel;

    public PDFMergerGUI() {
        setTitle("PDF Merger");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pdfListModel = new DefaultListModel<>();
        JList<String> pdfList = new JList<>(pdfListModel);
        JScrollPane scrollPane = new JScrollPane(pdfList);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PDFMergerGUI frame = new PDFMergerGUI();
            frame.setVisible(true);
        });
    }
}

