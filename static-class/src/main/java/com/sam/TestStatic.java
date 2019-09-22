package com.sam;


public class TestStatic {

  public  static class Person {
    private String firstname;
    private int age;
    Person(String f, int a){
      firstname = f;
      age = a;
    }

    @Override public String toString() {
      return firstname + ", age: " + age;
    }

    public int getAge() {
      return age;
    }
  }

  Person[] people;

  public TestStatic(Person[] people) {
    this.people = people;
  }

  public void displayReport(){
    for( Person p : people){
      System.out.println(p);
      System.out.println(p.firstname +  " is accessible from parent class");
    }
  }

  public static void main(String[] args) {
    Person[]  ps = new Person[2];
    ps[0] = new Person("Michelle", 9);
    ps[1] = new Person("Carolyn", 12);
    //because main method is inside TestStatic class, the parent class, we have access to private member of Person class.
    //private member is not accessible, however, from OutsideClass, an outside, non-parent class.
    System.out.println(ps[0].firstname + " is accessible from outside class");
    TestStatic ts = new TestStatic(ps);
    ts.displayReport();
  }
}
