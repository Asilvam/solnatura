
package controller;

import controller.modelos.Conectar;
import controller.modelos.Lista;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

public class UsuarioMantController 
{
    private final JdbcTemplate jdbcTemplate;
    
    public UsuarioMantController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("usuariomant.htm")
    public ModelAndView usuariomant()
    {
        ModelAndView mav=new ModelAndView();
        String sql="SELECT id ,\"user\", pass,tipo, email FROM solnatura.usuario order by id ";
        List datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("usuariomant");
        
//        String tabla ="privilegio";
//        List<Lista> list = UsuarioMantControllerHB.getListaDetails(tabla);
//        for (Lista lis: list){
//            System.out.println(lis.getCampo());
//            System.out.println(lis.getValor());
//        }
        return mav;
    }
}

