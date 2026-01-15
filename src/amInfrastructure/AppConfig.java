//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package amInfrastructure;

import java.net.URL;

public abstract class AppConfig {
    //Paths Storage
    public static final String DATABASE = "jdbc:sqlite:storage\\amDatabases\\amAntCiberDron.sqlite";
    public static final String DATAFILE = "storage\\amDataFiles\\Alban_Montufar.csv";
    public static final String ANT_NEST_PATH = "storage\\amDataFiles\\AntNest.txt";
    public static final String ANT_FOOD_PATH = "storage\\amDataFiles\\AntFood.txt";
    public static final String LOGFILE  = "storage\\amLogs\\AppErrors.log";

    //Resources
    public static final URL URL_MAIN    = AppConfig.class.getResource("Resource/logo.png");
    public static final URL URL_LOGO    = AppConfig.class.getResource("Resource/logo.png");
    public static final URL URL_SPLASH  = AppConfig.class.getResource("/Infrastructure/Assets/Img/Splash.png");

    //AppMSGs
    public static final String MSG_DEFAULT_ERROR    = "Ups! Error inesperado. Por favor, contacte al administrador del sistema.";
    public static final String MSG_DEFAULT_CLASS    = "undefined";
    public static final String MSG_DEFAULT_METHOD   = "undefined";

    private AppConfig() {}
}
