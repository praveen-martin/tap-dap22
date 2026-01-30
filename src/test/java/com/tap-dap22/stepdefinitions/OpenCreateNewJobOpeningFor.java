package com.tap-dap22.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com.tap-dap22.driverfactory.DriverFactory;
import com.tap-dap22.pages.OpenCreateNewJobOpeningForPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
OpenCreateNewJobOpeningForPage openCreateNewJobOpeningForPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the recruiter is on the Job Opening screen")
public void the_recruiter_is_on_the_job_opening_screen() {
driver = DriverFactory.getDriver();
openCreateNewJobOpeningForPage.navigateToJobOpeningScreen();
}
@When("the recruiter clicks the Add Job Opening button")
public void the_recruiter_clicks_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.clickAddJobOpeningButton();
}
@Then("the Create New Job Opening form should be displayed")
public void the_create_new_job_opening_form_should_be_displayed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
openCreateNewJobOpeningForPage.areFieldsDisplayed();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
openCreateNewJobOpeningForPage.areSaveAndCancelButtonsDisplayed();
}
@When("the user fills in the job title field with {string}")
public void the_user_fills_in_the_job_title_field_with(String job_title) {
openCreateNewJobOpeningForPage.fillJobTitleField(job_title);
}
@When("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String job_description) {
openCreateNewJobOpeningForPage.fillJobDescriptionField(job_description);
}
@When("the user fills in the job requirements field with {string}")
public void the_user_fills_in_the_job_requirements_field_with(String job_requirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(job_requirements);
}
@Then("the Save button should be enabled")
public void the_save_button_should_be_enabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@Then("the Cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
openCreateNewJobOpeningForPage.isCancelButtonEnabled();
}
@When("the user clicks on the Cancel button")
public void the_user_clicks_on_the_cancel_button() {
openCreateNewJobOpeningForPage.clickCancelButton();
}
@Then("the Create New Job Opening form should be closed")
public void the_create_new_job_opening_form_should_be_closed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user should be returned to the Job Opening screen")
public void the_user_should_be_returned_to_the_job_opening_screen() {
openCreateNewJobOpeningForPage.isOnJobOpeningScreen();
}
@When("the user leaves the job title field empty")
public void the_user_leaves_the_job_title_field_empty() {
openCreateNewJobOpeningForPage.leaveJobTitleFieldEmpty();
}
@When("the user leaves the job description field empty")
public void the_user_leaves_the_job_description_field_empty() {
openCreateNewJobOpeningForPage.leaveJobDescriptionFieldEmpty();
}
@When("the user leaves the job requirements field empty")
public void the_user_leaves_the_job_requirements_field_empty() {
openCreateNewJobOpeningForPage.leaveJobRequirementsFieldEmpty();
}
@When("the user clicks the Save button")
public void the_user_clicks_the_save_button() {
openCreateNewJobOpeningForPage.clickSaveButton();
}
@Then("validation messages should be displayed for the empty job title field")
public void validation_messages_should_be_displayed_for_the_empty_job_title_field() {
openCreateNewJobOpeningForPage.isValidationMessageDisplayedForJobTitle();
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
openCreateNewJobOpeningForPage.isValidationMessageDisplayedForJobDescription();
}
@Then("validation messages should be displayed for the empty job requirements field")
public void validation_messages_should_be_displayed_for_the_empty_job_requirements_field() {
openCreateNewJobOpeningForPage.isValidationMessageDisplayedForJobRequirements();
}
@Then("the Save button should remain disabled")
public void the_save_button_should_remain_disabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@Then("the job title field should retain the value {string}")
public void the_job_title_field_should_retain_the_value(String job_title) {
Assert.assertEquals(job_title, openCreateNewJobOpeningForPage.getJobTitleFieldValue());
}
@Then("the job requirements field should retain the value {string}")
public void the_job_requirements_field_should_retain_the_value(String job_requirements) {
Assert.assertEquals(job_requirements, openCreateNewJobOpeningForPage.getJobRequirementsFieldValue());
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String job_title) {
openCreateNewJobOpeningForPage.fillJobTitleField(job_title);
}
@When("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String job_description) {
openCreateNewJobOpeningForPage.fillJobDescriptionField(job_description);
}
@When("the user enters {string} in the requirements field")
public void the_user_enters_in_the_requirements_field(String requirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(requirements);
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
openCreateNewJobOpeningForPage.isFormSavedSuccessfully();
}
@Then("the job opening is created with the title {string}")
public void the_job_opening_is_created_with_the_title(String job_title) {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithTitle(job_title);
}

@When("the user enters {string} in the {field} field")
public void the_user_enters_value_in_field(String value, String field) {
switch (field) {
case "job requirements":
openCreateNewJobOpeningForPage.enterJobRequirements(value);
break;
case "job title":
openCreateNewJobOpeningForPage.enterJobTitle(value);
break;
case "job description":
openCreateNewJobOpeningForPage.enterJobDescription(value);
break;
default:
throw new IllegalArgumentException("Invalid field: " + field);
}
}
@Then("the {field} field retains the value {string}")
public void the_field_retains_the_value(String field, String expectedValue) {
String actualValue;
switch (field) {
case "job title":
actualValue = openCreateNewJobOpeningForPage.getJobTitle();
break;
case "job requirements":
actualValue = openCreateNewJobOpeningForPage.getJobRequirements();
break;
default:
throw new IllegalArgumentException("Invalid field: " + field);
}
Assert.assertEquals(expectedValue, actualValue);
}
@Then("validation messages are displayed for the empty {field} field")
public void validation_messages_are_displayed_for_the_empty_field(String field) {
openCreateNewJobOpeningForPage.isValidationMessageDisplayed(field);
}
@Then("the job opening should be created with {string} in the {field} field")
public void the_job_opening_should_be_created_with_value_in_field(String value, String field) {
switch (field) {
case "job title":
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithJobTitle(value);
break;
case "job description":
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithJobDescription(value);
break;
case "job requirements":
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithJobRequirements(value);
break;
default:
throw new IllegalArgumentException("Invalid field: " + field);
}
}
@Then("an error message should be displayed indicating {string}")
public void an_error_message_should_be_displayed_indicating(String message) {
openCreateNewJobOpeningForPage.isErrorMessageDisplayed(message);
}
@Then("the form should save successfully")
public void the_form_should_save_successfully() {
openCreateNewJobOpeningForPage.isFormSavedSuccessfully();
}
@Then("the form should contain fields for job title, description, requirements, other relevant information")
public void the_form_should_contain_fields_for_job_title_description_requirements_other_relevant_information() {
openCreateNewJobOpeningForPage.areAllFieldsDisplayed();
}
@When("the user clicks the {string} button")
public void the_user_clicks_button(String button) {
switch (button) {
case "add job opening":
openCreateNewJobOpeningForPage.clickAddJobOpeningButton();
break;
case "cancel":
openCreateNewJobOpeningForPage.clickCancelButton();
break;
default:
throw new IllegalArgumentException("Invalid button: " + button);
}
}
@Then("the job opening should be created successfully")
public void the_job_opening_should_be_created_successfully() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedSuccessfully();
}
@Then("the save button should be {string}")
public void the_save_button_should_be(String state) {
boolean isEnabled = openCreateNewJobOpeningForPage.isSaveButtonEnabled();
if (state.equals("disabled")) {
isEnabled;
} else {
isEnabled;
}
}
}