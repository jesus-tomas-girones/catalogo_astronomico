package com.example.catalogoastronomico;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AstroTest {

   @Test
   public void crear_objeto_y_getters() {
      Astro a = new Astro("nombre", 1.1, 2.2 );
      assertEquals("nombre", a.getNombre() );
      assertEquals(1.1, a.getBrillo(), 1E-10);
      assertEquals(2.2, a.getDistancia(), 1E-10);
   }

   @Test
   public void constructor_por_defecto() {
      Astro a = new Astro();
      assertEquals("Sirius", a.getNombre() );
      assertEquals(-1.42, a.getBrillo(), 1E-10);
      assertEquals(8.7, a.getDistancia(), 1E-10);
   }

   @Test
   public void setters() {
      Astro a = new Astro();
      a.setNombre("nuevo");
      a.setBrillo(-2.6);
      a.setDistancia(4.5);
      assertEquals("nuevo", a.getNombre() );
      assertEquals(-2.6, a.getBrillo(), 1E-10);
      assertEquals(4.5, a.getDistancia(), 1E-10);
   }

   @Test
   public void equals_esCorrecto() {
      Astro a = new Astro();
      Astro b = new Astro("Sirius", -1.42, 8.7);
      Astro c = new Astro("Sirius", -1.42, 8.8);
      assertEquals(true, a.equals(b));
      assertEquals(false, a.equals(c));
   }

   @Test
   public void toString_esCorrecto() {
      Astro a = new Astro();
      assertEquals("objeto-Astro {nombre: Sirius, brillo: -1.42, distancia: 8.7}", a.toString());
   }

   @Test
   public void masDistante() {
      Astro a = new Astro("a", -1.42, 8.7);
      Astro b = new Astro("b", -1.42, 8.8);
      assertEquals(true, b.masDistante(a));
      assertEquals(false, a.masDistante(b));
   }

   @Test
   public void masBrillo() {
      Astro a = new Astro("a", -1.42, 8.7);
      Astro b = new Astro("b", -1.43, 8.7);
      Astro c = new Astro("c", -1.43, 8.7);
      assertEquals(1, a.masBrillante(b));
      assertEquals(-1, b.masBrillante(a));
      assertEquals(0, b.masBrillante(c));
   }

   @Test
   public void visibleCon() {
      Astro a = new Astro("a", 4.5, 8.7);
      assertEquals("a simple vista", a.visibleCon());
      a.setBrillo(5.2);
      assertEquals("con prismáticos", a.visibleCon());
      a.setBrillo(7.5);
      assertEquals("con telescopio", a.visibleCon());
      a.setBrillo(26);
      assertEquals("con grandes telescopios", a.visibleCon());
   }

}
