/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class LeerDoc {
    
    private File documento=null;
    private FileReader fr=null;
    private BufferedReader br = null;

    public LeerDoc(String cadena) throws IOException {
         this.documento = new File(cadena);
        if(!documento.exists())
        {
        noExiste(cadena);
        }else{
            existe(cadena);
        }
    }
        
     public void noExiste(String archivo)  {// metodo que comprueba que existe el archivo 
      this.documento = new File(archivo);
      
      if(!documento.exists())
        {
            System.out.println("El fichero no existe");
        }
 
      }  
     
     public void existe(String archivo) throws FileNotFoundException, IOException{
       this.documento = new File(archivo);
      
      if(documento.exists())
        {
          String cadena;
          
      this.fr= new FileReader(archivo);
      this.br = new BufferedReader(fr);
      while((cadena = br.readLine())!=null) {
          System.out.println(cadena);
      }
      br.close();
          
      }
     }


}
