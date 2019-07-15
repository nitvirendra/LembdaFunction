import java.util.Comparator;

public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		if(arg0.getId() < arg1.getId())
			return 1;
		else if(arg0.getId() > arg1.getId())
			return -1;
		else
			return 0;
	}
}
