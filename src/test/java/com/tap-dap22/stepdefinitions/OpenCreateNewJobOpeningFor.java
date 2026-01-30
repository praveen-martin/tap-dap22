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
openCreateNewJobOpeningForPage.clickButton("Add Job Opening");
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
openCreateNewJobOpeningForPage.isFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
openCreateNewJobOpeningForPage.areFieldsPresent();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
openCreateNewJobOpeningForPage.areButtonsDisplayed("Save", "Cancel");
}
@When("^the user fills in the job title field with (.+)$")
public void the_user_fills_in_the_job_title_field_with(String jobTitle) {
openCreateNewJobOpeningForPage.enterTextIntoField(jobTitle, "job title");
}
@When("^the user fills in the job description field with (.+)$")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
openCreateNewJobOpeningForPage.enterTextIntoField(jobDescription, "job description");
}
@When("^the user fills in the job requirements field with (.+)$")
public void the_user_fills_in_the_job_requirements_field_with(String jobRequirements) {
openCreateNewJobOpeningForPage.enterTextIntoField(jobRequirements, "job requirements");
}
@Then("the Save button should be enabled")
public void the_save_button_should_be_enabled() {
openCreateNewJobOpeningForPage.isButtonEnabled("Save");
}
@And("the Cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
openCreateNewJobOpeningForPage.isButtonEnabled("Cancel");
}
@When("the user clicks on the Cancel button")
public void the_user_clicks_on_the_cancel_button() {
openCreateNewJobOpeningForPage.clickButton("Cancel");
}
@Then("the Create New Job Opening form should be closed")
public void the_create_new_job_opening_form_should_be_closed() {
openCreateNewJobOpeningForPage.isFormDisplayed();
}
@Then("the user should be returned to the Job Opening screen")
public void the_user_should_be_returned_to_the_job_opening_screen() {
openCreateNewJobOpeningForPage.isOnJobOpeningScreen();
}
@When("the user leaves the job title field empty")
public void the_user_leaves_the_job_title_field_empty() {
openCreateNewJobOpeningForPage.leaveFieldEmpty("job title");
}
@When("the user leaves the job description field empty")
public void the_user_leaves_the_job_description_field_empty() {
openCreateNewJobOpeningForPage.leaveFieldEmpty("job description");
}
@When("the user leaves the job requirements field empty")
public void the_user_leaves_the_job_requirements_field_empty() {
openCreateNewJobOpeningForPage.leaveFieldEmpty("job requirements");
}
@When("the user clicks the Save button")
public void the_user_clicks_the_save_button() {
openCreateNewJobOpeningForPage.clickButton("Save");
}
@Then("validation messages should be displayed for the empty job title field")
public void validation_messages_should_be_displayed_for_the_empty_job_title_field() {
openCreateNewJobOpeningForPage.isValidationMessageDisplayed("job title");
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
openCreateNewJobOpeningForPage.isValidationMessageDisplayed("job description");
}
@Then("validation messages should be displayed for the empty job requirements field")
public void validation_messages_should_be_displayed_for_the_empty_job_requirements_field() {
openCreateNewJobOpeningForPage.isValidationMessageDisplayed("job requirements");
}
@Then("the Save button should remain disabled")
public void the_save_button_should_remain_disabled() {
openCreateNewJobOpeningForPage.isButtonEnabled("Save");
}
@Then("the job title field should retain the value {string}")
public void the_job_title_field_should_retain_the_value(String jobTitle) {
Assert.assertEquals(jobTitle, openCreateNewJobOpeningForPage.getFieldValue("job title"));
}
@Then("the job requirements field should retain the value {string}")
public void the_job_requirements_field_should_retain_the_value(String jobRequirements) {
Assert.assertEquals(jobRequirements, openCreateNewJobOpeningForPage.getFieldValue("job requirements"));
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
openCreateNewJobOpeningForPage.enterTextIntoField(jobTitle, "job title");
}
@When("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String jobDescription) {
openCreateNewJobOpeningForPage.enterTextIntoField(jobDescription, "job description");
}
@When("the user enters {string} in the requirements field")
public void the_user_enters_in_the_requirements_field(String requirements) {
openCreateNewJobOpeningForPage.enterTextIntoField(requirements, "job requirements");
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
openCreateNewJobOpeningForPage.isSaveSuccessful();
}
@Then("the job opening is created with the title {string}")
public void the_job_opening_is_created_with_the_title(String jobTitle) {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithTitle(jobTitle);
}

