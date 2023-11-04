import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListBox implements Widget {

    private DialogDirector director;

    JList<String> jList;

    ListBox(DialogDirector director, List<String> strings) {
        this.director = director;

        DefaultListModel<String> model = new DefaultListModel<String>();
        for (String string : strings) {
            model.addElement(string);
        }

        jList = new JList<String>(model);

        jList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                changed();
            }
        });
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

}
