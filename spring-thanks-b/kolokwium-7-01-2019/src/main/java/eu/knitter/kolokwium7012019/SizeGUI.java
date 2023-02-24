//Create extra GUI, which allows user to display rectangles bigger or smaller than the value defined by the user (2 points)

package eu.knitter.kolokwium7012019;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class SizeGUI extends VerticalLayout {

    private RectangleRepo rectangleRepo;

    private TextField textFieldSize;
    private TextArea textAreaRectangles;
    private Button buttonBigger;
    private Button buttonSmaller;

    @Autowired
    public SizeGUI(RectangleRepo rectangleRepo){
        this.rectangleRepo = rectangleRepo;
        this.textFieldSize  = new TextField("Pass a size");
        buttonBigger = new Button("show bigger");
        buttonSmaller = new Button("show smaller");
        this.textAreaRectangles = new TextArea("The result:");


        buttonBigger.addClickListener(clickEvent -> textAreaRectangles.setValue(rectangleRepo.getBigRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));
        buttonSmaller.addClickListener(clickEvent -> textAreaRectangles.setValue(rectangleRepo.getSmallRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));

        add(textFieldSize);
        add(buttonBigger);
        add(buttonSmaller);
        add(textAreaRectangles);


    }
}
