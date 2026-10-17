class Base 
{
        int i,j;
        void fun()
        { System.out.println("Base fun\n"); }
        void gun()
        { System.out.println("Base gun\n"); }
        void sun()
        { System.out.println("Base sun\n"); }
        void run()
        { System.out.println("Base run\n"); }
}

class Derived extends Base
{
        int x;
        void fun()
        { System.out.println("Derived fun\n"); }
        void sun()
        { System.out.println("Derived sun\n"); }
        void mun()
        { System.out.println("Derived mun\n"); }
        void bun()
        { System.out.println("Derived bun\n"); }
}

class virtualdemo6
{
    public static void main(String A[]) 
    {
        Base bp = new Derived();

        bp.fun();
        bp.gun();
        bp.sun();
        bp.run();
        // bp.mun();
        // bp.bun();
}
}