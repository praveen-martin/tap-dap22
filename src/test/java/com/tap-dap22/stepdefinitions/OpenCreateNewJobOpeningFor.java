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
openCreateNewJobOpeningForPage.fillInJobTitleField(jobTitle);
}
@And("I fill in the job description field with {string}")
public void i_fill_in_the_job_description_field_with(String jobDescription) {
openCreateNewJobOpeningForPage.fillInJobDescriptionField(jobDescription);
}
@And("I fill in the job requirements field with {string}")
public void i_fill_in_the_job_requirements_field_with(String jobRequirements) {
openCreateNewJobOpeningForPage.fillInJobRequirementsField(jobRequirements);
}
@And("I ensure all required fields are filled")
public void i_ensure_all_required_fields_are_filled() {
openCreateNewJobOpeningForPage.ensureAllRequiredFieldsFilled();
}
@Then("the Save button is enabled")
public void the_save_button_is_enabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@And("the Cancel button remains enabled")
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
@And("the user is returned to the Job Opening screen")
public void the_user_is_returned_to_the_job_opening_screen() {
openCreateNewJobOpeningForPage.isOnJobOpeningScreen();
}
@Given("the job title field is empty")
public void the_job_title_field_is_empty() {
openCreateNewJobOpeningForPage.clearJobTitleField();
}
@And("the job description field is empty")
public void the_job_description_field_is_empty() {
openCreateNewJobOpeningForPage.clearJobDescriptionField();
}
@And("the job requirements field is empty")
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
@And("validation messages are displayed for the empty job description field")
public void validation_messages_are_displayed_for_the_empty_job_description_field() {
openCreateNewJobOpeningForPage.isJobDescriptionValidationMessageDisplayed();
}
@And("validation messages are displayed for the empty job requirements field")
public void validation_messages_are_displayed_for_the_empty_job_requirements_field() {
openCreateNewJobOpeningForPage.isJobRequirementsValidationMessageDisplayed();
}
@And("the Save button remains disabled")
public void the_save_button_remains_disabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@When("I enter {string} in the job title field")
public void i_enter_in_the_job_title_field(String jobTitle) {
openCreateNewJobOpeningForPage.fillInJobTitleField(jobTitle);
}
@And("I enter {string} in the job description field")
public void i_enter_in_the_job_description_field(String jobDescription) {
openCreateNewJobOpeningForPage.fillInJobDescriptionField(jobDescription);
}
@And("I enter {string} in the requirements field")
public void i_enter_in_the_requirements_field(String requirements) {
openCreateNewJobOpeningForPage.fillInJobRequirementsField(requirements);
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
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
openCreateNewJobOpeningForPage.isFormSavedSuccessfully();
}
@And("the job opening is created with the special characters in the title")
public void the_job_opening_is_created_with_the_special_characters_in_the_title() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithSpecialCharacters();
}
@And("the job opening is created with numeric values in the requirements")
public void the_job_opening_is_created_with_numeric_values_in_the_requirements() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithNumericValues();
}
@And("the job opening is created with all job requirements listed")
public void the_job_opening_is_created_with_all_job_requirements_listed() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithAllRequirements();
}
@And("the job opening is created with the optional fields left empty")
public void the_job_opening_is_created_with_the_optional_fields_left_empty() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithOptionalFieldsEmpty();
}
@And("the job opening is created with special characters in the description")
public void the_job_opening_is_created_with_special_characters_in_the_description() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@And("the job opening is created with the HTML tags rendered correctly")
public void the_job_opening_is_created_with_the_html_tags_rendered_correctly() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithHTMLTagsRendered();
}
@And("the job opening is created with the email format included in the description")
public void the_job_opening_is_created_with_the_email_format_included_in_the_description() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithEmailFormatInDescription();
}

