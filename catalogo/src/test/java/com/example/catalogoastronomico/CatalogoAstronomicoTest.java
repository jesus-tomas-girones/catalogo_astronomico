package com.example.catalogoastronomico;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class CatalogoAstronomicoTest {

   @Test
   public void crear_objeto_vacio() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      assertEquals(true, c.getCatalogo().isEmpty());
      assertEquals(true, c.getGalaxias().isEmpty());
      assertEquals(new ArrayList<Astro>(), c.filtraAstrosSimpleVista());
   }

   @Test
   public void anade_astro_simple_vista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      c.anade(e);
      assertEquals(2, c.getCatalogo().size());
      assertEquals(1, c.getGalaxias().size());
      assertEquals(true, c.getGalaxias().contains(g.getNombre()));
      assertEquals(1, c.filtraAstrosSimpleVista().size());
      assertEquals(1, c.getNumEstrellasSimpleVista());
   }

   @Test
   public void anade_astro_no_simple_vista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 6, 2.2, 3, g);
      c.anade(e);
      assertEquals(2, c.getCatalogo().size());
      assertEquals(1, c.getGalaxias().size());
      assertEquals(true, c.getGalaxias().contains(g.getNombre()));
      assertEquals(0, c.filtraAstrosSimpleVista().size());
      assertEquals(0, c.getNumEstrellasSimpleVista());
   }

   @Test
   public void borrar_astro_simple_vista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      c.anade(e);
      c.borrar("estrella");
      assertEquals(false, c.getCatalogo().isEmpty());
      assertEquals(false, c.getGalaxias().isEmpty());
      assertEquals(0, c.filtraAstrosSimpleVista().size());
      assertEquals(0, c.getNumEstrellasSimpleVista());
      assertEquals(true, c.getGalaxias().contains(g.getNombre()));
   }

   @Test
   public void buscaAstro() {
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
      c.anade(e3);
      c.anade(e);
      assertEquals(e3, c.primeroMasBrillanteQue(e2));
   }

   @Test
   public void filtraAstrosSimpleVista() {
      CatalogoAstronomico c = new CatalogoAstronomico();
      Galaxia g = new Galaxia("galaxia", 0, 2.2);
      Estrella e = new Estrella("estrella", 4, 2.2, 3, g);
      Estrella e2 = new Estrella("estrella2", 6, 2.2, 3, g);
      Estrella e3 = new Estrella("estrella3", 3.5, 2.2, 3, g);
      c.anade(e);
      c.anade(e2);
      c.anade(e3);
      assertEquals(2, c.filtraAstrosSimpleVista().size());
      assertEquals(true, c.filtraAstrosSimpleVista().indexOf(e) != -1);
      assertEquals(true, c.filtraAstrosSimpleVista().indexOf(e2) == -1);
      assertEquals(true, c.filtraAstrosSimpleVista().indexOf(e3) != -1);
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

}
