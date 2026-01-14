package aeDataAccess.aeDAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import aeDataAccess.Helpers.DataHelperSQLiteDAO;
import aeDataAccess.aeDTOs.aeHormigaDTO;
import aeDataAccess.aeDTOs.aeVWHormigaDTO;
import aeInfrastructure.AppException;

public class aeHormigaDAO extends DataHelperSQLiteDAO<aeHormigaDTO>{
    public aeHormigaDAO() throws AppException {
        super(aeHormigaDTO.class, "aeHormiga", "IdaeHormiga");
    }

    public List<aeVWHormigaDTO> readAllvwHormiga() throws AppException {
        aeVWHormigaDTO dto;
        List<aeVWHormigaDTO> lst = new ArrayList<>();
        String query = " SELECT IdaeHormiga"
                      +" ,aeTipo"   
                      +" ,aeSexo"
                      +" ,aeEstadoHormiga"   
                      +" ,aeNombre"
                      +" ,aeDescripcion"
                      +" ,aeEstado"
                      +" ,aeFechaCreacion"   
                      +" ,aeFechaModifica  " 
                      +" FROM aeVwHormiga";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new aeVWHormigaDTO(rs.getString(1)          // IdHormiga
                                        ,rs.getString(2)        // Tipo            
                                        ,rs.getString(3)        // Sexo        
                                        ,rs.getString(4)        // EstadoHormiga 
                                        ,rs.getString(5)        // Nombre 
                                        ,rs.getString(6)        // Descripcion
                                        ,rs.getString(7)        // Estado
                                        ,rs.getString(8)        // FechaCreacion
                                        ,rs.getString(9)        // FechaModifica
                                      ); 
                lst.add(dto);
            }
        } 
        catch (SQLException e) {
            throw new AppException("Ups... porblemas con la vista", e, getClass(), "getVWHormiga()");
        }
        return lst;
    }
}