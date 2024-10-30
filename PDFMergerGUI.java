import org.apache.pdfbox.multipdf.PDFMergerUtility;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class PDFMergerGUI extends JFrame {

    private DefaultListModel<String> pdfListModel;
    private JTextField outputFileNameField;

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
        JButton mergeButton = new JButton("Merge PDFs");

        // Adding PDF file dialog
        addButton.addActionListener(e -> addPDFFile());

        // Removing selected file
        removeButton.addActionListener(e -> {
            int selectedIndex = pdfList.getSelectedIndex();
            if (selectedIndex != -1) {
                pdfListModel.remove(selectedIndex);
            }
        });

        // Merging PDFs
        mergeButton.addActionListener(e -> mergePDFs());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(mergeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Panel for output filename
        JPanel bottomPanel = new JPanel();
        outputFileNameField = new JTextField(20);
        outputFileNameField.setText("merged_output.pdf");
        bottomPanel.add(new JLabel("Output file:"));
        bottomPanel.add(outputFileNameField);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void addPDFFile() {
        // Implement file chooser here
    }

    private void mergePDFs() {
        // Implement merging functionality here
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PDFMergerGUI frame = new PDFMergerGUI();
            frame.setVisible(true);
        });
    }
}

