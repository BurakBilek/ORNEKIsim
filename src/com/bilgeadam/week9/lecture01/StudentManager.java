package com.bilgeadam.week9.lecture01;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	List<Student> ogrenciler;

	public void baslangicVerisiOlustur() {
		ogrenciler = new ArrayList<Student>();
		Student student = new Student(1, "Alperen", "MF");
		student.getNotlar().add(90.0);
		student.getNotlar().add(95D);
		student.getNotlar().add(100.0);

		Student student2 = new Student(2, "Mahmut", "TM");
		student2.getNotlar().add(50.0);
		student2.getNotlar().add(65.0);
		student2.getNotlar().add(90.0);

		Student student3 = new Student(3, "Fatma", "MF");
		student3.getNotlar().add(75.0);
		student3.getNotlar().add(50.0);
		student3.getNotlar().add(83.0);

		Student student4 = new Student(4, "Ali", "MF");
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(100.0);

		Student student5 = new Student(5, "Ayse", "TM");
		student5.getNotlar().add(45.0);
		student5.getNotlar().add(40.0);
		student5.getNotlar().add(40.0);

		Student student6 = new Student(6, "Alican", "TM");
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(100.0);

		// Ogrencileri ogrenci listesine ekleme yontem 1;
//		ogrenciler.add(student);
//		ogrenciler.add(student2);
//		ogrenciler.add(student3);
//		ogrenciler.add(student4);
//		ogrenciler.add(student5);
//		ogrenciler.add(student6);

		// Ogrencileri ogrenci listesine ekleme yontem 2;
		ogrenciler = List.of(student, student2, student3, student4, student5, student6);

	}

}