@Given("the user fills in the requirements {string}")
public void the_user_fills_in_the_requirements(String requirements) {
jobOpeningPage.fillInRequirements(requirements);
}
@Then("the job opening is created with the job title trimmed of whitespace")
public void the_job_opening_is_created_with_the_job_title_trimmed_of_whitespace() {
jobOpeningPage.isJobTitleTrimmed();
}
@Then("the form should save successfully without any validation errors")
public void the_form_should_save_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@Then("the save button should be disabled")
public void the_save_button_should_be_disabled() {
jobOpeningPage.isSaveButtonDisabled();
}
@Given("the user fills in the job title {string}")
public void the_user_fills_in_the_job_title(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@Given("i fill in the description with {string}")
public void i_fill_in_the_description_with(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("the user clicks on the cancel button in the create new job opening form")
public void the_user_clicks_on_the_cancel_button_in_the_create_new_job_opening_form() {
jobOpeningPage.clickCancelButton();
}
@Then("validation messages are displayed for all required fields")
public void validation_messages_are_displayed_for_all_required_fields() {
jobOpeningPage.areValidationMessagesDisplayed();
}
@Then("the cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@Given("the job requirements field is filled with {string}")
public void the_job_requirements_field_is_filled_with(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Given("i fill in the requirements with valid data")
public void i_fill_in_the_requirements_with_valid_data() {
jobOpeningPage.fillInValidRequirements();
}
@Given("the user fills in the job description with {string}")
public void the_user_fills_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillInJobDescription(jobDescription);
}
@Then("the job opening is created with all fields populated to their maximum limits")
public void the_job_opening_is_created_with_all_fields_populated_to_their_maximum_limits() {
jobOpeningPage.isJobOpeningCreatedWithMaxLimits();
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
@Given("i leave the salary field empty")
public void i_leave_the_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@Given("the user enters {string} in the job requirements field")
public void the_user_enters_in_the_job_requirements_field(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Then("the job requirements field retains the entered value")
public void the_job_requirements_field_retains_the_entered_value() {
jobOpeningPage.isJobRequirementsFieldRetained();
}
@Given("the admin fills in the job description with {string}")
public void the_admin_fills_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillInJobDescription(jobDescription);
}
@When("the admin clicks the save button")
public void the_admin_clicks_the_save_button() {
jobOpeningPage.clickSaveButton();
}
@Then("the job opening should be created with all job requirements listed")
public void the_job_opening_should_be_created_with_all_job_requirements_listed() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirements();
}
@Given("i enter {string} in the job requirements field")
public void i_enter_in_the_job_requirements_field(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Then("the job title field retains the entered value")
public void the_job_title_field_retains_the_entered_value() {
jobOpeningPage.isJobTitleFieldRetained();
}
@Given("i leave the location field empty")
public void i_leave_the_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@Given("i fill in the job description with {string}")
public void i_fill_in_the_job_description_with(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("i clickElement the save button")
public void i_click_the_save_button() {
jobOpeningPage.clickSaveButton();
}
@Given("the user enters a job description that meets the maximum character limit")
public void the_user_enters_a_job_description_that_meets_the_maximum_character_limit() {
jobOpeningPage.fillInMaxCharacterLimitDescription();
}
@Given("i leave the job description field empty")
public void i_leave_the_job_description_field_empty() {
jobOpeningPage.leaveJobDescriptionFieldEmpty();
}
@Given("i enter a job title that exceeds the maximum character limit")
public void i_enter_a_job_title_that_exceeds_the_maximum_character_limit() {
jobOpeningPage.fillInExceedingJobTitle();
}
@Then("an error message should be displayed indicating the job description exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_description_exceeds_the_character_limit() {
jobOpeningPage.isJobDescriptionExceedsLimitErrorDisplayed();
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
jobOpeningPage.isEmptyJobDescriptionFieldValidationDisplayed();
}
@Given("i enter a job description that exceeds the maximum character limit")
public void i_enter_a_job_description_that_exceeds_the_maximum_character_limit() {
jobOpeningPage.fillInExceedingJobDescription();
}
@Given("all fields are left empty")
public void all_fields_are_left_empty() {
jobOpeningPage.leaveAllFieldsEmpty();
}
@Given("the user enters job requirements that meet the maximum character limit")
public void the_user_enters_job_requirements_that_meet_the_maximum_character_limit() {
jobOpeningPage.fillInMaxCharacterLimitRequirements();
}
@Given("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String description) {
jobOpeningPage.fillInJobDescription(description);
}
@Then("the job opening is created with {string} in the title")
public void the_job_opening_is_created_with_in_the_title(String jobTitle) {
jobOpeningPage.isJobOpeningCreatedWithTitle(jobTitle);
}
@Given("the user locates the add job opening button")
public void the_user_locates_the_add_job_opening_button() {
jobOpeningPage.locateAddJobOpeningButton();
}
@Given("i fill in the job requirements with {string}")
public void i_fill_in_the_job_requirements_with(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Given("the user leaves all fields empty")
public void the_user_leaves_all_fields_empty() {
jobOpeningPage.leaveAllFieldsEmpty();
}
@Then("the job opening should be created with the job title trimmed of whitespace")
public void the_job_opening_should_be_created_with_the_job_title_trimmed_of_whitespace() {
jobOpeningPage.isJobOpeningCreatedWithTrimmedTitle();
}
@Given("the user leaves the salary field empty")
public void the_user_leaves_the_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@Given("the user leaves the location field empty")
public void the_user_leaves_the_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@Given("i leave the job title field empty")
public void i_leave_the_job_title_field_empty() {
jobOpeningPage.leaveJobTitleFieldEmpty();
}
@Given("the admin fills in the job title with {string}")
public void the_admin_fills_in_the_job_title_with(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@Then("an error message should be displayed indicating the job title already exists")
public void an_error_message_should_be_displayed_indicating_the_job_title_already_exists() {
jobOpeningPage.isJobTitleAlreadyExistsErrorDisplayed();
}
}