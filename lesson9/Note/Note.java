package Note;

public class Note implements Comparable{
    public String[] note = new String[]{"до", "ре", "ми", "фа", "соль", "ля", "си"};
    public String[] tonality = new String[]{"контроктава", "большая", "малая", "первая", "вторая", "третья", "четвертая"};
    public String[] signOfAlteration = new String[]{"отсутствует", "диез", "бемоль"};

    public Note(String[] note, String[] tonality, String[] signOfAlteration) {
        this.note = note;
        this.tonality = tonality;
        this.signOfAlteration = signOfAlteration;
    }

    @Override
    public int compareTo(Object o) {
       if (note.equals(tonality)){
           
       }

        return 0;
    }
}
