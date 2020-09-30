package com.example.catalogoastronomico;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PlanetaTest {

   @Test
   public void crear_objeto_y_getters() {
      Estrella e = new Estrella("Estrella", 1.1, 2.2, 3, null);
      Planeta a = new Planeta("nombre", 1.1, 2.2 , false, e);
      assertEquals("nombre", a.getNombre() );
      assertEquals(1.1, a.getBrillo(), 1E-10);
      assertEquals(2.2, a.getDistancia(), 1E-10);
      assertEquals(false, a.isHabitado());
      assertEquals(e, a.getEstrella());
   }

   @Test
   public void setters() {
      Estrella e = new Estrella("Estrella", 1.1, 2.2, 3, null);
      Planeta a = new Planeta("nombre", 1.1, 2.2 , false, e);
      a.setNombre("nuevo");
      a.setBrillo(-2.6);
      a.setDistancia(4.5);
      a.setHabitado(true);
      a.setEstrella(e);
      assertEquals("nuevo", a.getNombre() );
      assertEquals(-2.6, a.getBrillo(), 1E-10);
      assertEquals(4.5, a.getDistancia(), 1E-10);
      assertEquals(true, a.isHabitado());
      assertEquals(e, a.getEstrella());
   }

   @Test
   public void equals_esCorrecto() {
      Estrella e = new Estrella("Estrella", 1.1, 2.2, 3, null);
      Planeta a = new Planeta("nombre", 1.1, 2.2 , false, e);
      Planeta b = new Planeta("nombre", 1.1, 2.2 , false, e);
      Planeta c = new Planeta("nombre", 1.1, 2.2 , true, e);
      assertEquals(true, a.equals(b));
      assertEquals(false, a.equals(c));
   }

   @Test
   public void toString_esCorrecto() {
      Estrella e = new Estrella("Alfa Centauri", -0.27, 4.5, 3, null);
      Planeta a = new Planeta("nombre", 1.1, 2.2 , false, e);
      assertEquals("objeto-Astro {nombre: nombre, tipo: Planeta, brillo: 1.1, distancia: 2.2, habitado: false, estrella: Alfa Centauri}", a.toString());
   }

}
