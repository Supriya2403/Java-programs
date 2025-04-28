interface Bank {
    float roi();
}

class SBI implements Bank {
    public float roi() {
        return 1.5f;
    }
}

class PNB implements Bank {
    public float roi() {
        return 1.7f;
    }
}

class Main {
    public static void main(String[] args) {
        Bank b;
        
        b = new SBI();
        System.out.println(b.roi());  

        b = new PNB();
        System.out.println(b.roi());  
    }
}
