package PrototypePattern;

import java.util.Objects;

public class PDFDocument extends Document{
    protected boolean isEncrypt;
    protected String PDFVersion;

    public PDFDocument() {

    }

    public PDFDocument(String title, String content, String author,
                        String createdAt, String PDFVersion, boolean isEncrypt) {
        super(title, content, author, createdAt);
        this.isEncrypt = isEncrypt;
        this.PDFVersion = PDFVersion;
    }

    public PDFDocument(PDFDocument target) {
        super(target);
        if(target != null) {
            this.isEncrypt = target.isEncrypt;
            this.PDFVersion = target.PDFVersion;
        }
    }

    @Override
    public Document clone() {
        return new PDFDocument(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof PDFDocument) || !super.equals(object2))
            return false;
        PDFDocument pdfDocument2 = (PDFDocument) object2;
        return Objects.equals(pdfDocument2.PDFVersion, PDFVersion)
                && pdfDocument2.isEncrypt == isEncrypt;
    }
}
