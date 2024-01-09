/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo;

/**
 *
 * @author Mohamed Sakr
 */
public class LionFactory implements AnimalFactory{

    @Override
    public Animal CreateAnimal() {
      return new Lion();
    }
    
}
