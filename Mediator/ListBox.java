import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListBox implements Widget {

    private DialogDirector director;

    List<String> allChoices;

    JList<String> jList;
    DefaultListModel<String> model;
    String lastValue;

    ListBox(DialogDirector director, List<String> allChoices) {
        this.director = director;
        this.allChoices = allChoices;

        model = new DefaultListModel<>();
        for (String string : allChoices) {
            model.addElement(string);
        }

        jList = new JList<>(model);

        jList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                String selectedValue = jList.getSelectedValue();
                if (!areSameStrings(selectedValue, lastValue)) {
                    lastValue = jList.getSelectedValue();
                    changed();
                }
            }
        });
    }

    protected boolean areSameStrings(String string1, String string2) {
        return (string1 == null && string2 == null) || (string1 != null && string1.equals(string2));
    }

    public JList<String> getJList() {
        return jList;
    }

    public String getSelection() {
        return jList.getSelectedValue();
    }

    @Override
    public void changed() {
        director.widgetChanged(this);
    }

    /**
     * This method is called by the director to update the state of the widget. The
     * list model is updated so that it holds only the strings matching the given
     * text.
     */
    public void filterFonts(String text) {
        model.clear();
        for (String string : allChoices) {
            if (string.toUpperCase().contains(text.toUpperCase()))
                model.addElement(string);
        }
    }

}
