public class PrimitivosFloat {
    static long varFlotante;//con float :0.0, con long : 0
    public static void main(String[] args) {
        //float realFloat = 2.12e3f;//2120f;//1.0f;
        //float realFloat = 1.5e4f;//15000.0
        //float realFloat = 1.5e-10f;//0.00000000015f = 1.5E-10
        float realFloat = 0.00000000015f;//1.5E-10
        System.out.println("realFloat = "+realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;//1.5E-10
        System.out.println("realDouble = "+realFloat);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double " + Double.MIN_VALUE);

        //var varFlotante = 3.1416;
        System.out.println("varFlotante = "+varFlotante);

    }
}
