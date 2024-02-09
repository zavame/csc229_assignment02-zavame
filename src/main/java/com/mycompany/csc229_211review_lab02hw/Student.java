package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
	// ToDo 1: Make this class a child of Person

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create setter and getter
	private double GPA;
	// ToDo 4: Add comments to your code

    private String address;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, short age) {
        super(name, age);;
        address="";
    }

    @Override
    public String toString() {
        return getName()+" who is "+getAge()+" years old, and lives in "+getAddress()+" has " + getGPA()+" GPA score.";;
    }
}
