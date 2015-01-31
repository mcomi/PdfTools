package mx.mcomix.itext;


import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PosicionPDF {
  private static String FILE = "C:/Users/messi/Documents/workspace/PDFtools/output/PosicionesPdf.pdf";

  public static void main(String[] args) {
    try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(FILE));
      document.open();
      // Left
      Paragraph paragraph = new Paragraph("Este texto está alineado a la derecha");
      paragraph.setAlignment(Element.ALIGN_RIGHT);
      document.add(paragraph);
      // Centered
      paragraph = new Paragraph("Este texto está centrado");
      paragraph.setAlignment(Element.ALIGN_CENTER);
      document.add(paragraph);
      // Left
      paragraph = new Paragraph("Este texto está alineado a la izquierda");
      paragraph.setAlignment(Element.ALIGN_LEFT);
      document.add(paragraph);
      // Left with indentation
      paragraph = new Paragraph("Texto alineado a la izquierda con sangría");
      paragraph.setAlignment(Element.ALIGN_LEFT);
      paragraph.setIndentationLeft(50);
      document.add(paragraph);

      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

} 

