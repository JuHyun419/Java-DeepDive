package com.example.java.deepdive.map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapDiveTest {

    @DisplayName("Map.of() 팩토리 메서드로 생성한 Map을 변경하면 예외가 발생한다.")
    @Test
    void mapOf_Exception() {
        assertThrows(UnsupportedOperationException.class, MapDive::mapOfException);
    }

}