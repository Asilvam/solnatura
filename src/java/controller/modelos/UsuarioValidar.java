package controller.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UsuarioValidar implements Validator{

     private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
   
     private Pattern pattern;
     private Matcher matcher;
     
    @Override
    public boolean supports(Class<?> type)
    {
    return Usuario.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
       
        Usuario usuario=(Usuario)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user", "required.user","El Campo User es Obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pass", "required.pass","El Campo Password es Obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required.email","El Campo Email es Obligatorio");
        
        if (!(usuario.getEmail() != null && usuario.getEmail().isEmpty()))
        {
            this.pattern = Pattern.compile(EMAIL_PATTERN);
            this.matcher = pattern.matcher(usuario.getEmail());
             if (!matcher.matches()) {
                errors.rejectValue("email", "email.incorrect",
                  "El E-Mail "+usuario.getEmail()+" no es válido");
               }
        }
        
        if(usuario.getTipo().contentEquals("Z"))
        {
	    errors.rejectValue("tipo", "required.tipo","Seleccione Tipo de Usuario");       
        }      
    }    
}
