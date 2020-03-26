/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsapi;

import bean.Student;
import bean.Teacher;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        HashMap<Teacher, Student> students = new HashMap<>();

        Teacher teacher1 = new Teacher(1, "Elvin", "Abdullayev");
        Teacher teacher2 = new Teacher(2, "Elvin", "Abdullayev");

        students.put(teacher1, new Student(1, "cavad", "suleymanov"));

    students.put(teacher2, new Student(2, "lale", "ehmedova"));

        System.out.println("get is called");
  
        System.out.println(students.get(teacher2));

     
        }
    

}

/*Demeli eger hashcode ile equalsi sovdelesdirmesek,onda bucxekt
yaranmayacag,ve hal hazirda bu kodlarda bu bash verir,bir bucket yaranib cemi,
hansi studenti gonderirikse gonderek gedib axirincinin yerinde oturur,bunu gormek ucun 
teacherde hashcode return 1 yazmisig ki,yeni bunlarin teacherlerin hash code lari birdir,
bucketi hashcode gore teyin etdiyi ucun burda sovdelesme bele yoxdurki bu eynidir ya ferqli
*
*
*
*
 */
