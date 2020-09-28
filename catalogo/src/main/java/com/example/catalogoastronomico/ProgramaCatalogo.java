package com.example.catalogoastronomico;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author (iip)
 * @version (2019)
 *
 */

public class ProgramaCatalogo {
    /**

    private static Astro leeAstro(Scanner teclado, CatalogoAstronomico ca) {

        Astro res = null;
        System.out.println("Nombre >");
        String nombre = teclado.next().toLowerCase();

        boolean correcto = false;
        boolean habitado = false;
        String s;
        String galaxia="";
        String estrella="";
        int numPlanetas = 0;
        String tipo = "";
        do {
            System.out.println("Tipo (p|e|g) >");
            s = teclado.next();

            if (s.equals("e")) {
                correcto = true;
                System.out.println("Número de planetas que orbitan alrededor de esta estrella >");
                numPlanetas = teclado.nextInt();
                System.out.println("Galaxia >");
                galaxia = teclado.next().toLowerCase();
                boolean tipoCorrecto = false;
                do {
                    System.out.println("Tipo estrella ENANA_AMARILLA (ea)|ENANA BLANCA (eb)|GIGANTE ROJA (gr)|SUBGIGANTE CLANCA (sb)>");
                    tipo = teclado.next().toLowerCase();
                    if (tipo.equals("ea") || tipo.equals("eb") || tipo.equals("gr") || tipo.equals("sb"))
                        tipoCorrecto = true;
                } while (!tipoCorrecto);
            } else if (s.equals("p")) {
                correcto = true;
                System.out.println("¿Está habitado? (s|n)> ");
                if (teclado.next().equals("s"))
                    habitado = true;
                System.out.println("Estrella >");
                estrella = teclado.next().toLowerCase();
            } else if (s.equals("g")) {
                correcto = true;
            } else {
                System.out.println(s + " es incorrecto, vuelve a intentarlo >");
            }
        } while (!correcto);

        System.out.println("Brillo >");
        double brillo = teclado.nextDouble();

        System.out.println("Distancia >");
        double distancia = teclado.nextDouble();

        if (s.equals("p")) {
            Estrella est = (Estrella) ca.buscaAstro(estrella);
            if (est != null){
                res = new Planeta(nombre, brillo, distancia, habitado, est);
            }
            else {
                System.out.println("La estrella de este planeta no existe en el catálogo. Debes crearla primero");
            }
        }
        else if (s.equals("e")){
            Galaxia ga = (Galaxia) ca.buscaAstro(galaxia);
            if (ga != null){
                if (tipo.equals("ea"))
                    res = new Estrella(nombre, brillo, distancia, numPlanetas, ga, TipoEstrella.ENANA_AMARILLA);
                else if (tipo.equals("eb"))
                    res = new Estrella(nombre, brillo, distancia, numPlanetas, ga, TipoEstrella.ENANA_BLANCA);
                else if (tipo.equals("gr"))
                    res = new Estrella(nombre, brillo, distancia, numPlanetas, ga, TipoEstrella.GIGANTE_ROJA);
                else if (tipo.equals("sb"))
                    res = new Estrella(nombre, brillo, distancia, numPlanetas, ga, TipoEstrella.SUBGIGANTE_BLANCA);
            }
            else {
                System.out.println("La galaxia de esta estrella no existe en el catálogo. Debes crearla primero");
            }
        }
        else {
            res = new Galaxia(nombre, brillo, distancia);
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        CatalogoAstronomico ca = new CatalogoAstronomico();
        Astro otroAs = null;

        int i = 1;
        String respuesta = "";

        System.out.println("Cargando catálogo inicial");
        Astro vialactea = new Galaxia("vialactea", 0.0, 1275);
        ca.anade(vialactea);
        Astro andromeda = new Galaxia("andromeda", 0,2.4E13);
        ca.anade(andromeda);
        Astro sol = new Estrella("sol", 4, 149.6, 8, (Galaxia) vialactea, TipoEstrella.ENANA_AMARILLA);
        ca.anade(sol);
        Astro alpheratz = new Estrella("alpheratz", 7, 9.16E13, 100, (Galaxia) andromeda, TipoEstrella.SUBGIGANTE_BLANCA);
        ca.anade(alpheratz);
        Astro tierra = new Planeta("tierra", 0, 0, true, (Estrella) sol);
        ca.anade(tierra);
        Astro saturno = new Planeta("saturno", 10, 1275, false, (Estrella) sol);
        ca.anade(saturno);
        Astro exoplaneta = new Planeta("exoplaneta", 27, 2.537E16, false, (Estrella) alpheratz);
        ca.anade(exoplaneta);

        System.out.println("CATÁLOGO:");
        System.out.println("El catálogo tiene " + ca.getCatalogo().size() + " astros, que pertenecen a " + ca.getGalaxias().size() + " galaxia(s)");
        System.out.println(ca);

        while (!respuesta.equals("s")){
            otroAs = leeAstro(teclado, ca);
            if (otroAs != null) {

                System.out.println("NUEVO ASTRO:");
                System.out.println(otroAs);
                ca.anade(otroAs);

                System.out.println("El catálogo tiene " + ca.getCatalogo().size() + " astros, que pertenecen a " + ca.getGalaxias().size() + " galaxia(s)");
                System.out.println(ca);

                System.out.println("Primer astro más brillante que el astro introducido: " + ca.primeroMasBrillanteQue(otroAs));
                System.out.println("Astro más brillante: " + ca.brillaMas());

                StringBuffer sb = new StringBuffer();

                for (Astro a : ca.filtraEstrellasSimpleVista()) {
                    sb.append(a.getNombre());
                    sb.append(" ");
                }

                String str = sb.toString();
                System.out.println("Estrellas a simple vista: " + str);
            }
            System.out.println("Pulsa cualquier letra para continuar o elige salir (s) >");
            respuesta = teclado.next().toLowerCase();
        };
    }
     **/
}