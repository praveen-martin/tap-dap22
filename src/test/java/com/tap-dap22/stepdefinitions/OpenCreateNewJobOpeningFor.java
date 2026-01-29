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
OpenCreateNewJobOpeningForPage jobOpeningPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the recruiter is on the Job Opening screen")
public void the_recruiter_is_on_the_job_opening_screen() {
jobOpeningPage.navigateToJobOpeningScreen();
}
@When("the recruiter clicks the Add Job Opening button")
public void the_recruiter_clicks_the_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
jobOpeningPage.areRequiredFieldsDisplayed();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
jobOpeningPage.areSaveAndCancelButtonsDisplayed();
}
@When("the user fills in the job title field with {string}")
public void the_user_fills_in_the_job_title_field_with(String jobTitle) {
jobOpeningPage.fillJobTitleField(jobTitle);
}
@When("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
jobOpeningPage.fillJobDescriptionField(jobDescription);
}
@When("the user fills in the job requirements field with {string}")
public void the_user_fills_in_the_job_requirements_field_with(String jobRequirements) {
jobOpeningPage.fillJobRequirementsField(jobRequirements);
}
@Then("the Save button should be enabled")
public void the_save_button_should_be_enabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@And("the Cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@When("the user clicks on the Cancel button")
public void the_user_clicks_on_the_cancel_button() {
jobOpeningPage.clickCancelButton();
}
@Then("the Create New Job Opening form should be closed")
public void the_create_new_job_opening_form_should_be_closed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user should be returned to the Job Opening screen")
public void the_user_should_be_returned_to_the_job_opening_screen() {
jobOpeningPage.isOnJobOpeningScreen();
}
@When("the user leaves the job title field empty")
public void the_user_leaves_the_job_title_field_empty() {
jobOpeningPage.leaveJobTitleFieldEmpty();
}
@When("the user leaves the job description field empty")
public void the_user_leaves_the_job_description_field_empty() {
jobOpeningPage.leaveJobDescriptionFieldEmpty();
}
@When("the user leaves the job requirements field empty")
public void the_user_leaves_the_job_requirements_field_empty() {
jobOpeningPage.leaveJobRequirementsFieldEmpty();
}
@When("the user clicks the Save button")
public void the_user_clicks_the_save_button() {
jobOpeningPage.clickSaveButton();
}
@Then("validation messages should be displayed for the empty job title field")
public void validation_messages_should_be_displayed_for_the_empty_job_title_field() {
jobOpeningPage.isJobTitleValidationMessageDisplayed();
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
jobOpeningPage.isJobDescriptionValidationMessageDisplayed();
}
@Then("validation messages should be displayed for the empty job requirements field")
public void validation_messages_should_be_displayed_for_the_empty_job_requirements_field() {
jobOpeningPage.isJobRequirementsValidationMessageDisplayed();
}
@Then("the Save button should remain disabled")
public void the_save_button_should_remain_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the job title field should retain the value {string}")
public void the_job_title_field_should_retain_the_value(String jobTitle) {
Assert.assertEquals(jobTitle, jobOpeningPage.getJobTitleFieldValue());
}
@Then("the job requirements field should retain the value {string}")
public void the_job_requirements_field_should_retain_the_value(String jobRequirements) {
Assert.assertEquals(jobRequirements, jobOpeningPage.getJobRequirementsFieldValue());
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
jobOpeningPage.fillJobTitleField(jobTitle);
}
@When("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String jobDescription) {
jobOpeningPage.fillJobDescriptionField(jobDescription);
}
@When("the user enters {string} in the requirements field")
public void the_user_enters_in_the_requirements_field(String requirements) {
jobOpeningPage.fillJobRequirementsField(requirements);
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@Then("the job opening is created with the title {string}")
public void the_job_opening_is_created_with_the_title(String jobTitle) {
jobOpeningPage.isJobOpeningCreatedWithTitle(jobTitle);
}
@Then("the job opening should be created successfully")
public void the_job_opening_should_be_created_successfully() {
jobOpeningPage.isJobOpeningCreatedSuccessfully();
}
@Then("the job requirements should include {string}")
public void the_job_requirements_should_include(String requirements) {
jobOpeningPage.doesJobOpeningIncludeRequirements(requirements);
}

@Given("the user enters job title {string}")
public void the_user_enters_job_title(String jobTitle) {
jobOpeningPage.enterJobTitle(jobTitle);
}
@When("the user fills in the job title with {string}")
public void the_user_fills_in_the_job_title_with(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user enters {string} in the job description")
public void the_user_enters_in_the_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@When("the user enters requirements {string}")
public void the_user_enters_requirements(String requirements) {
jobOpeningPage.enterJobRequirements(requirements);
}
@When("the user enters job description {string}")
public void the_user_enters_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@When("the user clicks the add job opening button")
public void the_user_clicks_the_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
@Then("an error message should be displayed indicating the job title is too short")
public void an_error_message_should_be_displayed_indicating_the_job_title_is_too_short() {
jobOpeningPage.isJobTitleTooShortErrorDisplayed();
}
@Then("the job requirements field retains the value {string}")
public void the_job_requirements_field_retains_the_value(String requirements) {
Assert.assertEquals(requirements, jobOpeningPage.getJobRequirementsFieldValue());
}
@Then("the form should save successfully without any validation errors")
public void the_form_should_save_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@Then("the job opening should be created successfully without any validation errors")
public void the_job_opening_should_be_created_successfully_without_any_validation_errors() {
jobOpeningPage.isJobOpeningCreatedSuccessfully();
}
@Then("validation messages are displayed for the empty job title field")
public void validation_messages_are_displayed_for_the_empty_job_title_field() {
jobOpeningPage.isJobTitleEmptyValidationMessageDisplayed();
}
@Then("the job opening is created with the special characters in the title")
public void the_job_opening_is_created_with_the_special_characters_in_the_title() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInTitle();
}
@Then("the save button remains disabled")
public void the_save_button_remains_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the user should see an error message indicating the job description exceeds the character limit")
public void the_user_should_see_an_error_message_indicating_the_job_description_exceeds_the_character_limit() {
jobOpeningPage.isJobDescriptionExceedsCharacterLimitErrorDisplayed();
}
@Then("the user leaves the salary field empty")
public void the_user_leaves_the_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@Then("the user leaves the location field empty")
public void the_user_leaves_the_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@Then("the job opening should have all fields populated to their maximum limits")
public void the_job_opening_should_have_all_fields_populated_to_their_maximum_limits() {
jobOpeningPage.areAllFieldsPopulatedToMaxLimits();
}
@Then("validation messages should be displayed for all required fields")
public void validation_messages_should_be_displayed_for_all_required_fields() {
jobOpeningPage.areValidationMessagesDisplayedForRequiredFields();
}
@Then("the job opening should be created with the job title {string}")
public void the_job_opening_should_be_created_with_the_job_title(String jobTitle) {
jobOpeningPage.isJobOpeningCreatedWithJobTitle(jobTitle);
}
@Then("the job opening should be created with the job description rendered correctly")
public void the_job_opening_should_be_created_with_the_job_description_rendered_correctly() {
jobOpeningPage.isJobDescriptionRenderedCorrectly();
}
@Then("the job opening should be created with special characters in the description")
public void the_job_opening_should_be_created_with_special_characters_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@Then("the job opening should be created with numeric values in the requirements")
public void the_job_opening_should_be_created_with_numeric_values_in_the_requirements() {
jobOpeningPage.isJobOpeningCreatedWithNumericValuesInRequirements();
}
@Then("an error message should be displayed indicating the job title already exists")
public void an_error_message_should_be_displayed_indicating_the_job_title_already_exists() {
jobOpeningPage.isJobTitleAlreadyExistsErrorDisplayed();
}
@Then("the user should see an error message indicating invalid characters in the job title")
public void the_user_should_see_an_error_message_indicating_invalid_characters_in_the_job_title() {
jobOpeningPage.isInvalidCharactersInJobTitleErrorDisplayed();
}
@Then("the job title field retains the value {string}")
public void the_job_title_field_retains_the_value(String jobTitle) {
Assert.assertEquals(jobTitle, jobOpeningPage.getJobTitleFieldValue());
}
@Then("an error message should be displayed indicating the job title exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_title_exceeds_the_character_limit() {
jobOpeningPage.isJobTitleExceedsCharacterLimitErrorDisplayed();
}
@Then("validation messages are displayed for the empty job description field")
public void validation_messages_are_displayed_for_the_empty_job_description_field() {
jobOpeningPage.isJobDescriptionEmptyValidationMessageDisplayed();
}
@Then("the job opening should be created with all job requirements listed")
public void the_job_opening_should_be_created_with_all_job_requirements_listed() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirementsListed();
}
@Then("the job description should display the html tags correctly")
public void the_job_description_should_display_the_html_tags_correctly() {
jobOpeningPage.isJobDescriptionHtmlTagsDisplayedCorrectly();
}
@Then("the form should display save cancel buttons")
public void the_form_should_display_save_cancel_buttons() {
jobOpeningPage.isSaveCancelButtonsDisplayed();
}
@Then("the job opening should be created with the email format included in the description")
public void the_job_opening_should_be_created_with_the_email_format_included_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
}