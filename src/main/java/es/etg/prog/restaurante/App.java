package es.etg.prog.restaurante;

import java.io.InputStream;
import java.util.Properties;


public class App 
{

    private static final String PRP_NOMBRE = "NOMBRE";
    private static final String PRP_DIRECCION = "DIRECCION";

    private static Properties leerConfiguracion() throws Exception{

        //final String FICHERO = "configuracion.properties";

        final String FICHERO = "config/restaurante.properties";

        Properties propiedades = new Properties();
        
        InputStream inputStream = App.class.getClassLoader().getResourceAsStream(FICHERO);

        propiedades.load(inputStream);

        return propiedades;

    }

    public static void main( String[] args ) throws Exception
    {
        
        Properties conf = leerConfiguracion();

        Restaurante res = new Restaurante(conf.getProperty(PRP_NOMBRE), conf.getProperty(PRP_DIRECCION));

        System.out.println(res);
        
    }
}
