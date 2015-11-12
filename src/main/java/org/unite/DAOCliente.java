/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author brandon
 */
public class DAOCliente {
    
    private static SessionFactory sesionfactory;
    private static Session sesion;
    private static Transaction tranza;
    
    public DAOCliente(){
            sesionfactory=HibernateUtilidades.getSessionFactory();
            sesion=sesionfactory.openSession();
            tranza=sesion.beginTransaction();
    }
    public void cerrarTodo(){
            tranza.commit();
            sesion.close();
    }
    public void guadar(Cliente a)throws Exception{
            sesion.save(a);
            cerrarTodo();
    
    }
    
}
