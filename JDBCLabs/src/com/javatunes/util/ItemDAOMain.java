package com.javatunes.util;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class ItemDAOMain {
    public static void main(String[] args) {
        MusicItem test = null;
        Connection conn = null;

        try {
            String url = "jdbc:derby://localhost:1527/JavaTunesDB";
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            String user = "guest";
            String passwd = "password";
            conn = DriverManager.getConnection(url, user, passwd);
            ItemDAO testSearch = new ItemDAO(conn);

            Long id = 1L;
            test = testSearch.searchById(id);
            System.out.println(test == null);
            test = null;

            id = 100L;
            test = testSearch.searchById(id);
            System.out.println(test == null);

            Collection<MusicItem> result = new ArrayList<MusicItem>();
            result = testSearch.searchByKeyword("of");
            System.out.println("of: " + result.size());

            result = testSearch.searchByKeyword("Gay");
            System.out.println("Gay: " + result.size());

            test = new MusicItem();
            test.setArtist("Wow artist");
            test.setTitle("Gio Pika");
            test.setListPrice(new BigDecimal("12.12"));
            test.setPrice(new BigDecimal("12.12"));
            test.setReleaseDate(new Date());
            testSearch.create(test);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
