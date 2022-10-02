import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Employee> empList = new ArrayList<>();
	        empList.add(new Employee("Nataraja G", "Accounts", 8000));
	        empList.add(new Employee("Nagesh Y", "Admin", 15000));
	        empList.add(new Employee("Vasu V", "Security", 2500));
	        empList.add(new Employee("Amar", "Entertinment", 12500));
	        
	        //sort the employee details based on salary
	        empList.stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).forEach(System.out::println); 
	       
	        System.out.println("*************************");
	        
	        //get the list in uppercase
	        List<String> vehicles = Arrays.asList("bus", "car","bicycle","flight","traing");
	        vehicles.stream().map(String::toUpperCase).forEach(System.out::println);
	        
	        //sort the list
	        System.out.println("*************************");
	        Stream.of("bus","car","bicycle","flight","train")
	        .sorted().forEach(System.out::println);
	        
	}

}
