package strategy;

public class BookSimulator {
    public static void main(String[] args) {
        Book book = new DataStructureBook();
        book.performSize();
        book.performType();
        book.performBookStore();
        book.setSize(new A3());
        book.performSize();
        System.out.println("----------------------");
        Book book2 = new Heidi();
        book2.performSize();
        book2.performType();
        book2.performBookStore();
        System.out.println("------------------------------");
        Book book3 = new CrimeandPunishment();
        book3.performSize();
        book3.performType();
        book3.performBookStore();
    }
}
