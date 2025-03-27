package com.ino.controller;

import com.ino.model.dto.ChunDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import static com.ino.common.JDBCTemplate.close;
import static com.ino.common.JDBCTemplate.getConnection;

public class ChundbController {
    public void selectDeptScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input dept name: ");
        String deptName = sc.nextLine();
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        Properties prop = new Properties();
        List<ChunDB> chunDBList = new ArrayList<>();
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ino/mapper/chundb-query.xml"));
            pstmt = conn.prepareStatement(prop.getProperty("selectDeptScore"));
            pstmt.setString(1, deptName);
            rset = pstmt.executeQuery();
            while(rset.next()) {
                ChunDB chunDB = new ChunDB(rset.getString("학번"), rset.getString("이름"), rset.getDouble("학점"));
                chunDBList.add(chunDB);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(conn);
        }

        for(ChunDB c : chunDBList) {
            System.out.println(c.toString());
        }
    }
}
