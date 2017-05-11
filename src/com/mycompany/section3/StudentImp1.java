/**
 * 
 */
package com.mycompany.section3;

/**
 * @author tconti97
 *
 */
public class StudentImp1 extends PersonBaseImp1 implements Student 
{
	private String takenCourseTitle;
	
	public StudentImp1(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle=_takenCourseTitle;
	}
	
	
	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getDetails()
	 */
	@Override
	public String getDetails() 
	{
		return "student";
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Student#studiesFor()
	 */
	@Override
	public String studiesFor() 
	{
		return takenCourseTitle;
	}

}
