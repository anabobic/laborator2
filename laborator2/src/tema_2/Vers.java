package tema_2;

public class Vers {
    private String vers = new String();

    // Constructorul clasei Vers
    Vers(String vers)
    {
        this.vers = vers;
    }

    // Metoda care numără cuvintele în vers
    public int wordsCount()
    {
        return vers.split(" ").length;
    }

    // Metoda care numără cuvintele în vers
    public String getString()
    {
        return vers;
    }


    // Metoda care convertește versul la majuscule
    public void makeUpperCase()
    {
        vers = vers.toUpperCase();
    }

    // Metoda care verifică dacă versul se termină cu un anumit cuvânt
    public boolean endsWith(String word)
    {
        return vers.endsWith(word);
    }

    // Metoda care numără vocalele în vers
    public int vowelsCount()
    {
        int k = 0;

        for (char c : vers.toCharArray())
        {
            if (isVowel(c))
                k++;
        }

        return k;
    }

    // Metoda auxiliară care verifică dacă un caracter este o vocală
    private boolean isVowel(char c)
    {
        return  (new String ("aeiouAEIOU").contains(String.valueOf(c)));
    }
}
