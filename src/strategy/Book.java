package strategy;

public abstract class Book {
    ISize size;
    IType type;
    IBookStore bookStore;

    public Book() {
    }
    public void performSize(){
        size.size();
    }
    public void performType(){
        type.type();
    }
    public void performBookStore(){
        bookStore.bookStoreName();
    }

    public void setBookStore(IBookStore bookStore) {
        this.bookStore = bookStore;
    }

    public void setSize(ISize size) {
        this.size = size;
    }

    public void setType(IType type) {
        this.type = type;
    }
}
