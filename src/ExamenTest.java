public class ExamenTest {
    public static void main(String [] Args){
        Examen e = new Examen();
        String frase="Una noia anomenada Anna va anar a cercar al bosc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
        e.printArray(e.stringToCharArray(frase));
       System.out.println( e.isIndexDelimitor(e.stringToCharArray(frase),2));
    }
}
