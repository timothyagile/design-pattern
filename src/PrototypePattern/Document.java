package PrototypePattern;

import java.awt.*;
import java.util.Date;
import java.util.Objects;

public abstract class Document {
    protected String title;
    protected String content;
    protected String author;
    protected String createdAt;

    public Document() {

    }

    public Document(String title, String content, String author, String createdAt) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public Document(Document target) {
        this.title = target.title;
        this.content = target.content;
        this.author = target.author;
        this.createdAt = target.createdAt;
    }

    public abstract Document clone();


    @Override
    public boolean equals (Object object2) {
        if(!(object2 instanceof Document))
            return false;

        Document document2 = (Document) object2;

        return Objects.equals(document2.title, title)
                && Objects.equals(document2.content, content)
                && Objects.equals(document2.author, author)
                && Objects.equals(document2.createdAt, createdAt);

    }
}
