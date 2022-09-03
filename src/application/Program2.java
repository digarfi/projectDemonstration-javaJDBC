package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		

		System.out.println("=== TEST #1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST #2: findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
					
		System.out.println("=== TEST #3: Department Insert ===");
		Department newDepartment = new Department (null,"Sports");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted: New Department = " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST #4: Department Update ===");
		Department department = departmentDao.findById(6);
		department.setName("Shoes");
		departmentDao.update(department);
		System.out.println("Update completed");
		
	
		System.out.println("\n=== TEST #5: Department Delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");
		
		
		
	}

}
