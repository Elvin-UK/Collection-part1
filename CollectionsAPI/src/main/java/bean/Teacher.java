/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Teacher extends Person{

    public Teacher(int id, String name, String surname) {
        super(id, name, surname);
    }
    @Override
    public int hashCode(){
        System.out.println("hashcode=="+super.getName());
        return 1;
    }
 @Override
    public boolean equals(Object obj) {
      System.out.println("equals called"+obj);
      return super.equals(obj);
    }
}
