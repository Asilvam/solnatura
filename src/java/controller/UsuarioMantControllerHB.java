/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.modelos.HibernateUtil;
import controller.modelos.Lista;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AleSofT
 */
public class UsuarioMantControllerHB {
 
    
    public static List<Lista> getListaDetails (String tabla) {
    List<Lista> lista = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null; 
         try{
           tx= session.beginTransaction();
           Criteria cr = session.createCriteria(Lista.class);
           cr.add(Restrictions.eq("tabla",tabla));
           lista = cr.list();
           tx.commit();      
           
        } catch (HibernateException asd){
            System.out.println(asd.getMessage());
            if (tx!= null){
                tx.rollback();
            }           
        } finally {
            session.close();
        }       
        return lista; 
}
    
    
    
    
    
}
