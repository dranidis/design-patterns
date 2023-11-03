public class ListBox implements Widget {

    private DialogDirector director;

    private String selection;

    public ListBox(DialogDirector director) {
        this.director = director;
    }

    public void setDirector(DialogDirector director) {
        this.director = director;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        this.changed();
    }

    public String getSelection() {
        return selection;
    }

    @Override
    public void changed() {
        director.widgetChanged(this);
    }

}
