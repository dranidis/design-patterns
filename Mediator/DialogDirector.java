public interface DialogDirector {

    /**
     * This method is called by the widgets when their state is changed. The calling
     * widget passes itself as a parameter. The implementation of the method is
     * responsible for updating the state of the widgets that it manages.
     */
    public void widgetChanged(Widget widget);

}
