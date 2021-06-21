package Examen;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Agregador {
    private List<Noticia> noticias = new ArrayList<>();
    private List<Suscripcion> suscripciones = new ArrayList<>();

    public void addNoticias(Noticia noticias) {
        this.noticias.add(noticias);
    }

    public void remNoticias(Noticia noticias) {
        this.noticias.remove(noticias);
    }

    public void addSuscripciones(Suscripcion suscripciones) {
        this.suscripciones.add(suscripciones);
    }

    public void remSuscripciones(Suscripcion suscripciones) {
        this.suscripciones.remove(suscripciones);
    }

    public void enviaSuscripciones(){
        for (Suscripcion i: this.suscripciones) {
            Calendar fecha = Calendar.getInstance();
            Calendar fecha1 = fecha;
            if (i.getClass() == Mensual.class){
                fecha1.add(Calendar.MONTH,-1);
                System.out.println(i.getUsuario().getEmail());
                List<Noticia> noticias1 = noticias(fecha1,fecha);
                for (Noticia o: noticias1){
                    System.out.println(o.publica());
                }
            }
            else if (i.getClass() == Semanal.class){
                fecha1.add(Calendar.DAY_OF_MONTH,-7);
                System.out.println(i.getUsuario().getEmail());
                List<Noticia> noticias1 = noticias(fecha1,fecha);
                for (Noticia o: noticias1){
                    System.out.println(o.publica());
                }
            }
            else {
                List<Noticia> noticias1 = new ArrayList<>();
                for (Noticia p: this.noticias) {
                    if (fecha.equals(p.getFecha())){
                        noticias1.add(p);
                    }
                }
                System.out.println(i.getUsuario().getEmail());
                for (Noticia o: noticias1){
                    System.out.println(o.publica());
                }
            }
        }
    }

    public List<Noticia> noticias(Calendar fecha1, Calendar fecha2){
        List<Noticia> noticiaList = new ArrayList<>();
        for (Noticia i: this.noticias) {
            if (i.getFecha().after(fecha1) & i.getFecha().before(fecha2)){
                noticiaList.add(i);
            }
        }
        return noticiaList;
    }
}
