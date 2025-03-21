package com.example.application.views.result;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Result")
@Route("Result")
@Menu(order = 2, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class ResultView extends Composite<VerticalLayout> {

    // Constructor to build the UI layout
    public ResultView() {
        // Create the main horizontal layout that will hold the vertical sections
        HorizontalLayout mainLayout = new HorizontalLayout();

        // Create vertical layouts for each of the three sections (Claim Info, Cost Breakdown, and Estimated Total)
        VerticalLayout claimInfoLayout = new VerticalLayout();
        VerticalLayout costBreakdownLayout = new VerticalLayout();
        VerticalLayout estimatedTotalLayout = new VerticalLayout();

        // Create headers (H3) and descriptions (Paragraph) for each section
        H3 claimInfoHeader = new H3("Claim Info");
        Paragraph claimInfoDescription = new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        H3 costBreakdownHeader = new H3("Cost Breakdown");
        Paragraph costBreakdownDescription = new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        H3 estimatedTotalHeader = new H3("Estimated Total");
        Paragraph estimatedTotalDescription = new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        // Style and layout adjustments for the overall content
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");

        // Adjust the properties of the main layout
        mainLayout.setWidthFull();
        getContent().setFlexGrow(1.0, mainLayout);
        mainLayout.addClassName(Gap.MEDIUM);

        // Set widths and heights for the individual sections
        claimInfoLayout.setWidth("358.3px");
        claimInfoLayout.setHeight("300px");
        costBreakdownLayout.setWidth("358.3px");
        costBreakdownLayout.setHeight("300px");
        estimatedTotalLayout.setWidth("358.3px");
        estimatedTotalLayout.setHeight("300px");

        // Add content to each section
        claimInfoLayout.add(claimInfoHeader, claimInfoDescription);
        costBreakdownLayout.add(costBreakdownHeader, costBreakdownDescription);
        estimatedTotalLayout.add(estimatedTotalHeader, estimatedTotalDescription);

        // Add the individual sections to the main layout
        mainLayout.add(claimInfoLayout, costBreakdownLayout, estimatedTotalLayout);

        // Add the main layout to the composite content
        getContent().add(mainLayout);
    }
}
