public interface Widget {

    /**
     * All the widgets delegate their changes to the dialog director. The standard
     * implementation of this method is:
     * 
     * <pre>
     * @Override
     * public void changed() {
     *     director.widgetChanged(this);
     * }
     * </pre>
     * 
     * Although the method is standard we don't want to make the interface an
     * abstract class because we want to allow the widgets to extend other classes.
     */
    public void changed();

}
