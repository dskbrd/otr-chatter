package icu.keyboard.views.rooms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import icu.keyboard.views.MainLayout;
import javax.annotation.security.PermitAll;

@PageTitle("Rooms")
@Route(value = "rooms", layout = MainLayout.class)
@PermitAll
public class RoomsView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public RoomsView() {
        addClassName("rooms-view");
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }

}
