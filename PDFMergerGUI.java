import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JButton addButton = new JButton("Add PDF");
        JButton removeButton = new JButton("Remove Selected");

        // Adding PDF file dialog
        addButton.addActionListener(e -> addPDFFile());

        // Removing selected file
        removeButton.addActionListener(e -> {
            int selectedIndex = pdfList.getSelectedIndex();
            if (selectedIndex != -1) {
                pdfListModel.remove(selectedIndex);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addPDFFile() {
        // Implement file chooser here
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PDFMergerGUI frame = new PDFMergerGUI();
            frame.setVisible(true);
        });
    }
}

