package com.characterforge;

import java.util.List;

public interface CharacterDAO {

    void addCharacter(Character c);

    void updateCharacter(Character c);

    void deleteCharacter(int id);

    Character searchCharacter(int id);

    List<Character> displayAllCharacters();

}