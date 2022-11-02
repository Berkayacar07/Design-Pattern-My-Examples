package strategy;

public class DataStructureBook extends Book{
    public DataStructureBook(){
        size = new A4();
        type = new LessonBook();
        bookStore = new LemanBookStore();
    }
}
