/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author User
 */
public class Student extends Person {

    public Student(int id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public int hashCode() {
        return 2;
    }
}
