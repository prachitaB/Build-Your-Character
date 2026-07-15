package com.characterforge;

import java.sql.*;
import java.util.*;

public class CharacterDAOImpl implements CharacterDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void addCharacter(Character c) {

        try {

            con = DBConnection.getConnection();

            String sql = "INSERT INTO character_data VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);

            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            ps.setInt(3, c.getLevel());
            ps.setString(4, c.getClassType());
            ps.setString(5, c.getSpecies());
            ps.setString(6, c.getBackground());
            ps.setInt(7, c.getStrength());
            ps.setInt(8, c.getDexterity());
            ps.setInt(9, c.getConstitution());
            ps.setInt(10, c.getIntelligence());
            ps.setInt(11, c.getWisdom());
            ps.setInt(12, c.getCharisma());
            ps.setString(13, c.getWeapon());

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Character created successfully.");
            } else {
                System.out.println("Character could not be created.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateCharacter(Character c) {

        try {

            con = DBConnection.getConnection();

            String sql = "UPDATE character_data SET name=?, level=?, class_type=?, species=?, background=?, strength=?, dexterity=?, constitution=?, intelligence=?, wisdom=?, charisma=?, weapon=? WHERE id=?";

            ps = con.prepareStatement(sql);

            ps.setString(1, c.getName());
            ps.setInt(2, c.getLevel());
            ps.setString(3, c.getClassType());
            ps.setString(4, c.getSpecies());
            ps.setString(5, c.getBackground());
            ps.setInt(6, c.getStrength());
            ps.setInt(7, c.getDexterity());
            ps.setInt(8, c.getConstitution());
            ps.setInt(9, c.getIntelligence());
            ps.setInt(10, c.getWisdom());
            ps.setInt(11, c.getCharisma());
            ps.setString(12, c.getWeapon());
            ps.setInt(13, c.getId());

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Character updated successfully.");
            } else {
                System.out.println("Character not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteCharacter(int id) {

        try {

            con = DBConnection.getConnection();

            String sql = "DELETE FROM character_data WHERE id=?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Character deleted successfully.");
            } else {
                System.out.println("Character not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Character searchCharacter(int id) {

        Character c = null;

        try {

            con = DBConnection.getConnection();

            String sql = "SELECT * FROM character_data WHERE id=?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {

                c = new Character();

                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setLevel(rs.getInt("level"));
                c.setClassType(rs.getString("class_type"));
                c.setSpecies(rs.getString("species"));
                c.setBackground(rs.getString("background"));
                c.setStrength(rs.getInt("strength"));
                c.setDexterity(rs.getInt("dexterity"));
                c.setConstitution(rs.getInt("constitution"));
                c.setIntelligence(rs.getInt("intelligence"));
                c.setWisdom(rs.getInt("wisdom"));
                c.setCharisma(rs.getInt("charisma"));
                c.setWeapon(rs.getString("weapon"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return c;

    }

    @Override
    public List<Character> displayAllCharacters() {

        List<Character> list = new ArrayList<Character>();

        try {

            con = DBConnection.getConnection();

            String sql = "SELECT * FROM character_data";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                Character c = new Character();

                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setLevel(rs.getInt("level"));
                c.setClassType(rs.getString("class_type"));
                c.setSpecies(rs.getString("species"));
                c.setBackground(rs.getString("background"));
                c.setStrength(rs.getInt("strength"));
                c.setDexterity(rs.getInt("dexterity"));
                c.setConstitution(rs.getInt("constitution"));
                c.setIntelligence(rs.getInt("intelligence"));
                c.setWisdom(rs.getInt("wisdom"));
                c.setCharisma(rs.getInt("charisma"));
                c.setWeapon(rs.getString("weapon"));

                list.add(c);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;

    }

}