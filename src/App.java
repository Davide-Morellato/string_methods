public class App {
    public static void main(String[] args){
        /*
         *** METODI DELLE STRINGHE ***
         * 
         * equals -> permette di paragonare una stringa con un'altra, e restituisce un booleano (true||false) ed è case sensitive (sensibile a Maiuscole/minuscole); 
         * 
         * equalsIgnoreCase -> restituisce un booleano (true||false) e NON è case sensitive;
         * 
         * length -> permette di sapere la lunghezza, quindi il numero totale di caratteri di cui è composta;
         * 
         * charAt -> passandogli come parametro l'indice, indica quale carattere si trova a quell'indice;
         * 
         * indexOf -> passandogli come parametro un carattere, indica a quale indice si trova quel carattere;
         * 
         * isEmpty -> restituisce un booleano (true||false), indicando se la stringa è piena o vuota;
         * 
         * toUpperCase -> restituisce la stringa in MAIUSCOLO;
         * 
         * toLowerCase -> restituisce la stringa in minuscolo;
         * 
         * trim -> permette di eliminare gli spazi in eccesso, all'inizio e alla fine della stringa;
         * 
         * replace -> restituisce una stringa in cui tutte le occorrenze di un carattere sono sostituite con un altro carattere (sensitive case)
         * 
         */

         String word = "Ciccio";
         String firstWord = "Ciao";
         String secondWord = "ciccio";

         //
         /* EQUALS */
         boolean result = word.equals(firstWord); //restituisce true o false, è necessario dichiarare la variabile come booleano (boolean)
         System.out.println("EQUALS: " + word + " uguale a " + firstWord + " = " + result); //restituisce FALSE

         boolean res = word.equals(secondWord);
         System.out.println("EQUALS: " + word + " uguale a " + secondWord + " = " + res); //restituisce FALSE -> case sensitive

         //
         /* EQUALS IGNORE CASE */
         boolean ignoreCase = word.equalsIgnoreCase(secondWord);
         System.out.println("EQUALS IGNORE CASE: " + word + " uguale a " + secondWord + " = " + ignoreCase); //restituisce TRUE


         //
         /* LENGTH */
         int lengthWord = word.length(); //restituisce un numero, è necessario identificare la variabile come intero (int)
         System.out.println(lengthWord); //restituisce 6


         //
         /* CHARAT */
         char quote = word.charAt(3); //restituisce un carattere, è necessario identificare la variabile come char
         System.out.println(quote); //restituisce 'c'


         //
         /* INDEXOF */
         int index = word.indexOf("i"); //restituisce l'indice, è necessario identificare la variabile come intero (int)
         System.out.println(index); //restituisce 1 (carattere i all'indice 1)


         //
         /* ISEMPTY */
         boolean bool = word.isEmpty(); //restituisce true || false, è necessario identificare la variabile come booleano (boolean)
         System.out.println(bool); //restituisce false -> perchè la variabile word contiene un valore

         
         //
         /* TOUPPERCASE */
         String upper = word.toUpperCase();
         System.out.println(upper); //restituisce CICCIO
         

         //
         /* TOLOWERCASE */
         String lower = word.toLowerCase();
         System.out.println(lower); //restituisce ciccio


         //
         /* TRIM */
         String thirdWord = "   Ciao   ";
         String trimmedWord = thirdWord.trim();
         System.out.println("Con gli spazi: " + thirdWord);
         System.out.println("Senza spazi: " + trimmedWord); 


         //
         /* REPLACE */
         String replacedChar = word.replace("o", "a");
         System.out.println(replacedChar); //restituisce Ciccia

         String repChar = word.replace("c", "d");
         System.out.println(repChar); //restituisce Ciddio --> perchè il carattere sostitutivo è minuscolo

         String lowerRepChar = word.toLowerCase().replace("c", "d");
         System.out.println(lowerRepChar); //restituisce diddio --> avendo usato toLowerCase() per rendere la stringa minuscola, anche la prima lettera è stata sostituita
    }
}
