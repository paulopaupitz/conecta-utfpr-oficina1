package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.Usuario;

public class UsuarioController {

    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean handleCadastro(Usuario usuario) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo",
                    "root", "");

            PreparedStatement stEmail = connection.prepareStatement("SELECT * FROM usuario WHERE email=?");
            stEmail.setString(1, usuario.getEmail());

            ResultSet rsEmail = stEmail.executeQuery();

            if (rsEmail.next()) {
                throw new RuntimeException("Já existe um usuário com o e-mail informado!");
            }

            PreparedStatement st = connection.prepareStatement(
                    "INSERT INTO usuario (nome, email, senha, campus, tipo_usuario) VALUES (?, ?, ?, ?, ?)");

            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getEmail());
            st.setString(3, usuario.getSenha());
            st.setString(4, usuario.getCampus());
            st.setString(5, usuario.getTipoUsuario());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return false;
    }

    public static Usuario buscarUsuarioPorId(String id) {
        Usuario usuario = null;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo", "root",
                "");
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM usuario WHERE id = ?")) {

            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCampus(resultSet.getString("campus"));
                usuario.setTipoUsuario(resultSet.getString("tipo_usuario"));
            } else {
                throw new RuntimeException("Usuário não encontrado!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    public static Boolean handleEdicao(Usuario usuario) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo", "root",
                "");
                PreparedStatement statement = connection.prepareStatement(
                        "UPDATE usuario SET nome = ?, senha = ?, campus = ?, tipo_usuario = ?, email = ? WHERE id = ?")) {

            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getCampus());
            statement.setString(4, usuario.getTipoUsuario());
            statement.setString(5, usuario.getEmail());
            statement.setInt(6, usuario.getId());

            int rowsUpdated = statement.executeUpdate();

            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static Boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