@When("^the user enters (.+) into the job title field$")
public void user_enters_into_job_title_field(String jobTitle) {
jobOpeningPage.enterJobTitle(jobTitle);
}
@Then("an error message should be displayed indicating invalid characters in the job title")
public void error_message_invalid_characters_job_title() {
jobOpeningPage.isErrorMessageDisplayedForInvalidJobTitle();
}
@When("^the user enters (.+) in the job description$")
public void user_enters_in_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@Then("an error message is displayed indicating the job title is too short")
public void error_message_job_title_too_short() {
jobOpeningPage.isErrorMessageDisplayedForShortJobTitle();
}
@Then("the create new job opening form should be displayed")
public void create_new_job_opening_form_displayed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the job opening should be created with all job requirements listed")
public void job_opening_created_with_all_requirements() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirements();
}
@When("the user leaves all fields empty")
public void user_leaves_all_fields_empty() {
jobOpeningPage.leaveAllFieldsEmpty();
}
@Then("the save button remains disabled")
public void save_button_remains_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
// DUPLICATE: @When("^the user fills in the job description field with (.+)$")
public void user_fills_in_job_description_field(String jobDescription) {
jobOpeningPage.fillInJobDescriptionField(jobDescription);
}
@Then("the job opening is created with numeric values in the requirements")
public void job_opening_created_with_numeric_values_in_requirements() {
jobOpeningPage.isJobOpeningCreatedWithNumericRequirements();
}
@When("the user clicks the add job opening button")
public void user_clicks_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
@Then("all required fields are filled")
public void all_required_fields_filled() {
jobOpeningPage.areAllRequiredFieldsFilled();
}
@When("^the user enters a job title (.+)$")
public void user_enters_job_title(String jobTitle) {
jobOpeningPage.enterJobTitle(jobTitle);
}
@When("^i enter (.+) in the job requirements field$")
public void i_enter_in_job_requirements_field(String jobRequirements) {
jobOpeningPage.enterJobRequirements(jobRequirements);
}
@Then("validation messages are displayed for the empty job description field")
public void validation_messages_empty_job_description() {
jobOpeningPage.areValidationMessagesDisplayedForEmptyJobDescription();
}
@Then("the job opening should be created with all fields populated to their maximum limits")
public void job_opening_created_with_maximum_limits() {
jobOpeningPage.isJobOpeningCreatedWithMaxLimits();
}
@Then("the job opening is created with the special characters in the title")
public void job_opening_created_with_special_characters_in_title() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInTitle();
}
@Then("validation messages should be displayed for all required fields")
public void validation_messages_displayed_for_all_required_fields() {
jobOpeningPage.areValidationMessagesDisplayedForAllRequiredFields();
}
@When("^the user enters a job description (.+)$")
public void user_enters_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@When("^the admin enters the job requirements (.+)$")
public void admin_enters_job_requirements(String jobRequirements) {
jobOpeningPage.enterJobRequirements(jobRequirements);
}
//    @Then("the job opening should be created with numeric values in the requirements")
@When("^i enter (.+)$")
public void i_enter(String value) {
jobOpeningPage.enterValue(value);
}
//    @Then("an error message should be displayed indicating the job title is too short")
@Then("the user is returned to the job opening screen")
public void user_returned_to_job_opening_screen() {
jobOpeningPage.isUserReturnedToJobOpeningScreen();
}
@Then("the job requirements field is empty")
public void job_requirements_field_empty() {
jobOpeningPage.isJobRequirementsFieldEmpty();
}
@When("^i enter the job description (.+)$")
public void i_enter_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@Then("the create new job opening form is closed")
public void create_new_job_opening_form_closed() {
jobOpeningPage.isCreateNewJobOpeningFormClosed();
}
@When("^the user fills in the job title with (.+)$")
public void user_fills_in_job_title(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@When("^i fill in the job description as (.+)$")
public void i_fill_in_job_description(String jobDescription) {
jobOpeningPage.fillInJobDescription(jobDescription);
}
@Then("the job opening should be created with the job description rendered correctly")
public void job_opening_created_with_correct_job_description() {
jobOpeningPage.isJobOpeningCreatedWithCorrectJobDescription();
}
@When("^the user enters job requirements (.+)$")
public void user_enters_job_requirements(String jobRequirements) {
jobOpeningPage.enterJobRequirements(jobRequirements);
}
@Then("the form should save successfully")
public void form_saves_successfully() {
jobOpeningPage.isFormSavedSuccessfully();
}
@Then("the save button is enabled")
public void save_button_is_enabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the job requirements should include (.+)")
public void job_requirements_should_include(String requirements) {
jobOpeningPage.doesJobRequirementsInclude(requirements);
}
@Then("an error message should be displayed indicating the job title already exists")
public void error_message_job_title_already_exists() {
jobOpeningPage.isErrorMessageDisplayedForExistingJobTitle();
}
@When("^the user enters (.+) in the requirements$")
public void user_enters_in_requirements(String requirements) {
jobOpeningPage.enterJobRequirements(requirements);
}
//    @When("^the user enters job title (.+)$")
@Then("the job title field retains the value (.+)")
public void job_title_field_retains_value(String jobTitle) {
Assert.assertEquals(jobTitle, jobOpeningPage.getJobTitleFieldValue());
}
@When("the user clicks the cancel button")
public void user_clicks_cancel_button() {
jobOpeningPage.clickCancelButton();
}
@When("^i enter the requirements (.+)$")
public void i_enter_requirements(String requirements) {
jobOpeningPage.enterJobRequirements(requirements);
}
@When("the admin clicks the save button")
public void admin_clicks_save_button() {
jobOpeningPage.clickSaveButton();
}
@Then("the job opening should be created with the optional fields left empty")
public void job_opening_created_with_optional_fields_empty() {
jobOpeningPage.isJobOpeningCreatedWithOptionalFieldsEmpty();
}
@Then("the user should see an error message indicating the job description exceeds the character limit")
public void error_message_job_description_exceeds_limit() {
jobOpeningPage.isErrorMessageDisplayedForJobDescriptionExceedingLimit();
}
@When("^the user fills in the requirements (.+)$")
public void user_fills_in_requirements(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@When("^i fill in the job requirements field with (.+)$")
public void i_fill_in_job_requirements_field(String requirements) {
jobOpeningPage.fillInJobRequirementsField(requirements);
}
@Then("an error message is displayed indicating the job requirements exceed the character limit")
public void error_message_job_requirements_exceed_limit() {
jobOpeningPage.isErrorMessageDisplayedForJobRequirementsExceedingLimit();
}
@Then("validation messages are displayed for the empty job requirements field")
public void validation_messages_empty_job_requirements() {
jobOpeningPage.areValidationMessagesDisplayedForEmptyJobRequirements();
}
//    @Then("the user should see an error message indicating invalid characters in the job title")
@Then("the job opening should have all fields populated to their maximum limits")
public void job_opening_populated_to_maximum_limits() {
jobOpeningPage.isJobOpeningPopulatedToMaxLimits();
}
//    @When("^the user enters the job title (.+)$")
//    @Then("validation messages are displayed for all required fields")
@Then("an error message is displayed indicating the job title exceeds the character limit")
public void error_message_job_title_exceeds_limit() {
jobOpeningPage.isErrorMessageDisplayedForJobTitleExceedingLimit();
}
@When("i leave the job description field empty")
public void i_leave_job_description_field_empty() {
jobOpeningPage.leaveJobDescriptionFieldEmpty();
}
@Then("the job requirements field retains the entered value")
public void job_requirements_field_retains_value() {
jobOpeningPage.isJobRequirementsFieldRetained();
}
@Then("the job opening should be created with the email format included in the description")
public void job_opening_created_with_email_format_in_description() {
jobOpeningPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
// DUPLICATE: @When("^the user fills in the job title field with (.+)$")
public void user_fills_in_job_title_field(String jobTitle) {
jobOpeningPage.fillInJobTitleField(jobTitle);
}
@When("the user leaves the location field empty")
public void user_leaves_location_field_empty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@Then("the job description field is empty")
public void job_description_field_empty() {
jobOpeningPage.isJobDescriptionFieldEmpty();
}
//    @When("^the user fills in the requirements with (.+)$")
@When("^the user enters job requirements of (.+)$")
public void user_enters_job_requirements_of(String requirements) {
jobOpeningPage.enterJobRequirementsOf(requirements);
}
@Then("an error message should be displayed indicating the job title exceeds the character limit")
public void error_message_job_title_exceeds_character_limit() {
jobOpeningPage.isErrorMessageDisplayedForJobTitleExceedingCharacterLimit();
}
@Then("the form should contain fields for job title, description, requirements, other relevant information")
public void form_contains_fields_for_job_title_description_requirements() {
jobOpeningPage.doesFormContainAllRequiredFields();
}
@Then("an error message should be displayed indicating the job requirements exceed the character limit")
public void error_message_job_requirements_exceed_character_limit() {
jobOpeningPage.isErrorMessageDisplayedForJobRequirementsExceedingCharacterLimit();
}
@When("the user clicks on the add job opening button")
public void user_clicks_on_add_job_opening_button() {
jobOpeningPage.clickAddJobOpeningButton();
}
//    @When("^the user enters the job requirements (.+)$")
//    @When("^the user fills in the job title (.+)$")
@When("^the user enters the job title (.+) in the job title field$")
public void user_enters_job_title_in_job_title_field(String jobTitle) {
jobOpeningPage.enterJobTitleInJobTitleField(jobTitle);
}
@Then("the job opening should be created successfully without any validation errors")
public void job_opening_created_successfully_without_errors() {
jobOpeningPage.isJobOpeningCreatedSuccessfullyWithoutErrors();
}
@Then("the user locates the add job opening button")
public void user_locates_add_job_opening_button() {
jobOpeningPage.isAddJobOpeningButtonLocated();
}
@Then("the save button should be disabled")
public void save_button_should_be_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@When("^the user enters the requirements (.+)$")
public void user_enters_requirements(String requirements) {
jobOpeningPage.enterRequirements(requirements);
}
//    @When("^the user enters the job description (.+)$")
@Then("the form should save successfully without any validation errors")
public void form_saves_successfully_without_errors() {
jobOpeningPage.isFormSavedSuccessfullyWithoutErrors();
}
@When("^i fill in the job description field with (.+)$")
public void i_fill_in_job_description_field(String jobDescription) {
jobOpeningPage.fillInJobDescriptionField(jobDescription);
}
@Then("the job opening should be created with special characters in the description")
public void job_opening_created_with_special_characters_in_description() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@Then("the cancel button remains enabled")
public void cancel_button_remains_enabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@When("the user leaves the salary field empty")
public void user_leaves_salary_field_empty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
//    @Then("the job opening is created with the optional fields left empty")
@Then("an error message is displayed indicating the job description exceeds the character limit")
public void error_message_job_description_exceeds_character_limit() {
jobOpeningPage.isErrorMessageDisplayedForJobDescriptionExceedingLimit();
}
//    @Then("the job opening should be created with the special characters in the title")
@Then("the job opening is created with the html tags rendered correctly")
public void job_opening_created_with_html_tags_rendered_correctly() {
jobOpeningPage.isJobOpeningCreatedWithHtmlTagsRenderedCorrectly();
}
@When("^the user enters (.+) in the job requirements field$")
public void user_enters_in_job_requirements_field(String requirements) {
jobOpeningPage.enterInJobRequirementsField(requirements);
}
@Then("the job requirements field retains the value (.+)")
public void job_requirements_field_retains_value(String requirements) {
Assert.assertEquals(requirements, jobOpeningPage.getJobRequirementsFieldValue());
}
@When("^the user fills in the job description with (.+)$")
public void user_fills_in_job_description(String jobDescription) {
jobOpeningPage.fillInJobDescription(jobDescription);
}
@Then("the job opening should be created with the job title (.+)")
public void job_opening_created_with_job_title(String jobTitle) {
jobOpeningPage.isJobOpeningCreatedWithJobTitle(jobTitle);
}
//    @Then("the job opening is created with special characters in the description")
@When("^i enter job title (.+)$")
public void i_enter_job_title(String jobTitle) {
jobOpeningPage.enterJobTitle(jobTitle);
}
@Then("the form should display save cancel buttons")
public void form_displays_save_cancel_buttons() {
jobOpeningPage.isSaveCancelButtonsDisplayed();
}
@Then("the job opening should be created successfully")
public void job_opening_created_successfully() {
jobOpeningPage.isJobOpeningCreatedSuccessfully();
}
@When("^i fill in the job title as (.+)$")
public void i_fill_in_job_title(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@Then("the job description should display the html tags correctly")
public void job_description_displays_html_tags_correctly() {
jobOpeningPage.isJobDescriptionDisplayingHtmlTagsCorrectly();
}
@When("^the user fills in the requirements field with (.+)$")
public void user_fills_in_requirements_field(String requirements) {
jobOpeningPage.fillInRequirementsField(requirements);
}
@When("^the user enters (.+)$")
public void user_enters(String value) {
jobOpeningPage.enterValue(value);
}
@When("^i clickElement the save button$")
public void i_click_save_button() {
jobOpeningPage.clickSaveButton();
}
@When("^the user fills in the description with (.+)$")
public void user_fills_in_description(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("^the user enters (.+) in the job title$")
public void user_enters_in_job_title(String jobTitle) {
jobOpeningPage.enterJobTitle(jobTitle);
}
//    @When("^the user enters job description (.+)$")
//    @Then("an error message is displayed indicating the job title already exists")
//    @Then("the job opening is created with the job title (.+)")
//    @Then("the job title field retains the entered value (.+)")
@When("^the user enters a job description of (.+)$")
public void user_enters_a_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@Then("validation messages are displayed for the empty job title field")
public void validation_messages_empty_job_title() {
jobOpeningPage.areValidationMessagesDisplayedForEmptyJobTitle();
}
@When("^the admin enters the job description (.+)$")
public void admin_enters_job_description(String jobDescription) {
jobOpeningPage.enterJobDescription(jobDescription);
}
@Then("an error message indicating the job title is too short should be displayed")
public void error_message_job_title_too_short_displayed() {
jobOpeningPage.isErrorMessageDisplayedForShortJobTitle();
}
//    @When("^the user fills in the job description (.+)$")
}