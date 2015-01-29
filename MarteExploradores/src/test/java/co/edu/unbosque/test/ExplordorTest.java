/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Andres
 */
public class ExplordorTest {
    
        @Test
    public void noexiste() throws FileNotFoundException, IOException{
        LeerDoc leer = new LeerDoc("C:/Users/Andres/Desktop/exploradoe.txt");        
    }
    
        @Test
    public void existe() throws FileNotFoundException, IOException{
        LeerDoc leer = new LeerDoc("C:/Users/Andres/Desktop/exploradores.txt");        
    } 
    
    
   
    
}
