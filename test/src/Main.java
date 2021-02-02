package src;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import bbdd.MySQLAccess;

public class Main {
        public static void main(String[] args) throws Exception {
        	String SQL="SELECT *FROM TEST.PROVEEDORES";
        	if(args != null && args.length == 0 ) {
        		System.out.println("Sin parámetros");
        	}else if(args != null && args.length > 1 ) {
    			System.out.println("Argumentos incorrectos");
    			throw new Exception("No puede tener más de un parámetro");
        	}else {
        		if(!isNumeric(args[0])) {
        			throw new Exception("No es un id de cliente válido");
        		}
        		System.out.println("Id cliente: " + args[0]);
        		SQL = SQL + " WHERE id_cliente = "+args[0];
        	}
    		try {
    			FileWriter myWriter = new FileWriter("./fichero/Lista_Proveedores.txt");
				Connection connection = MySQLAccess.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL);
				ResultSet rs = ps.executeQuery();
				int i = 0;
    			while (rs.next()) {
    				i++;
    				int idProveedor = rs.getInt("ID_PROVEEDOR");
			        String nombre = rs.getString("NOMBRE");
			        Date fechaAlta = rs.getDate("FECHA_ALTA");
			        int idCliente = rs.getInt("ID_CLIENTE");
			        myWriter.write(idProveedor + ", " + nombre + ", " + fechaAlta + ", " + idCliente + "\n" );
			      }
    			myWriter.close();
    			if(i == 0) {
    				System.out.println("El cliente no tiene proveedores asignados");
    				System.out.println("El archivo se ha generado sin proveedores");
    			} else {
    				System.out.println("El archivo se ha generado correctamente");
    				
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        }
        @SuppressWarnings("unused")
		public static boolean isNumeric(String strNum) {
            if (strNum == null) {
                return false;
            }
            try {
                double d = Double.parseDouble(strNum);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
    }