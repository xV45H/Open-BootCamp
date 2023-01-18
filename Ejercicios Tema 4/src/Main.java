public class Main {
    public static void main(String[] args) {

   // if, else if, else
    int numeroif = -1;

    if (numeroif < 0){
        System.out.println("NumeroIf "+ numeroif+ " es negativo");
    } else if (numeroif > 0)  {
        System.out.println("NumeroIf "+ numeroif+ " es positiva");
    }else {
        System.out.println("NumeroIf" + " es cero");
    }

    // While
    int numeroWhile = 1;
    while (numeroWhile <= 3 ){
        numeroWhile = numeroWhile + 1;
        System.out.println("NumeroWhile vale " + numeroWhile);
    }
    // doWhile
        int numeroDoWhile = 10;
        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println("NumeroDoWhile vale " + numeroDoWhile);
        }while (numeroDoWhile <= 10);

    // for
        int numeroFor = 0;
        for (; numeroFor <= 3 ; numeroFor = numeroFor + 1 ){
            System.out.println("NumeroFor vale " + numeroFor);
        }

       // switch/ Case/ break
    var estacion = "hola";
        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println(estacion + " no es una estacion");
        }
        }
    }
