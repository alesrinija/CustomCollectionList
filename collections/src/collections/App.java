package collections;

public class App {
	public static void main( String[] args )
    {
		CustomCollectionList<String> list = new CustomCollectionList<>();
        //Adding 10 elements as mentioned in the task
        list.add(" Hello ");
        list.add(" Good morning ");
        list.add(" Software Testing types ");
        list.add(" Unit ");
        list.add(" Integration ");
        list.add(" System ");
        list.add(" Smoke ");
        list.add(" Interface ");
        list.add(" Regression ");
        list.add(" Beta ");
        list.print();
        list.remove(2);
        list.print();
        
    }

}
