public class Button implements Widget {

    private DialogDirector director;

    public Button(DialogDirector director) {
        this.director = director;
    }

    @Override
    public void changed() {
        director.widgetChanged(this);
    }

}
