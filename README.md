# Person
Interface with methods: getName() and getDetails().

# PersonBaseImp1
Abstract class that implements Person.
Contains String name, and has a constructor for initializing name.
Implements methods from Person.

# Teacher
Interface with method teachesFor().

# TeacherImp1
Class that extends PersonBaseImp1 implements Teacher.
Contains String thoughtCourseTitle and Constructor that calls PersonBaseImp1 for name and initializes thoughtCourseTitle.
Implements method from Teacher.

# Student
Interface with method studiesFor().

# StudentImp1
Class that extends PersonBaseImp1 implements Student.
Contains String takenCourseTitle and Constructor that calls PersonBaseImp1 for name and initializes takenCourseTitle.
Implements method from Student.

# MainEntry
Contains Person p1 and Person p2, Teacher t initialized as a TeacherImp1, Student s initialized as a StudentImp1.
Sets p1 = t, and p2 = s.
Displays the names of p1 and p2.