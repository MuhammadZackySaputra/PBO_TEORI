/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori_2201082014;

import Teori_2201082014.Employed.Employee;

/**
 *
 * @author TUF GAMING
 */
public class PolimorfisExample {
    public static void main (String[] args){
        Person ref;
        Student studentObject = new Student();
        Employed employeeObject = new Employed();
        
        studentObject.setName("Anna");
        employeeObject.setName("Budi");
        
        //polimorfist
        ref = studentObject;
        System.out.println("Nama        :"+ref.getName());
        Person employedObject = null;
        ref = employedObject;
        System.out.println("Nama        :"+ref.getName());
    }
    
    public void printInformasi(Person ref){
        if(ref instanceof Student){
            System.out.println("Nama Student        :"+ref.getName());
            System.out.println("Alamat Student      :"+ref.getAddress());
        } else if(ref instanceof Employee) {
            System.out.println("Nama Employee       :"+ref.getName());
            System.out.println("Alamat Employee     :"+ref.getAddress());
        }
    }
}
