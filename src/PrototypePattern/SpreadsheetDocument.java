package PrototypePattern;

import java.util.Objects;

public class SpreadsheetDocument extends Document{
    protected boolean hasFormula;
    protected long sheetCount;

    public SpreadsheetDocument() {

    }

    public SpreadsheetDocument(String title, String content, String author,
                        String createdAt, long sheetCount, boolean hasFormula) {
        super(title, content, author, createdAt);
        this.sheetCount = sheetCount;
        this.hasFormula = hasFormula;
    }

    public SpreadsheetDocument(SpreadsheetDocument target) {
        super(target);
        if(target != null) {
            this.hasFormula = target.hasFormula;
            this.sheetCount = target.sheetCount;
        }
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof SpreadsheetDocument) || !super.equals(object2))
            return false;
        SpreadsheetDocument SpreadsheetDocument2 = (SpreadsheetDocument) object2;
        return Objects.equals(SpreadsheetDocument2.sheetCount, sheetCount)
                && SpreadsheetDocument2.hasFormula == hasFormula;
    }
}
