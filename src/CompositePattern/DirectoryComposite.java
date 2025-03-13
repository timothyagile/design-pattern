package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void addComponent(FileComponent component) {
        children.add(component);
    }

    public void removeComponent(FileComponent component) {
        children.remove(component);
    }

    @Override
    public void showProperty() {
        System.out.println("DirectoryComposite [name=" + name + "]");
        for (FileComponent component : children) {
            component.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent component : children) {
            total += component.totalSize();
        }
        return total;
    }
}
