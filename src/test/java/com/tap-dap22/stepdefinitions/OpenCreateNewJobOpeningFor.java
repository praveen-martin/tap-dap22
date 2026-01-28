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
@Given("the user is on the Job Opening screen")
public void the_user_is_on_the_job_opening_screen() {
openCreateNewJobOpeningForPage.navigateToJobOpeningScreen();
}
@When("I locate the Add Job Opening button")
public void i_locate_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.locateAddJobOpeningButton();
}
@When("I click on the Add Job Opening button")
public void i_click_on_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.clickAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
openCreateNewJobOpeningForPage.areAllFieldsPresent();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
openCreateNewJobOpeningForPage.areSaveAndCancelButtonsDisplayed();
}
@When("I fill in the job title field with {string}")
public void i_fill_in_the_job_title_field_with(String jobTitle) {
openCreateNewJobOpeningForPage.fillJobTitleField(jobTitle);
}
@When("I fill in the job description field with {string}")
public void i_fill_in_the_job_description_field_with(String jobDescription) {
openCreateNewJobOpeningForPage.fillJobDescriptionField(jobDescription);
}
@When("I fill in the job requirements field with {string}")
public void i_fill_in_the_job_requirements_field_with(String jobRequirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(jobRequirements);
}
@When("I ensure all required fields are filled")
public void i_ensure_all_required_fields_are_filled() {
openCreateNewJobOpeningForPage.ensureAllRequiredFieldsFilled();
}
@Then("the Save button is enabled")
public void the_save_button_is_enabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@Then("the Cancel button remains enabled")
public void the_cancel_button_remains_enabled() {
openCreateNewJobOpeningForPage.isCancelButtonEnabled();
}
@When("I click on the Cancel button in the Create New Job Opening form")
public void i_click_on_the_cancel_button_in_the_create_new_job_opening_form() {
openCreateNewJobOpeningForPage.clickCancelButton();
}
@Then("the Create New Job Opening form is closed")
public void the_create_new_job_opening_form_is_closed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user is returned to the Job Opening screen")
public void the_user_is_returned_to_the_job_opening_screen() {
openCreateNewJobOpeningForPage.isOnJobOpeningScreen();
}
@Given("the job title field is empty")
public void the_job_title_field_is_empty() {
openCreateNewJobOpeningForPage.clearJobTitleField();
}
@Given("the job description field is empty")
public void the_job_description_field_is_empty() {
openCreateNewJobOpeningForPage.clearJobDescriptionField();
}
@Given("the job requirements field is empty")
public void the_job_requirements_field_is_empty() {
openCreateNewJobOpeningForPage.clearJobRequirementsField();
}
@When("the user clicks the Save button")
public void the_user_clicks_the_save_button() {
openCreateNewJobOpeningForPage.clickSaveButton();
}
@Then("validation messages are displayed for the empty job title field")
public void validation_messages_are_displayed_for_the_empty_job_title_field() {
openCreateNewJobOpeningForPage.isJobTitleValidationMessageDisplayed();
}
@Then("validation messages are displayed for the empty job description field")
public void validation_messages_are_displayed_for_the_empty_job_description_field() {
openCreateNewJobOpeningForPage.isJobDescriptionValidationMessageDisplayed();
}
@Then("validation messages are displayed for the empty job requirements field")
public void validation_messages_are_displayed_for_the_empty_job_requirements_field() {
openCreateNewJobOpeningForPage.isJobRequirementsValidationMessageDisplayed();
}
@Then("the Save button remains disabled")
public void the_save_button_remains_disabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@When("I enter {string} in the job requirements field")
public void i_enter_in_the_job_requirements_field(String requirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(requirements);
}
@When("I enter {string} in the job title field")
public void i_enter_in_the_job_title_field(String jobTitle) {
openCreateNewJobOpeningForPage.fillJobTitleField(jobTitle);
}
@When("I enter {string} in the job description field")
public void i_enter_in_the_job_description_field(String jobDescription) {
openCreateNewJobOpeningForPage.fillJobDescriptionField(jobDescription);
}
@Then("an error message is displayed indicating the job title is too short")
public void an_error_message_is_displayed_indicating_the_job_title_is_too_short() {
openCreateNewJobOpeningForPage.isJobTitleTooShortErrorDisplayed();
}
@Then("an error message is displayed indicating the job description exceeds the character limit")
public void an_error_message_is_displayed_indicating_the_job_description_exceeds_the_character_limit() {
openCreateNewJobOpeningForPage.isJobDescriptionExceedsLimitErrorDisplayed();
}
@Then("an error message is displayed indicating the job title already exists")
public void an_error_message_is_displayed_indicating_the_job_title_already_exists() {
openCreateNewJobOpeningForPage.isJobTitleAlreadyExistsErrorDisplayed();
}
@Then("an error message is displayed indicating invalid characters in the job title")
public void an_error_message_is_displayed_indicating_invalid_characters_in_the_job_title() {
openCreateNewJobOpeningForPage.isInvalidCharactersInJobTitleErrorDisplayed();
}
@Then("an error message is displayed indicating the job title exceeds the character limit")
public void an_error_message_is_displayed_indicating_the_job_title_exceeds_the_character_limit() {
openCreateNewJobOpeningForPage.isJobTitleExceedsLimitErrorDisplayed();
}
@Then("an error message should be displayed indicating the job requirements exceed the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_requirements_exceed_the_character_limit() {
openCreateNewJobOpeningForPage.isJobRequirementsExceedsLimitErrorDisplayed();
}
@Then("validation messages are displayed for all required fields")
public void validation_messages_are_displayed_for_all_required_fields() {
openCreateNewJobOpeningForPage.areAllRequiredFieldValidationMessagesDisplayed();
}

