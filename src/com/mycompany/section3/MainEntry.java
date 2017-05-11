/**
 * 
 */
package com.mycompany.section3;

/**
 * @author tconti97
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t =new TeacherImp1("ilker", "java");
		Student s=new StudentImp1("thomas", "java");
		p1=(Person) t;
		p2=(Person) s;
		System.out.println("Person 1 name: "+p1.getName());
		System.out.println("Person 2 name: "+p2.getName());
	}

}
