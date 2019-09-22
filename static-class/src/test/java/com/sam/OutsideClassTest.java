package com.sam;

import static org.junit.Assert.*;

public class OutsideClassTest {
  @org.junit.Test
  public void testOutside(){
    TestStatic.Person p1 = new TestStatic.Person("Sam", 45);
    assertEquals(45, p1.getAge());
  }
}