
public class EntryField implements Widget {

    private DialogDirector director;

    private String text;

    public EntryField(DialogDirector director) {
        this.director = director;
    }

    public void setText(String text) {
        this.text = text;
        this.changed();
    }

    public String getText() {
        return text;
    }

    @Override
    public void changed() {
        director.widgetChanged(this);
    }
}
