package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Employee {
	private String name;
	private String Department;
	private int age;

	private String getName() {
		return name;
	}

	private String getDepartment() {
		return Department;
	}

	private int getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setDepartment(String department) {
		Department = department;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, String department, int age) {
		if ((name == null && name.trim().equals(""))) {
			throw new IllegalArgumentException("Give Proper name of Employee");
		} else {
			this.name = name;
		}
		if ((Department == null && department.trim().equals(""))) {
			throw new IllegalArgumentException("Give proper name of department");
		} else {
			Department = department;
		}
		if ((age < 0 || age > 100)) {
			throw new IllegalArgumentException("Give proper age ");
		} else {
			this.age = age;
		}
	}

	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee e1 = (Employee) obj;
			if (this.name.equals(e1.name) && this.Department.equals(e1.Department) && this.age == e1.age) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public String toString() {

		return ("name = " + this.name + " Department = " + this.Department + " age = " + this.age);

	}

	public int hashcode() {
		return (this.name + this.age + this.Department).hashCode();

	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		List<Employee> al = new ArrayList<Employee>();
		int c = 1;
		while (c != 0) {
			System.out.println("Enter 1 to add an employee");
			System.out.println("Enter 2 to list an employee");
			System.out.println("Enter 3 to list an employee based on name");
			System.out.println("Enter 4 to list an employee based on Department");
			System.out.println("Enter 5 to list an employee based on age");
			System.out.println("Enter 6 to Exit");
			int choice = sc2.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name");
				String name = sc1.next();
				System.out.println("Enter Department");
				String dept = sc1.next();
				System.out.println("Enter age");
				int age = sc2.nextInt();
				Employee e = new Employee(name, dept, age);
				al.add(e);
				break;

			case 2:if(al.isEmpty()) {
				System.out.println("Please Add Employee");
			}else {
				System.out.println(al);
			}
				break;

			case 3:
				Collections.sort(al, new Comparator() {
					public int compare(Object obj1, Object obj2) {
						if (obj1 instanceof Employee && obj2 instanceof Employee) {
							Employee e1 = (Employee) obj1;
							Employee e2 = (Employee) obj2;
							return (e1.getName().compareTo(e2.getName()));
						}
						return 0;
					}

				});
				System.out.println("Sorted by name = " + al);
				break;
			case 4:
				Collections.sort(al, new Comparator() {
					public int compare(Object obj1, Object obj2) {
						if (obj1 instanceof Employee && obj2 instanceof Employee) {
							Employee e1 = (Employee) obj1;
							Employee e2 = (Employee) obj2;
							return (e1.getDepartment().compareTo(e2.getDepartment()));
						}
						return 0;
					}
				});
				System.out.println("sorted by Department = " + al);
				break;
			case 5:
				Collections.sort(al, new Comparator() {
					public int compare(Object obj1, Object obj2) {
						if (obj1 instanceof Employee && obj2 instanceof Employee) {
							Employee e1 = (Employee) obj1;
							Employee e2 = (Employee) obj2;
							return (e1.getAge() - (e2.getAge()));
						}
						return 0;
					}
				});
				System.out.println("Sorted by Age = " + al);
				break;
			case 6:
				System.out.println("Program ends");
				System.exit(0);
				break;
			default:
				System.out.println("Give proper Value ");
				break;

			}
		}

		sc1.close();
		sc2.close();
	}

}
