package amDataAccess.amDAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import amDataAccess.Helpers.DataHelperSQLiteDAO;
import amDataAccess.amDTOs.amHormigaDTO;
import amDataAccess.amDTOs.amVWHormigaDTO;
import amInfrastructure.AppException;

public class amHormigaDAO extends DataHelperSQLiteDAO<amHormigaDTO>{
    public amHormigaDAO() throws AppException {
        super(amHormigaDTO.class, "amHormiga", "IdamHormiga");
    }

    public List<amVWHormigaDTO> readAllvwHormiga() throws AppException {
        amVWHormigaDTO dto;
        List<amVWHormigaDTO> lst = new ArrayList<>();
        String query = " SELECT IdamHormiga"
                      +" ,amTipo"   
                      +" ,amSexo"
                      +" ,amEstadoHormiga"   
                      +" ,amNombre"
                      +" ,amDescripcion"
                      +" ,amEstado"
                      +" ,amFechaCreacion"   
                      +" ,amFechaModifica  " 
                      +" FROM amVwHormiga";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new amVWHormigaDTO(rs.getString(1)          // IdHormiga
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