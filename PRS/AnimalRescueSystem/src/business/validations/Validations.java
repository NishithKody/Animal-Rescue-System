/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nishi
 */
public class Validations {
    
    public boolean lengthCheck(String val){
        
        
        if(val.length()<=0 || val.length()>30){
            return false;
        }
        
        return true;
    }
    
    public boolean numberCheck(String val) {

        try {
            int temp = Integer.parseInt(val);
        } catch (Exception err) {
            return false;
        }

        return true;
    }
    
    public boolean emailCheck(String val) {

        if(!val.matches("^(.+)@(\\S+)$")){
            return false;
        }
        
        return true;
    }
    
    public boolean passwordCheck(String val) {

        if(val.length()<3 || val.length()>20){
            return false;
        }

        return true;
    }
    
    public boolean ageCheck(String val) {
        
        try{
            if(val.length()< 1|| val.length()>3){
                return false;
            }

            if(Integer.parseInt(val)>150){
                return false;
            }
        }
        catch(Exception e){
            return false;
        }

        return true;
    }
    
    public boolean phoneCheck(String val) {
        
        if(val.length()<5 || val.length()>15){
            return false;
        }

        
        return true;
    }
    
    
    public boolean checkStringAndNumber(String toCheck){
        var PATTERN = "^[a-zA-Z0-9]+$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(toCheck);
 
        if(!match.matches()){
            return false;
        }
        else
         return true;
    }
    
    public boolean checkNumber(String toCheck){
                        var PATTERN = "[0-9]+";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(toCheck);
        if(!match.matches()){
            return false;
        }
        else
         return true;
    } 
    
}