@Given("the job opening is created with the optional fields left empty")
public void the_job_opening_is_created_with_optional_fields_left_empty() {
jobOpeningPage.createJobOpeningWithOptionalFieldsEmpty();
}
@When("I enter {string}")
public void i_enter_string(String input) {
jobOpeningPage.enterJobTitle(input);
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@Then("the save button should be disabled")
public void the_save_button_should_be_disabled() {
jobOpeningPage.isSaveButtonDisabled();
}
@When("I enter {string} in the requirements field")
public void i_enter_string_in_requirements_field(String requirements) {
jobOpeningPage.enterRequirements(requirements);
}
@When("I leave the salary field empty")
public void i_leave_the_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@When("I leave the job description field empty")
public void i_leave_the_job_description_field_empty() {
jobOpeningPage.leaveJobDescriptionFieldEmpty();
}
@When("I fill in the description with {string}")
public void i_fill_in_the_description_with_string(String description) {
jobOpeningPage.fillInJobDescription(description);
}
@When("I fill in the job requirements with {string}")
public void i_fill_in_the_job_requirements_with_string(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Then("the job opening is created with the special characters in the title")
public void the_job_opening_is_created_with_special_characters_in_title() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInTitle();
}
@Then("the job title field retains the entered value")
public void the_job_title_field_retains_the_entered_value() {
jobOpeningPage.isJobTitleFieldRetained();
}
@When("I leave the location field empty")
public void i_leave_the_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@Then("the save button should remain disabled")
public void the_save_button_should_remain_disabled() {
jobOpeningPage.isSaveButtonDisabled();
}
@Then("the job opening is created with numeric values in the requirements")
public void the_job_opening_is_created_with_numeric_values_in_requirements() {
jobOpeningPage.isJobOpeningCreatedWithNumericRequirements();
}
@When("the user fills in the job description {string}")
public void the_user_fills_in_the_job_description(String description) {
jobOpeningPage.fillInJobDescription(description);
}
@Then("the job opening should be created with the job title trimmed of whitespace")
public void the_job_opening_should_be_created_with_job_title_trimmed_of_whitespace() {
jobOpeningPage.isJobTitleTrimmed();
}
@When("I enter the job title {string}")
public void i_enter_the_job_title(String title) {
jobOpeningPage.enterJobTitle(title);
}
@Then("the job opening is created with special characters in the description")
public void the_job_opening_is_created_with_special_characters_in_description() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@When("the user enters job requirements that meet the maximum character limit")
public void the_user_enters_job_requirements_meeting_maximum_character_limit() {
jobOpeningPage.enterJobRequirementsAtMaxLimit();
}
@Then("the form should save successfully without any validation errors")
public void the_form_should_save_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@When("the user fills in the job title with {string}")
public void the_user_fills_in_the_job_title_with_string(String title) {
jobOpeningPage.fillInJobTitle(title);
}
@When("I enter a job description that exceeds the maximum character limit")
public void i_enter_a_job_description_exceeding_maximum_character_limit() {
jobOpeningPage.enterJobDescriptionExceedingMaxLimit();
}
@When("the user fills in the requirements {string}")
public void the_user_fills_in_the_requirements(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@When("I fill in the job description with {string}")
public void i_fill_in_the_job_description_with_string(String description) {
jobOpeningPage.fillInJobDescription(description);
}
@When("I enter the requirements {string}")
public void i_enter_the_requirements(String requirements) {
jobOpeningPage.enterRequirements(requirements);
}
@When("I fill in the job title with {string}")
public void i_fill_in_the_job_title_with_string(String title) {
jobOpeningPage.fillInJobTitle(title);
}
@When("the user enters a job description that meets the maximum character limit")
public void the_user_enters_a_job_description_meeting_maximum_character_limit() {
jobOpeningPage.enterJobDescriptionAtMaxLimit();
}
@Then("the cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@Then("the job opening is created with the email format included in the description")
public void the_job_opening_is_created_with_email_format_in_description() {
jobOpeningPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
@When("the user leaves all fields empty")
public void the_user_leaves_all_fields_empty() {
jobOpeningPage.leaveAllFieldsEmpty();
}
@Then("the job opening is created with all job requirements listed")
public void the_job_opening_is_created_with_all_job_requirements_listed() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirementsListed();
}
@When("I clickElement the save button")
public void i_click_the_save_button() {
jobOpeningPage.clickSaveButton();
}
@Then("the job opening is created with the html tags rendered correctly")
public void the_job_opening_is_created_with_html_tags_rendered_correctly() {
jobOpeningPage.isHtmlTagsRenderedCorrectly();
}
@Then("the job opening should be created with all fields populated to their maximum limits")
public void the_job_opening_should_be_created_with_all_fields_populated_to_maximum_limits() {
jobOpeningPage.isJobOpeningCreatedWithAllFieldsAtMaxLimit();
}
@When("the user fills in the job description with {string}")
public void the_user_fills_in_the_job_description_with_string(String description) {
jobOpeningPage.fillInJobDescription(description);
}
@When("the user fills in the job requirements {string}")
public void the_user_fills_in_the_job_requirements_string(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_empty_job_description_field() {
jobOpeningPage.isValidationMessageDisplayedForEmptyJobDescription();
}
@Then("the job requirements field retains the entered value")
public void the_job_requirements_field_retains_the_entered_value() {
jobOpeningPage.isRequirementsFieldRetained();
}
}