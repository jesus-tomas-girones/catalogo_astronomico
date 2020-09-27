package com.example.catalogoastronomico;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import sun.rmi.runtime.Log;

import static org.junit.Assert.*;

public class CatalogoAstronomicoTest {
/*
   @Test
   public void crear_objeto_vacio() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      assertEquals(true, c.getCatalogo().isEmpty());
      assertEquals(true, c.getGalaxias().isEmpty());
      assertEquals(0, c.getNumEstrellasSimpleVista());
   }

   @Test
   public void anade_estrella_simple_vista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      c.anade(e);
      assertEquals(1, c.getCatalogo().size());
      assertEquals(1, c.getGalaxias().size());
      assertEquals(true, c.getGalaxias().contains(g.getNombre()));
      assertEquals(1, c.getNumEstrellasSimpleVista());
   }

   @Test
   public void anade_estrella_no_simple_vista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 6, 2.2, 3, g);
      c.anade(e);
      assertEquals(1, c.getCatalogo().size());
      assertEquals(1, c.getGalaxias().size());
      assertEquals(true, c.getGalaxias().contains(g.getNombre()));
      assertEquals(0, c.getNumEstrellasSimpleVista());
   }

   @Test
   public void borrar_estrella_simple_vista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      c.anade(e);
      c.borrar("estrella");
      assertEquals(true, c.getCatalogo().isEmpty());
      assertEquals(false, c.getGalaxias().isEmpty());
      assertEquals(0, c.getNumEstrellasSimpleVista());
      assertEquals(true, c.getGalaxias().contains(g.getNombre()));
   }

   @Test
   public void buscarAstro() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      c.anade(e);
      assertEquals(e, c.buscaAstro("estrella"));
      assertEquals(null, c.buscaAstro("estrella2"));
   }

   @Test
   public void primeroMasBrillanteQue() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      Estrella e2 = new Estrella("estrella2", 3, 2.2, 3, g);
      Estrella e3 = new Estrella("estrella3", 3.5, 2.2, 3, g);
      assertEquals(null, c.primeroMasBrillanteQue(e3));
      c.anade(e);
      c.anade(e2);
      assertEquals(e2, c.primeroMasBrillanteQue(e3));
   }

   @Test
   public void filtraEstrellasSimpleVista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      Estrella e2 = new Estrella("estrella2", 6, 2.2, 3, g);
      Estrella e3 = new Estrella("estrella3", 3.5, 2.2, 3, g);
      c.anade(e);
      c.anade(e2);
      c.anade(e3);
      assertEquals(2, c.filtraEstrellasSimpleVista().size());
      assertEquals(true, c.filtraEstrellasSimpleVista().indexOf(e) != -1);
      assertEquals(true, c.filtraEstrellasSimpleVista().indexOf(e2) == -1);
      assertEquals(true, c.filtraEstrellasSimpleVista().indexOf(e3) != -1);
   }

   @Test
   public void toString_esCorrecto() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      Estrella e2 = new Estrella("estrella2", 6, 2.2, 3, g);
      c.anade(g);
      c.anade(e);
      c.anade(e2);
//      assertEquals("", c.toString() );
   }

//*/
}
