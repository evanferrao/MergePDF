import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.IOException;

public class PDFMerger {

    public static void mergePDFs(String[] pdfFiles, String outputFile) throws IOException {
        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        pdfMerger.setDestinationFileName(outputFile);

        // Add source PDF files
        for (String pdfFile : pdfFiles) {
            pdfMerger.addSource(pdfFile);
        }

        // Merge documents
        pdfMerger.mergeDocuments(null);
        System.out.println("PDFs merged into " + outputFile);
    }

    public static void main(String[] args) {
        String[] pdfFiles = {"file1.pdf", "file2.pdf", "file3.pdf"};
        String outputFile = "merged_output.pdf";
        
        try {
            mergePDFs(pdfFiles, outputFile);
        } catch (IOException e) {
            System.err.println("Error merging PDFs: " + e.getMessage());
        }
    }
}

