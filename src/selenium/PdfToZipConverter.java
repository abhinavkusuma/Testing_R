package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PdfToZipConverter {

    public static void main(String[] args) {
        // Path to your PDF file
        String pdfFilePath = "C:\\Users\\91934\\Downloads\\Abhinav---Kusuma.pdf";
        // Path to the ZIP file you want to create	
        String zipFilePath = "C:\\Users\\91934\\Downloads\\Abhinav---Kusuma.zip";

        File pdfFile = new File(pdfFilePath);

        try (
            FileOutputStream fos = new FileOutputStream(zipFilePath);
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            FileInputStream fis = new FileInputStream(pdfFile)
        ) {
            // Use actual file name in the ZIP
            ZipEntry zipEntry = new ZipEntry(pdfFile.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }

            System.out.println("PDF file has been successfully zipped as: " + zipFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}