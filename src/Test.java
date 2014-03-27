class Go {

    public static void main(String[] args) {
        System.out.print(C.x);
    }
}

class A{
    static{ System.out.print("A");
    }
}
class B extends A{
    public static int x = 5;
    static{
        System.out.print("B");
    }
}
class C extends B{
    static{
        System.out.print("C");
        System.exit(0);
    }
}