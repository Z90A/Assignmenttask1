package assignmenttask1;

import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.*;
import static java.lang.System.*;


	class RecursiveWage {

	    public RecursiveWage() {
	        List<Employee> workers = new LinkedList<>();
	        
	        workers.add(new Employee(5, 17.5));
	        
	        workers.add(new Employee(16, 15.5));
	        
	        workers.add(new Employee(28, 19.0));
	        
	        double total = getTotalWage(workers);
	        
	        System.out.printf("Total wage: %.2f", total);//prints message
	    }

	    public double getTotalWage(List<Employee> list) {
	        if (list.isEmpty()) {
	            return 0.0;
	        } else {
	            Employee employee = list.remove(0);
	            double wage = employee.getWage();
	            return wage + getTotalWage(list);
	        }
	    }
	}
	

        //Note, this needs to be a recursive method

    