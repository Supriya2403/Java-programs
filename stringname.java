class A {
    public String name = "Hello";
}

class B extends A {
    public String name = "Hey";
 public void display() {
        System.out.println(name);     
        System.out.println(super.name); 
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();    
    }
}

	



