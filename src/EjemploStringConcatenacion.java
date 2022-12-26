public class EjemploStringConcatenacion {
    public static void main(String[] args) {



        String curso = "Programacion Java";
        String profesor = "Carlos Egas";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        //String detalle2 = curso.concat(profesor);
        String detalle2 = curso.concat("".concat(profesor));

        System.out.println("detalle2 = " + detalle2);
    }
}
