
package Comtrolador;

import Modelo.Conexion;
import Modelo.Sucursal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CbSucursal {
    Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    ResultSet rs;

    public CbSucursal() {
    }
    
    public ArrayList getListaSucursales(){
        System.out.println("funsion getListaSucursales");
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal = null;  
        try {
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT idSucursal, bombreSucursal FROM sucursal;");
            while(rs.next()){
                sucursal = new Sucursal();
                sucursal.setIdSucursal(rs.getInt("idSucursal"));
                sucursal.setNombreSucursal(rs.getString("nombreSucursal"));
                mListaSucursales.add(sucursal);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return mListaSucursales;
    }

}
