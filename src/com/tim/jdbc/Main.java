package com.tim.jdbc;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/music";
    static final String USER = "******";
    static final String PASS = "*****";
    static final String QUERY = "SELECT * FROM music.albumview WHERE artist_name = 'pink floyd'";
    public static void main(String[] args) {

        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ALBUM_NAME: " + rs.getString("album_name"));
                System.out.print(", ARTIST_NAME: " + rs.getString("artist_name"));
                System.out.print(", SONG_TITLE: " + rs.getString("song_title"));
                System.out.println(", TRACK_NUMBER: " + rs.getInt("track_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
