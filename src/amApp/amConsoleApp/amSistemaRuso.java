package amApp.amConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import amBusinessLogic.amEntities.amCoordenadaUK;

public class amSistemaRuso {

    public List<amCoordenadaUK> readCoord(String fileNamePath) throws IOException {
        List<amCoordenadaUK> lstCoord = new java.util.ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(fileNamePath));
        for (String line : allLines) {
            System.out.println(line);
            String[] coord = line.split(",");
            amCoordenadaUK coordenada = new amCoordenadaUK( coord[0], coord[6], false);
            lstCoord.add(coordenada);
            //System.out.println( coordenada.toString() );
        }
        return lstCoord;
    }
}
