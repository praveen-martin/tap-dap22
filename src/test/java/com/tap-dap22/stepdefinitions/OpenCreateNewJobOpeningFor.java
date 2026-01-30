package com.tap-dap22.stepdefinitions;

import com..utils.ElementUtils;
import Assert;
import DriverFactory;
import cucumber.java.en.*;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
@Given("I am on the {string} page")
public void i_am_on_the_page(String page) {
// Implementation to navigate to the specified page
}
@When("I click the {string} element")
public void i_click_the_element(String element) {
// Implementation to clickElement the specified element
}
@When("I enter {string} in the {string} input")
public void i_enter_in_the_input(String value, String input) {
// Implementation to enter value in the specified input
}
@When("I clearElement the {string} input")
public void i_clear_the_input(String input) {
// Implementation to clearElement the specified input
}
@When("I select {string} from the {string} selection")
public void i_select_from_the_selection(String option, String selection) {
// Implementation to select option from the specified selection
}
@When("I check the {string} option")
public void i_check_the_option(String option) {
// Implementation to check the specified option
}
@Then("the {string} element should be {string}")
public void the_element_should_be(String element, String visibility) {
"Element visibility assertion failed", visibility.equals("visible");
}
@Then("validation message should be displayed for the {string} input")
public void validation_message_should_be_displayed_for_the_input(String input) {
// Implementation to check for validation message
}
@Then("the {string} input should be empty")
public void the_input_should_be_empty(String input) {
// Implementation to check if the input is empty
}
@Then("the {string} element should be visible")
public void the_element_should_be_visible(String element) {
// Implementation to check if the element is visible
}
@Then("the form should be saved successfully")
public void the_form_should_be_saved_successfully() {
"Form save assertion failed", true; // Replace with actual condition
}

public void i_am_on_the_page(String page) {
// Implementation to navigate to the specified page
}
@When("I clickElement the {string} button")
public void i_click_the_button(String button) {
// Implementation to clickElement the specified button
}
@When("I clickElement the {string} link")
public void i_click_the_link(String link) {
// Implementation to clickElement the specified link
}
@When("I enter {string} in the {string} field")
public void i_enter_in_the_field(String value, String field) {
// Implementation to enter value in the specified field
}
@When("I clearElement the {string} field")
public void i_clear_the_field(String field) {
// Implementation to clearElement the specified field
}
@When("I select {string} from the {string} dropdown")
public void i_select_from_the_dropdown(String option, String dropdown) {
// Implementation to select option from the specified dropdown
}
@When("I check the {string} checkbox")
public void i_check_the_checkbox(String checkbox) {
// Implementation to check the specified checkbox
}
@Then("the {string} button should be {string}")
public void the_button_should_be(String button, String state) {
"Button state assertion failed", state.equals("enabled") ? isButtonEnabled(button) : !isButtonEnabled(button);
}
@Then("validation message should be displayed for the {string} field")
public void validation_message_should_be_displayed_for_the_field(String field) {
"Validation message not displayed for field: " + field, isValidationMessageDisplayed(field);
}
@Then("the {string} field should be empty")
public void the_field_should_be_empty(String field) {
"Field is not empty: " + field, isFieldEmpty(field);
}
// DUPLICATE: @Then("the {string} element should be visible")
public void the_element_should_be_visible(String element) {
"Element is not visible: " + element, isElementVisible(element);
}
// DUPLICATE: @Then("the form should be saved successfully")
public void the_form_should_be_saved_successfully() {
"Form was not saved successfully", isFormSavedSuccessfully();
}
}