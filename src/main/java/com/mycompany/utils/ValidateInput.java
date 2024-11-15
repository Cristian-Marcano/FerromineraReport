package com.mycompany.utils;

import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class ValidateInput {
    
    public static void isEmptyOrBlank(List<JTextField> inputs) throws Exception {
        String names = "";
        for(JTextField input: inputs)
            if(input.getText().isEmpty() || input.getText().isBlank()) names += (names.isEmpty()) ? input.getName() : ", " + input.getName();
        
        if(!names.isEmpty()) throw new Exception(names + " estan vacios");
    }
    
    public static void isMinimumLength(JTextField input, int length) throws Exception {
        if(input.getText().length() < length) throw new Exception(input.getName() + "debe de tener un minimo de " + length + " caracteres");
    }
    
    public static void isMinimumLength(JPasswordField input, int length) throws Exception {
        if(input.getPassword().length < length) throw new Exception(input.getName() + "debe de tener un minimo de " + length + " caracteres");
    }
}
