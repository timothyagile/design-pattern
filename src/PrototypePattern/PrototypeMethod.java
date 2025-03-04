package PrototypePattern;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class PrototypeMethod {

    public static void demoPrototypeMethod () {
        List<Document> documentList = new ArrayList<>();
        List<Document> copyDocumentList = new ArrayList<>();

        WordDocument wordDocument = new WordDocument("Dive to design pattern",
                "23 pattern gang of four",
                "Alexonder Shevets",
                "xxxx",
                "Times New Roman",
                9999);

        PDFDocument pdfDocument = new PDFDocument("Dive to design pattern",
                "23 pattern gang of four",
                "Alexonder Shevets",
                "xxxx",
                "1.7",
                true);

        SpreadsheetDocument spreadsheetDocument = new SpreadsheetDocument(
                "SE401 Class list",
                "Students list in SE401 class",
                "Lecturer",
                "February 2025",
                1,
                false);

        documentList.add(wordDocument);
        documentList.add(pdfDocument);
        documentList.add(spreadsheetDocument);

        cloneAndCompare(documentList, copyDocumentList);

        for(Document document : documentList) {
            System.out.println(document.title);
        }

        for(Document document : copyDocumentList) {
            System.out.println(document.title);
        }
    }

    private static void cloneAndCompare(List<Document> documentList,
                                        List<Document>copyDocumentList) {
        for (Document document : documentList) {
            copyDocumentList.add(document.clone());
        }

        for(int i = 0; i < documentList.size(); i++) {
            if(documentList.get(i) != copyDocumentList.get(i)) {
                System.out.println(i + ": Documents are different object");
                if(documentList.get(i).equals(copyDocumentList.get(i)))
                    System.out.println(i + ": And they are identical");
                else  {
                    System.out.println(i + ": But they are not identical");
                }
            }
            else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }
}
