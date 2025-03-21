package com.example.application.views.claim1; 

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

/**
 * Claim1View represents the UI for submitting a claim with details like car type, damages, deductible, and agent name.
 * It includes a combo box, a checkbox group, a number field, a text field, and a submit button.
 */
@PageTitle("Claim1")
@Route("claim1")
@Menu(order = 1, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class Claim1View extends Composite<VerticalLayout> {

    public Claim1View() {
        // Main horizontal layout for form components
        HorizontalLayout formLayout = new HorizontalLayout();
        formLayout.setWidthFull();
        formLayout.addClassName(Gap.MEDIUM);
        formLayout.getStyle().set("flex-grow", "1");

        // ComboBox for car type selection
        ComboBox carTypeComboBox = new ComboBox("Your Car Type");
        carTypeComboBox.setWidth("min-content");
        setComboBoxSampleData(carTypeComboBox);

        // CheckboxGroup for damage selection
        CheckboxGroup<String> damageCheckboxGroup = new CheckboxGroup<>("Check all Damages that Apply");
        damageCheckboxGroup.setWidth("min-content");
        damageCheckboxGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        damageCheckboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);

        // NumberField for entering deductible amount
        NumberField deductibleField = new NumberField("Your Deductible");
        deductibleField.setWidth("min-content");
        formLayout.setAlignSelf(FlexComponent.Alignment.START, deductibleField);

        // TextField for entering agent name
        TextField agentNameField = new TextField("Agent Name");
        agentNameField.setWidth("min-content");

        // Primary button for form submission
        Button submitButton = new Button("Khakilate");
        submitButton.setWidth("min-content");
        submitButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // Configure the main layout
        VerticalLayout mainLayout = getContent();
        mainLayout.setWidth("100%");
        mainLayout.getStyle().set("flex-grow", "1");
        mainLayout.setFlexGrow(1.0, formLayout);
        mainLayout.setAlignSelf(FlexComponent.Alignment.START, submitButton);

        // Add components to the layout
        formLayout.add(carTypeComboBox, damageCheckboxGroup, deductibleField, agentNameField);
        mainLayout.add(formLayout, submitButton);
    }

    /**
     * Record for storing sample combo box data with value, label, and optional disabled state.
     */
    record SampleItem(String value, String label, Boolean disabled) {}

    /**
     * Sets sample data to the given combo box.
     *
     * @param comboBox The combo box to populate with sample data
     */
    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first123", "First123", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
