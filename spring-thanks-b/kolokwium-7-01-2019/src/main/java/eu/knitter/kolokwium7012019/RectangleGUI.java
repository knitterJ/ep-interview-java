//Z użyciem biblioteki Vaadin, stwórz UI pozwalające na dodawanie
// By using Vaadin, create UI, which allows to add new rectangles to the database

package eu.knitter.kolokwium7012019;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route
public class RectangleGUI extends VerticalLayout {

    //Inject DB mechanisms
    private RectangleRepo rectangleRepo;


    //declaration of the component fields
    private TextField textFieldHeight;
    private TextField textFieldWidth;
    private Button button;

    @Autowired
    public RectangleGUI(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
        //initialization
        textFieldHeight = new TextField("Podaj Wysokość");
        textFieldWidth = new TextField("Podaj Szerokość");
        button = new Button("Dodaj!");

        button.addClickListener(buttonClickEvent -> addRectangle());

        //add
        add(textFieldHeight);
        add(textFieldWidth);
        add(button);
    }
        public void addRectangle(){
            Rectangle rectangle = new Rectangle();
            rectangle.setHeight(Integer.parseInt(textFieldHeight.getValue()));
            rectangle.setWidth(Integer.parseInt(textFieldWidth.getValue()));

            //CREATE ENTITY IN DB
            rectangleRepo.save(rectangle);

        }
    }

