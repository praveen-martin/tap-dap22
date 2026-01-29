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
@And("I click on the Add Job Opening button")
public void i_click_on_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.clickAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
"Create New Job Opening form should be displayed", openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
"Form should contain all required fields", openCreateNewJobOpeningForPage.areFormFieldsPresent();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
"Form should display Save and Cancel buttons", openCreateNewJobOpeningForPage.areSaveAndCancelButtonsDisplayed();
}
@When("I fill in the job title field with {string}")
public void i_fill_in_the_job_title_field_with(String jobTitle) {
openCreateNewJobOpeningForPage.fillJobTitleField(jobTitle);
}
@And("I fill in the job description field with {string}")
public void i_fill_in_the_job_description_field_with(String jobDescription) {
openCreateNewJobOpeningForPage.fillJobDescriptionField(jobDescription);
}
@And("I fill in the job requirements field with {string}")
public void i_fill_in_the_job_requirements_field_with(String jobRequirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(jobRequirements);
}
@And("I ensure all required fields are filled")
public void i_ensure_all_required_fields_are_filled() {
"All required fields should be filled", openCreateNewJobOpeningForPage.areRequiredFieldsFilled();
}
@Then("the Save button is enabled")
public void the_save_button_is_enabled() {
"Save button should be enabled", openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@And("the Cancel button remains enabled")
public void the_cancel_button_remains_enabled() {
"Cancel button should remain enabled", openCreateNewJobOpeningForPage.isCancelButtonEnabled();
}
@When("I click on the Cancel button in the Create New Job Opening form")
public void i_click_on_the_cancel_button_in_the_create_new_job_opening_form() {
openCreateNewJobOpeningForPage.clickCancelButton();
}
@Then("the Create New Job Opening form is closed")
public void the_create_new_job_opening_form_is_closed() {
"Create New Job Opening form should be closed", openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the user is returned to the Job Opening screen")
public void the_user_is_returned_to_the_job_opening_screen() {
"User should be returned to Job Opening screen", openCreateNewJobOpeningForPage.isOnJobOpeningScreen();
}
@Given("the job title field is empty")
public void the_job_title_field_is_empty() {
"Job title field should be empty", openCreateNewJobOpeningForPage.isJobTitleFieldEmpty();
}
@And("the job description field is empty")
public void the_job_description_field_is_empty() {
"Job description field should be empty", openCreateNewJobOpeningForPage.isJobDescriptionFieldEmpty();
}
@And("the job requirements field is empty")
public void the_job_requirements_field_is_empty() {
"Job requirements field should be empty", openCreateNewJobOpeningForPage.isJobRequirementsFieldEmpty();
}
@When("the user clicks the Save button")
public void the_user_clicks_the_save_button() {
openCreateNewJobOpeningForPage.clickSaveButton();
}
@Then("validation messages are displayed for the empty job title field")
public void validation_messages_are_displayed_for_the_empty_job_title_field() {
"Validation message should be displayed for empty job title", openCreateNewJobOpeningForPage.isValidationMessageDisplayedForJobTitle();
}
@And("validation messages are displayed for the empty job description field")
public void validation_messages_are_displayed_for_the_empty_job_description_field() {
"Validation message should be displayed for empty job description", openCreateNewJobOpeningForPage.isValidationMessageDisplayedForJobDescription();
}
@And("validation messages are displayed for the empty job requirements field")
public void validation_messages_are_displayed_for_the_empty_job_requirements_field() {
"Validation message should be displayed for empty job requirements", openCreateNewJobOpeningForPage.isValidationMessageDisplayedForJobRequirements();
}
@And("the Save button remains disabled")
public void the_save_button_remains_disabled() {
"Save button should remain disabled", openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@When("I enter {string} in the job title field")
public void i_enter_in_the_job_title_field(String jobTitle) {
openCreateNewJobOpeningForPage.fillJobTitleField(jobTitle);
}
@And("I enter {string} in the job description field")
public void i_enter_in_the_job_description_field(String jobDescription) {
openCreateNewJobOpeningForPage.fillJobDescriptionField(jobDescription);
}
@And("I enter {string} in the requirements field")
public void i_enter_in_the_requirements_field(String requirements) {
openCreateNewJobOpeningForPage.fillJobRequirementsField(requirements);
}
@Then("an error message is displayed indicating the job title is too short")
public void an_error_message_is_displayed_indicating_the_job_title_is_too_short() {
"Error message should indicate job title is too short", openCreateNewJobOpeningForPage.isErrorMessageDisplayedForShortJobTitle();
}
@Then("an error message is displayed indicating the job description exceeds the character limit")
public void an_error_message_is_displayed_indicating_the_job_description_exceeds_the_character_limit() {
"Error message should indicate job description exceeds character limit", openCreateNewJobOpeningForPage.isErrorMessageDisplayedForLongJobDescription();
}
@Then("an error message is displayed indicating the job title already exists")
public void an_error_message_is_displayed_indicating_the_job_title_already_exists() {
"Error message should indicate job title already exists", openCreateNewJobOpeningForPage.isErrorMessageDisplayedForDuplicateJobTitle();
}
@Then("an error message is displayed indicating invalid characters in the job title")
public void an_error_message_is_displayed_indicating_invalid_characters_in_the_job_title() {
"Error message should indicate invalid characters in job title", openCreateNewJobOpeningForPage.isErrorMessageDisplayedForInvalidJobTitle();
}
@Then("an error message is displayed indicating the job title exceeds the character limit")
public void an_error_message_is_displayed_indicating_the_job_title_exceeds_the_character_limit() {
"Error message should indicate job title exceeds character limit", openCreateNewJobOpeningForPage.isErrorMessageDisplayedForLongJobTitle();
}
@Then("an error message should be displayed indicating the job requirements exceed the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_requirements_exceed_the_character_limit() {
"Error message should indicate job requirements exceed character limit", openCreateNewJobOpeningForPage.isErrorMessageDisplayedForLongJobRequirements();
}

@Given("the job opening is created with all job requirements listed")
public void the_job_opening_is_created_with_all_job_requirements_listed() {
jobOpeningPage.createJobOpeningWithAllRequirements();
}
@Then("validation messages are displayed for all required fields")
public void validation_messages_are_displayed_for_all_required_fields() {
jobOpeningPage.areValidationMessagesDisplayed();
}
@When("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@Then("the job opening is created with numeric values in the requirements")
public void the_job_opening_is_created_with_numeric_values_in_the_requirements() {
jobOpeningPage.isJobOpeningCreatedWithNumericRequirements();
}
@When("the user leaves all fields empty")
public void the_user_leaves_all_fields_empty() {
jobOpeningPage.leaveAllFieldsEmpty();
}
@Then("the job opening is created with the email format included in the description")
public void the_job_opening_is_created_with_the_email_format_included_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
@When("i fill in the requirements with {string}")
public void i_fill_in_the_requirements_with(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@Then("the job opening is created with all fields populated to their maximum limits")
public void the_job_opening_is_created_with_all_fields_populated_to_their_maximum_limits() {
jobOpeningPage.isJobOpeningCreatedWithMaxLimits();
}
@When("i clickElement the save button")
public void i_click_the_save_button() {
jobOpeningPage.clickSaveButton();
}
@When("the user fills in the job description {string}")
public void the_user_fills_in_the_job_description(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@Then("i enter a job description that exceeds the maximum character limit")
public void i_enter_a_job_description_that_exceeds_the_maximum_character_limit() {
jobOpeningPage.isJobDescriptionExceedingLimit();
}
@When("i leave the job requirements field empty")
public void i_leave_the_job_requirements_field_empty() {
jobOpeningPage.leaveJobRequirementsFieldEmpty();
}
@When("i enter {string}")
public void i_enter(String value) {
jobOpeningPage.enterValue(value);
}
@When("i enter the job title {string}")
public void i_enter_the_job_title(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("the admin fills in the job title with {string}")
public void the_admin_fills_in_the_job_title_with(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@Then("the job opening is created with the optional fields left empty")
public void the_job_opening_is_created_with_the_optional_fields_left_empty() {
jobOpeningPage.isJobOpeningCreatedWithOptionalFieldsEmpty();
}
@When("the user fills in the job description with {string}")
public void the_user_fills_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@When("the job requirements field is filled with {string}")
public void the_job_requirements_field_is_filled_with(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@When("i leave the salary field empty")
public void i_leave_the_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@When("the job description field is filled with {string}")
public void the_job_description_field_is_filled_with(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@When("i fill in the description with {string}")
public void i_fill_in_the_description_with(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
@When("the user leaves the location field empty")
public void the_user_leaves_the_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@When("the user enters {string} in the job requirements field")
public void the_user_enters_in_the_job_requirements_field(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@When("the admin clicks the save button")
public void the_admin_clicks_the_save_button() {
jobOpeningPage.clickSaveButton();
}
@Then("the job requirements field retains the entered value")
public void the_job_requirements_field_retains_the_entered_value() {
jobOpeningPage.isJobRequirementsFieldRetained();
}
@Then("the job opening should be created with the job title trimmed of whitespace")
public void the_job_opening_should_be_created_with_the_job_title_trimmed_of_whitespace() {
jobOpeningPage.isJobTitleTrimmed();
}
@Then("an error message should be displayed indicating the job title already exists")
public void an_error_message_should_be_displayed_indicating_the_job_title_already_exists() {
jobOpeningPage.isJobTitleExistsErrorDisplayed();
}
@When("the user fills in the requirements {string}")
public void the_user_fills_in_the_requirements(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@When("i leave the location field empty")
public void i_leave_the_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@When("i enter job title {string}")
public void i_enter_job_title(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@When("the user fills in the job requirements {string}")
public void the_user_fills_in_the_job_requirements(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@When("i enter job description {string}")
public void i_enter_job_description(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@Then("an error message should be displayed indicating the job title exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_title_exceeds_the_character_limit() {
jobOpeningPage.isJobTitleExceedingLimitErrorDisplayed();
}
@Then("the job opening is created with the special characters in the title")
public void the_job_opening_is_created_with_the_special_characters_in_the_title() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInTitle();
}
@When("i fill in the job description with {string}")
public void i_fill_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@Then("the job opening is created with {string} in the title")
public void the_job_opening_is_created_with_in_the_title(String title) {
jobOpeningPage.isJobOpeningCreatedWithTitle(title);
}
@Then("the job title field retains the entered value")
public void the_job_title_field_retains_the_entered_value() {
jobOpeningPage.isJobTitleFieldRetained();
}
@When("i enter {string} in the job requirements field")
public void i_enter_in_the_job_requirements_field(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@Then("the cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@When("i enter the requirements {string}")
public void i_enter_the_requirements(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@When("the user fills in the description with {string}")
public void the_user_fills_in_the_description_with(String description) {
jobOpeningPage.fillInDescription(description);
}
@Then("the save button should remain disabled")
public void the_save_button_should_remain_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the save button is disabled")
public void the_save_button_is_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@When("i fill in the job requirements with {string}")
public void i_fill_in_the_job_requirements_with(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@When("the user locates the add job opening button")
public void the_user_locates_the_add_job_opening_button() {
jobOpeningPage.locateAddJobOpeningButton();
}
@When("the user clicks on the cancel button in the create new job opening form")
public void the_user_clicks_on_the_cancel_button_in_the_create_new_job_opening_form() {
jobOpeningPage.clickCancelButton();
}
@Then("the job opening is created with the html tags rendered correctly")
public void the_job_opening_is_created_with_the_html_tags_rendered_correctly() {
jobOpeningPage.isHtmlTagsRenderedCorrectly();
}
@Then("the job opening is created with special characters in the description")
public void the_job_opening_is_created_with_special_characters_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@When("the user enters a job description that meets the maximum character limit")
public void the_user_enters_a_job_description_that_meets_the_maximum_character_limit() {
jobOpeningPage.fillJobDescriptionAtMaxLimit();
}
@When("i enter the job requirements {string}")
public void i_enter_the_job_requirements(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@Then("the job opening should be created with all fields populated to their maximum limits")
public void the_job_opening_should_be_created_with_all_fields_populated_to_their_maximum_limits() {
jobOpeningPage.isJobOpeningCreatedWithMaxLimits();
}
@When("i fill in the job description with valid data")
public void i_fill_in_the_job_description_with_valid_data() {
jobOpeningPage.fillJobDescriptionWithValidData();
}
@When("the admin fills in the job description with {string}")
public void the_admin_fills_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@Then("the job opening should be created with all job requirements listed")
public void the_job_opening_should_be_created_with_all_job_requirements_listed() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirements();
}
@Then("the save button should be disabled")
public void the_save_button_should_be_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@When("i leave the job description field empty")
public void i_leave_the_job_description_field_empty() {
jobOpeningPage.leaveJobDescriptionFieldEmpty();
}
@When("i fill in the job title with {string}")
public void i_fill_in_the_job_title_with(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user leaves the salary field empty")
public void the_user_leaves_the_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@When("i enter a job title that exceeds the maximum character limit")
public void i_enter_a_job_title_that_exceeds_the_maximum_character_limit() {
jobOpeningPage.isJobTitleExceedingLimit();
}
@When("i fill in the requirements with valid data")
public void i_fill_in_the_requirements_with_valid_data() {
jobOpeningPage.fillInRequirementsWithValidData();
}
@When("i leave the job title field empty")
public void i_leave_the_job_title_field_empty() {
jobOpeningPage.leaveJobTitleFieldEmpty();
}
@When("the user fills in the job title with {string}")
public void the_user_fills_in_the_job_title(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("i enter the job description {string}")
public void i_enter_the_job_description(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@Then("the job opening is created with the job title trimmed of whitespace")
public void the_job_opening_is_created_with_the_job_title_trimmed_of_whitespace() {
jobOpeningPage.isJobTitleTrimmed();
}
@Then("an error message should be displayed indicating the job description exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_description_exceeds_the_character_limit() {
jobOpeningPage.isJobDescriptionExceedingLimitErrorDisplayed();
}
//    @When("the user fills in the job title {string}")
@Then("all fields are left empty")
public void all_fields_are_left_empty() {
jobOpeningPage.areAllFieldsEmpty();
}
@Then("the form should save successfully without any validation errors")
public void the_form_should_save_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@When("the user enters job requirements that meet the maximum character limit")
public void the_user_enters_job_requirements_that_meet_the_maximum_character_limit() {
jobOpeningPage.fillInRequirementsAtMaxLimit();
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
jobOpeningPage.isValidationMessageDisplayedForEmptyJobDescription();
}
}