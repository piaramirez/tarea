package Pruebas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechayHora {
    public static String obtenerFechaYHora() {
        Calendar cal = Calendar.getInstance();
        Date fechaActual = cal.getTime();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MMM yyyy");
        String fechaFormateada = formatoFecha.format(fechaActual);

        return fechaFormateada;
    }

    public static String obtenerHoraCronometro() {
        Calendar cal = Calendar.getInstance();
        Date fechaActual = cal.getTime();

        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = formatoHora.format(fechaActual);

        return horaFormateada;
    }
}
