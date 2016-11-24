/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
/**
 * Hash functions utility class.
 * @author www.codejava.net
 *
 */
public class Otros {
    private static int contm=0;
    private static int contf=0;
    
    private Otros() {
            
    }
 
   public static int consecutivoMedico(){
       contm+=1;
       return contm;
   }
   
    public static int consecutivofinanciero(){
       contf+=1;
       return contf;
   }
}