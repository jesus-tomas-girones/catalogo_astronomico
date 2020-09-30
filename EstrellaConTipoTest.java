package com.example.catalogoastronomico;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EstrellaConTipoTest {

      @Test
      public void crear_objeto_y_getters() {
         Galaxia g = new Galaxia("Galaxia", 1.1, 2.2);
         EstrellaConTipo a = new EstrellaConTipo("nombre", 1.1, 2.2 , 3, g, TipoEstrella.ENANA_AMARILLA);
         assertEquals("nombre", a.getNombre() );
         assertEquals(1.1, a.getBrillo(), 1E-10);
         assertEquals(2.2, a.getDistancia(), 1E-10);
         assertEquals(3, a.getPlanetas());
         assertEquals(g, a.getGalaxia());
         assertEquals(TipoEstrella.ENANA_AMARILLA, a.getTipo());
      }

      @Test
      public void setters() {
         Galaxia g = new Galaxia("Galaxia", 1.1, 2.2);
         EstrellaConTipo a = new EstrellaConTipo("nombre", 1.1, 2.2 , 3, null, TipoEstrella.ENANA_AMARILLA);
         a.setNombre("nuevo");
         a.setBrillo(-2.6);
         a.setDistancia(4.5);
         a.setPlanetas(5);
         a.setGalaxia(g);
         a.setTipo(TipoEstrella.ENANA_BLANCA);
         assertEquals("nuevo", a.getNombre() );
         assertEquals(-2.6, a.getBrillo(), 1E-10);
         assertEquals(4.5, a.getDistancia(), 1E-10);
         assertEquals(5, a.getPlanetas());
         assertEquals(g, a.getGalaxia());
         assertEquals(TipoEstrella.ENANA_BLANCA, a.getTipo());
      }

      @Test
      public void equals_esCorrecto() {
         Galaxia g = new Galaxia("Galaxia", 1.1, 2.2);
         EstrellaConTipo a = new EstrellaConTipo("a", -1.42, 8.7, 3, g, TipoEstrella.ENANA_BLANCA);
         EstrellaConTipo b = new EstrellaConTipo("a", -1.42, 8.7, 3, g, TipoEstrella.ENANA_BLANCA);
         EstrellaConTipo c = new EstrellaConTipo("a", -1.42, 8.8, 3, g, TipoEstrella.ENANA_BLANCA);
         assertEquals(true, a.equals(b));
         assertEquals(false, a.equals(c));
      }

      @Test
      public void toString_esCorrecto() {
         Galaxia g = new Galaxia("Vía Láctea", 0, 45);
         EstrellaConTipo a = new EstrellaConTipo("Alfa Centauri", -0.27, 4.5, 3, g, TipoEstrella.ENANA_BLANCA);
         assertEquals("objeto-Astro {nombre: Alfa Centauri, tipo: EstrellaConTipo, brillo: -0.27, distancia: 4.5, planetas: 3, galaxia: Vía Láctea, info: Enana Blanca \"https://es.wikipedia.org/wiki/Enana_blanca\"}", a.toString());
      }

}
