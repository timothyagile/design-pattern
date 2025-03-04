package PrototypePattern;

import java.util.Objects;

public class WordDocument extends Document {
    protected String font;
    protected long wordCount;

    public WordDocument() {

    }

    public WordDocument(String title, String content, String author,
                        String createdAt, String font, long wordCount) {
        super(title, content, author, createdAt);
        this.font = font;
        this.wordCount = wordCount;
    }

    public WordDocument(WordDocument target) {
        super(target);
        if(target != null) {
            this.font = target.font;
            this.wordCount = target.wordCount;
        }
    }

    @Override
    public Document clone() {
        return new WordDocument(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof WordDocument) || !super.equals(object2))
            return false;
        WordDocument wordDocument2 = (WordDocument) object2;
        return Objects.equals(wordDocument2.font, font) && wordDocument2.wordCount == wordCount;
    }
}
