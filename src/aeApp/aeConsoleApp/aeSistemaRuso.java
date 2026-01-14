package aeApp.aeConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import aeBusinessLogic.aeEntities.aeCoordenadaUK;

public class aeSistemaRuso {

    public List<aeCoordenadaUK> readCoord(String fileNamePath) throws IOException {
        List<aeCoordenadaUK> lstCoord = new java.util.ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(fileNamePath));
        for (String line : allLines) {
            System.out.println(line);
            String[] coord = line.split(",");
            aeCoordenadaUK coordenada = new aeCoordenadaUK( coord[0], coord[6], false);
            lstCoord.add(coordenada);
            //System.out.println( coordenada.toString() );
        }
        return lstCoord;
    }
}
