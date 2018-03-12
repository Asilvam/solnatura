
package controller;

import controller.modelos.Conectar;
import controller.modelos.Usuario;
import controller.modelos.UsuarioValidar;
import static java.lang.Integer.parseInt;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;


public class UsuarioFormController {
    private final JdbcTemplate jdbcTemplate;
    private final UsuarioValidar usuariovalidar;

    public UsuarioFormController() {
        
        this.usuariovalidar=new UsuarioValidar();
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar() );
    }
      
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView usuarioform()
    {
       ModelAndView mav=new ModelAndView();
        mav.setViewName("usuarioform");
        mav.addObject("usuario",new Usuario());
        return mav;
    }
    
    //validar
 /*   @RequestMapping(value="usuarioform.htm",method=RequestMethod.POST)
    public String usuarioform(Usuario usu,ModelMap model)
    {
        model.addAttribute("user",usu.getUser());
        model.addAttribute("pass",usu.getPass());
        model.addAttribute("tipo",usu.getTipo());
        model.addAttribute("email",usu.getEmail());
        return "exitousuario";
    } 
 */
    //recibimos y validamos los datos de nuestro formulario
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView usuarioform
                            (
                               @ModelAttribute("usuario") Usuario u,
                               BindingResult result,
                               SessionStatus status
                            )
    {
        this.usuariovalidar.validate(u, result);
        if(result.hasErrors())
        {
            //acá volvemos al formulario
            //porque los datos ingresados por el usuario
            //no son correctos es decir que se ejecutó la validación
            ModelAndView mav=new ModelAndView();
            mav.setViewName("usuarioform");
            mav.addObject("usuario",new Usuario());
            return mav;
        }else
        {
            //acá entramos si el usuario ingresó bien los datos y trae siguiente id valido desde la tabla
              
            String sql="select nextval(\'solnatura.secidusuario\') ";             
            List datos= jdbcTemplate.queryForList(sql); 
            String s=datos.get(0).toString();
            s=s.substring(9);
            s=s.replace("}","");          
            int idusuario= parseInt(s);
            this.jdbcTemplate.update
        (
        "insert into solnatura.usuario (id , pass,tipo,\"user\",creado,actualizado, email) values (?,?,?,?,?,?,?)",
         idusuario,
         u.getPass(),
         u.getTipo(),
         u.getUser(),
         null,
         null,
         u.getEmail()
        );
        return new ModelAndView("redirect:/usuariomant.htm");
        }
    } 
    //metodo poblar select
    @ModelAttribute("tipolista")
    public Map<String,String> listadoTipo(){
    
    Map<String,String> tipo =new LinkedHashMap<>();
    tipo.put ("A","Administrador");
    tipo.put("O","Operador");
    return tipo;
    
    }
    
}