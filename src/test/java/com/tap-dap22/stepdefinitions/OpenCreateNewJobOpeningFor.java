package com.tap-dap22.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-dap22.pages.OpenCreateNewJobOpeningForPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
OpenCreateNewJobOpeningForPage openCreateNewJobOpeningForPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the recruiter is on the Job Opening screen")
public void the_recruiter_is_on_the_job_opening_screen() {
openCreateNewJobOpeningForPage.navigateToJobOpeningScreen();
}
@When("the recruiter clicks the Add Job Opening button")
public void the_recruiter_clicks_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.clickAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
openCreateNewJobOpeningForPage.areFieldsPresent();
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
@And("the Cancel button should remain enabled")
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
openCreateNewJobOpeningForPage.isJobTitleValidationMessageDisplayed();
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
openCreateNewJobOpeningForPage.isJobDescriptionValidationMessageDisplayed();
}
@Then("validation messages should be displayed for the empty job requirements field")
public void validation_messages_should_be_displayed_for_the_empty_job_requirements_field() {
openCreateNewJobOpeningForPage.isJobRequirementsValidationMessageDisplayed();
}
@Then("the Save button should remain disabled")
public void the_save_button_should_remain_disabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String job_title) {
openCreateNewJobOpeningForPage.fillJobTitleField(job_title);
}
@When("the user enters {string} in the job requirements field")
public void the_user_enters_in_the_job_requirements_field(String job_requirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(job_requirements);
}
@Then("the job title field should retain the value {string}")
public void the_job_title_field_should_retain_the_value(String job_title) {
Assert.assertEquals(job_title, openCreateNewJobOpeningForPage.getJobTitleFieldValue());
}
@Then("the job requirements field should retain the value {string}")
public void the_job_requirements_field_should_retain_the_value(String job_requirements) {
Assert.assertEquals(job_requirements, openCreateNewJobOpeningForPage.getJobRequirementsFieldValue());
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
openCreateNewJobOpeningForPage.isFormSavedSuccessfully();
}
@Then("the job opening is created with the title {string}")
public void the_job_opening_is_created_with_the_title(String job_title) {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithTitle(job_title);
}

@Given("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
// DUPLICATE: @When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
jobOpeningPage.enterJobTitle(jobTitle);
}
@When("the user enters {string} in the requirements field")
public void the_user_enters_in_the_requirements_field(String requirements) {
jobOpeningPage.enterJobRequirements(requirements);
}
@When("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@Then("validation messages are displayed for all required fields")
public void validation_messages_are_displayed_for_all_required_fields() {
jobOpeningPage.areValidationMessagesDisplayed();
}
@Then("the save button remains disabled")
public void the_save_button_remains_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("an error message should be displayed indicating the job title exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_title_exceeds_the_character_limit() {
jobOpeningPage.isJobTitleCharacterLimitErrorDisplayed();
}
@Then("the job title field retains the entered value")
public void the_job_title_field_retains_the_entered_value() {
Assert.assertEquals(jobOpeningPage.getJobTitle(), jobOpeningPage.getEnteredJobTitle());
}
@Then("the job description should display the html tags correctly")
public void the_job_description_should_display_the_html_tags_correctly() {
jobOpeningPage.isJobDescriptionHtmlRenderedCorrectly();
}
@Then("the form should display save cancel buttons")
public void the_form_should_display_save_cancel_buttons() {
jobOpeningPage.isSaveButtonDisplayed();
jobOpeningPage.isCancelButtonDisplayed();
}
@Then("the user is returned to the job opening screen")
public void the_user_is_returned_to_the_job_opening_screen() {
jobOpeningPage.isOnJobOpeningScreen();
}
@Then("the user should see an error message indicating invalid characters in the job title")
public void the_user_should_see_an_error_message_indicating_invalid_characters_in_the_job_title() {
jobOpeningPage.isInvalidCharactersErrorDisplayed();
}
@Then("the job opening should be created successfully without any validation errors")
public void the_job_opening_should_be_created_successfully_without_any_validation_errors() {
jobOpeningPage.isJobOpeningCreatedSuccessfully();
}
@Then("the job requirements field retains the entered value")
public void the_job_requirements_field_retains_the_entered_value() {
Assert.assertEquals(jobOpeningPage.getJobRequirements(), jobOpeningPage.getEnteredJobRequirements());
}
@Then("the job opening should be created with all job requirements listed")
public void the_job_opening_should_be_created_with_all_job_requirements_listed() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirements();
}
@Then("the create new job opening form should be displayed")
public void the_create_new_job_opening_form_should_be_displayed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("an error message should be displayed indicating the job title already exists")
public void an_error_message_should_be_displayed_indicating_the_job_title_already_exists() {
jobOpeningPage.isJobTitleAlreadyExistsErrorDisplayed();
}
@Then("the user fills in the requirements with {string}")
public void the_user_fills_in_the_requirements_with(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@Then("the job opening should have all fields populated to their maximum limits")
public void the_job_opening_should_have_all_fields_populated_to_their_maximum_limits() {
jobOpeningPage.isJobOpeningCreatedWithMaxLimits();
}
@Then("the job opening should be created with the job title {string}")
public void the_job_opening_should_be_created_with_the_job_title(String jobTitle) {
jobOpeningPage.isJobOpeningCreatedWithTitle(jobTitle);
}
@Then("the job opening should be created with special characters in the description")
public void the_job_opening_should_be_created_with_special_characters_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@Then("the job opening should be created with the email format included in the description")
public void the_job_opening_should_be_created_with_the_email_format_included_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
@Then("the job opening should be created with numeric values in the requirements")
public void the_job_opening_should_be_created_with_numeric_values_in_the_requirements() {
jobOpeningPage.isJobOpeningCreatedWithNumericRequirements();
}
@Then("the job opening should be created with the optional fields left empty")
public void the_job_opening_should_be_created_with_the_optional_fields_left_empty() {
jobOpeningPage.isJobOpeningCreatedWithOptionalFieldsEmpty();
}
@Then("the job opening should be created with the html tags rendered correctly")
public void the_job_opening_should_be_created_with_the_html_tags_rendered_correctly() {
jobOpeningPage.isJobOpeningCreatedWithHtmlTagsRenderedCorrectly();
}
@Then("the job title field retains the value {string}")
public void the_job_title_field_retains_the_value(String jobTitle) {
Assert.assertEquals(jobTitle, jobOpeningPage.getJobTitle());
}
@Then("the job description field is empty")
public void the_job_description_field_is_empty() {
jobOpeningPage.isJobDescriptionFieldEmpty();
}
@Then("the job requirements field is empty")
public void the_job_requirements_field_is_empty() {
jobOpeningPage.isJobRequirementsFieldEmpty();
}
@Then("the user clicks the cancel button")
public void the_user_clicks_the_cancel_button() {
jobOpeningPage.clickCancelButton();
}
@Then("the save button is enabled")
public void the_save_button_is_enabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the save button should be disabled")
public void the_save_button_should_be_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the user leaves the location field empty")
public void the_user_leaves_the_location_field_empty() {
jobOpeningPage.isLocationFieldEmpty();
}
@Then("the user leaves all fields empty")
public void the_user_leaves_all_fields_empty() {
jobOpeningPage.areAllFieldsEmpty();
}
}