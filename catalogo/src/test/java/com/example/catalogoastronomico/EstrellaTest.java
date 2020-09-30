package com.example.catalogoastronomico;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EstrellaTest {

   @Test
   public void crear_objeto_y_getters() {
      Galaxia g = new Galaxia("Galaxia", 1.1, 2.2);
      Estrella a = new Estrella("nombre", 1.1, 2.2 , 3, g);
      assertEquals("nombre", a.getNombre() );
      assertEquals(1.1, a.getBrillo(), 1E-10);
      assertEquals(2.2, a.getDistancia(), 1E-10);
      assertEquals(3, a.getPlanetas());
      assertEquals(g, a.getGalaxia());
   }

   @Test
   public void setters() {
      Galaxia g = new Galaxia("Galaxia", 1.1, 2.2);
      Estrella a = new Estrella("nombre", 1.1, 2.2 , 3, null);
      a.setNombre("nuevo");
      a.setBrillo(-2.6);
      a.setDistancia(4.5);
      a.setPlanetas(5);
      a.setGalaxia(g);
      assertEquals("nuevo", a.getNombre() );
      assertEquals(-2.6, a.getBrillo(), 1E-10);
      assertEquals(4.5, a.getDistancia(), 1E-10);
      assertEquals(5, a.getPlanetas());
      assertEquals(g, a.getGalaxia());
   }

   @Test
   public void equals_esCorrecto() {
      Galaxia g = new Galaxia("Galaxia", 1.1, 2.2);
      Estrella a = new Estrella("a", -1.42, 8.7, 3, g);
      Estrella b = new Estrella("a", -1.42, 8.7, 3, g);
      Estrella c = new Estrella("a", -1.42, 8.8, 3, g);
      assertEquals(true, a.equals(b));
      assertEquals(false, a.equals(c));
   }

   @Test
   public void toString_esCorrecto() {
      Galaxia g = new Galaxia("Vía Láctea", 0, 45);
      Estrella a = new Estrella("Alfa Centauri", -0.27, 4.5, 3, g);
      assertEquals("objeto-Astro {nombre: Alfa Centauri, tipo: Estrella, brillo: -0.27, distancia: 4.5, planetas: 3, galaxia: Vía Láctea}", a.toString());
   }

}
