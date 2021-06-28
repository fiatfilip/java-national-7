package ro.siit.session5;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfGenerator {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("cursanti.pdf"));
            document.open();
            Chapter c1 = new Chapter("Cursanti", 1);
            Section prezent = c1.addSection("Prezenti");
            Section absent = c1.addSection("Absenti");
            prezent.add(new Paragraph("Filip Fiat"));
            absent.add(new Paragraph("John Doe"));
            document.add(c1);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
