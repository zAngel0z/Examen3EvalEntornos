/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dao.PedidosDao;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Angel
 */
public class PedidosDaoTest {
    
    static PedidosDao pedidos = new PedidosDao();
    static Pedido pedido = new Pedido(1,3,8,new Date(1998-05-06),new Date(1998-06-03),new Date(1998-06-03),3, new BigDecimal(6.19),"Ritcher Supermarkt","Starenweg 5","Geneve","Alpes","1204","Suiza");
    
    
    public PedidosDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class PedidosDao.
     */
    @Test
    public void testGetConexion() {
       System.out.println("getConexion");
        PedidosDao instance = new PedidosDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Integer idPedido = 11075;
        Pedido result = pedidos.read(idPedido);
        assertEquals(result.getId(), idPedido);
        
    }

    /**
     * Test of insert method, of class PedidosDao.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.insert(pedido);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of update method, of class PedidosDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.update(pedido);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class PedidosDao.
     */
    @Test
    public void testDelete() {
        int result = pedidos.delete(11076);
        assertEquals(result, 0);
        
    }

    /**
     * Test of listar method, of class PedidosDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Integer posicion = null;
        PedidosDao instance = new PedidosDao();
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(posicion);
        assertEquals(expResult, result);
       
    }
    
}
