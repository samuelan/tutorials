package com.sam;

public class OutsideClass {
  TestStatic.Person p;
  public OutsideClass(TestStatic.Person p1) {
    p = p1;
  }

  public void displayReport(){
    System.out.println(p);

    //System.out.println(p.firstname +  " is accessible from parent class");
  }


}
