import java.io.IOException;

/**
 * Created by LF on 12/03/2017.
 */
public class Main {
    public static void main(String[] args){
        ExportToPDF pdf = new ExportToPDF();

        pdf.createDocument("Test");
        System.out.println("Document Créé !");
    }
}
