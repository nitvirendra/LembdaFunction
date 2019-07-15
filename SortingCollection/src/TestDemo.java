
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDemo{
	public static void main(String[] args) {
       
		List<Student> student=new ArrayList<Student>();
		student.add(new Student(101, "viru"));
		student.add(new Student(102, "sugreev"));
		student.add(new Student(103, "shyam"));
		student.add(new Student(105, "hari"));
		Collections.sort(student, /*new SortById()*/(a,b)->(a.getId() < b.getId()?1:(a.getId() > b.getId())?-1:0));
		student.forEach(i->System.out.println(i.getName()+" : "+i.getId()));
		/*
		 * for (Student student2 : student) {
		 * System.out.println(student2.getName()+" : "+student2.getId()); }
		 */
	}
}
