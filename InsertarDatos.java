package Pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertarDatos {
    private Connection conexion;

    public InsertarDatos(Connection conexion) {
        this.conexion = conexion;
    }

    public int insertarDatosCampopadre(String categoriaPadre, int numeroArreglo) {
        try {
            // Insertar la categoría y el número de arreglo en la tabla cabecerapadre
            String sql = "INSERT INTO cabecerapadre (categoria, numero_arreglo) VALUES (?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, categoriaPadre);
            statement.setInt(2, numeroArreglo);
            statement.executeUpdate();

            // Obtener el ID generado para el padre
            int idPadre = -1;
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                idPadre = generatedKeys.getInt(1);
            }

            // Imprimir los valores del arreglo con etiqueta solo si comienzan con "A"
            /*for (String valor : valoresArreglo) {
                if (valor.startsWith("A")) {
                    System.out.println("Dato desde insertarDatosCampopadre: " + valor);
                }
            }*/

            return idPadre;

        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // Manejo de error
        }
    }



    public void insertarValorArreglo(int idPadre, String valor) {
        try {
            String sql = "INSERT INTO datoshijos (idPadre, datosHijo) VALUES (?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idPadre);
            statement.setString(2, valor);
            statement.executeUpdate();

            // Imprimir el valor con etiqueta
            System.out.println("Dato desde insertarValorArreglo: " + valor);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
