package strategy;

public class LemanBookStore implements IBookStore{
    @Override
    public void bookStoreName() {
        System.out.println("This book was published in Leman Book Store");
    }
}
