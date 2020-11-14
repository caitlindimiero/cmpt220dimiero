import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class prj3 {
	public static void main(String[] args) throws Exception { 
		Scanner input = new Scanner(System.in); // Scanner for input
		Scanner strings = new Scanner(System.in); // Scanner for strings
		System.out.println("Enter the year: "); // Get user input for year
		int year = input.nextInt();
		System.out.println("Enter the gender: "); // Get user input for gender
		String gender = strings.nextLine();
		System.out.println("Enter the name: "); // Get user input for name
		String name = strings.nextLine();
		input.close(); // Close input scanner
		strings.close(); // Close strings scanner
		String fileName = "babynames" + year + ".txt"; // Makes filename from year
		ArrayList<Babynames> list = loadNames(fileName);
        Babynames run = findName(name, year, list);
        if ( run.year == -5 ) // Checks if name exists in file
            System.out.println("\'" + name + "\' does not exist.");
        else
            System.out.println(run.toString());
			}
			private static Babynames findName(String name, int year, ArrayList<Babynames> names) { // Private method header
				boolean nameFound = false;
				int indexOfName = -1;
				for(int i = 0; i < names.size(); i++){
					if(names.get(i).name.equals(name)){
						nameFound = true;
						indexOfName = i;
					}
				}
				if(nameFound) // Gives user answer
					return names.get(indexOfName); 
				else
					return new Babynames(-5, "not", "found", -5); // Returns name not found is name not found
			}	
	private static ArrayList<Babynames> loadNames(String fileName)throws Exception{ // Private method header
		File names = new File("ListofBabyNamesandYears/" + fileName); // Local file for babynames and years
		int year = Integer.parseInt(fileName.substring(9, 13));
		Scanner input = new Scanner(names); // Input scanner for names
		ArrayList<Babynames> list = new ArrayList<Babynames>();
		while(input.hasNextLine()){ // Adds babynames to the list
			int rank = Integer.parseInt(input.next());
			String gender = "m";
			String name = input.next();
			list.add(new Babynames(year, gender, name, rank));
			gender = "f";
			input.next();
			name = input.next();
			list.add(new Babynames(year, gender, name, rank));
			input.next();
		}
		input.close(); // Close input scanner
		return list; // Returns list of babynames
	}
}
