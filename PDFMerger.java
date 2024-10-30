import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.IOException;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of PDF files to merge: ");
        int numFiles = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] pdfFiles = new String[numFiles];

        // Get filenames from user
        for (int i = 0; i < numFiles; i++) {
            System.out.print("Enter the path for PDF file " + (i + 1) + ": ");
            pdfFiles[i] = scanner.nextLine();
        }

        System.out.print("Enter the output file name (with .pdf extension): ");
        String outputFile = scanner.nextLine();

        try {
            mergePDFs(pdfFiles, outputFile);
        } catch (IOException e) {
            System.err.println("Error merging PDFs: " + e.getMessage());
        }

        scanner.close();
    }
}

