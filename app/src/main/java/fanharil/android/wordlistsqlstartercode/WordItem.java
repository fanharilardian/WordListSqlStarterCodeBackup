package fanharil.android.wordlistsqlstartercode;

/**
 * Created by Fanharil Ardian on 24/03/2018.
 */

public class WordItem {

    private int mId;
    private String mWord;

    public WordItem() {}

    public int getId() {
        return this.mId;
    }

    public String getWord() {
        return this.mWord;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public void setWord(String word) {
        this.mWord = word;
    }
}