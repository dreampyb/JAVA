package csv;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class Test {
	public static void main(String[] args) {

		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(),                            // name
				new ParseInt(new NotNull()), //age
				new ParseDate("yyyy/MM/dd") , //
				new StrRegEx("[a-z0-9\\._]+@[a-z0-9\\.]+"),
				new Optional()		
		};

	Path path = Paths.get("c:/work/employee.csv");
	
	ICsvBeanReader b = null;
	
	try {
		
	 b = new CsvBeanReader(Files.newBufferedReader(path),
			 CsvPreference.STANDARD_PREFERENCE);
	 String[] header = b.getHeader(true);
	 Employee em;
	 while((em = b.read(Employee.class, header, processors)) != null){
		 System.out.println(em.getEmail()+em.getName()+em.getNote()+em.getAge()+em.getBirth());
	 }
		 
	}catch (IOException e) {
		e.printStackTrace();
		
	}finally {
	if(b!=null) try {b.close();} catch (IOException e) {e.printStackTrace();}
	}
	}
}