public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //char caracter = '9';// solo se usa un caracter, '10'; ya es 2 caracteres y sale error para char
        /*
        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("caracter:"+ caracter);
        System.out.println("decimal:"+ decimal);
        System.out.println("caracter = decimal: " + (decimal == caracter));

        char simbolo = '@';

        System.out.println("simbolo = "+ simbolo);
        System.out.println("simbolo = caracter: "+ (simbolo == caracter));

         */

        //char espacio = ' ';
        //char espacio = '\u0020';
        //char retroceso = '\b';
        //char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        //System.out.println("tipo char corresponde en \tbyte a:" + tabulador + Character.BYTES);
        //System.out.println("tipo char corresponde en \bbyte a:" + tabulador + Character.BYTES);
        //System.out.println("tipo char corresponde en byte a:" + nuevaLinea + Character.BYTES);
        //System.out.println("tipo char corresponde en byte a:" + retornoCarro + Character.BYTES);
        //System.out.println("tipo char corresponde en byte a:" + nuevaLinea + retornoCarro + Character.BYTES);
        //System.out.println("tipo char corresponde en byte a:" + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("tipo char corresponde en byte a:" + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un char " + Character.MIN_VALUE);
    }
}
