package com.example.application.views.mainpage;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Main Page")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class MainPageView extends Composite<VerticalLayout> {

    public MainPageView() {
        // Page title header
        H1 pageTitleHeader = new H1("Jake's Khakilator");
        pageTitleHeader.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, pageTitleHeader);

        // Login form container using FormLayout
        FormLayout loginFormContainer = new FormLayout();
        loginFormContainer.setWidthFull();

        // Login form component
        LoginForm loginForm = new LoginForm();

        // Configure content layout
        getContent().setWidthFull();
        getContent().getStyle().set("flex-grow", "1");

        // Add components to layout
        getContent().add(pageTitleHeader);
        getContent().add(loginFormContainer);
        loginFormContainer.add(loginForm);
    }
}
