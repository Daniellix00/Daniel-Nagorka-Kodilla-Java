package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LoggerTestSuite {
  private static Logger logger;
  @Test
    void testLog(){
//Given
logger = Logger.INSTANCE;
logger.log("Zapisano");
logger.log("Usunieto");
//When
//then
assertEquals(logger.getLastLog(), "Usunieto");
    }
}
