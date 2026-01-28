package com.tap-dap22.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-dap22.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the user is on the Dashboard")
public void the_user_is_on_the_dashboard() {
createJobOpeningPage.navigateToDashboard();
}
@When("I click on the {string} option in the side navigation")
public void i_click_on_the_option_in_the_side_navigation(String option) {
createJobOpeningPage.clickOnSideNavigationOption(option);
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String button) {
createJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the Save and Cancel buttons should be displayed")
public void the_save_and_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveAndCancelButtonsDisplayed();
}
@When("the user selects a Job Role {string}")
public void the_user_selects_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the user selects a Location {string}")
public void the_user_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the user enters Minimum Experience {string}")
public void the_user_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("the user enters Maximum Experience {string}")
public void the_user_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@When("the user enters Qualification {string}")
public void the_user_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the user enters Short Job Description {string}")
public void the_user_enters_short_job_description(String shortDescription) {
createJobOpeningPage.enterShortJobDescription(shortDescription);
}
@When("the user enters Responsibilities {string}")
public void the_user_enters_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@When("the user enters valid Primary Skills {string}")
public void the_user_enters_valid_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@When("the user enters valid Secondary Skills {string}")
public void the_user_enters_valid_secondary_skills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@When("the user clicks on {string}")
public void the_user_clicks_on(String action) {
createJobOpeningPage.clickOnAction(action);
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@Then("the job opening should be available in the Job Opening list with the correct tags")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_tags() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectTags();
}
@Then("the job opening should be available in the Job Opening list with the correct vendor")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_vendor() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectVendor();
}
@Then("the job opening should be available in the Job Opening list with the correct work mode")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_work_mode() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectWorkMode();
}
@Then("the job opening should be available in the Job Opening list with the correct department")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_department() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectDepartment();
}
@Then("the job opening should be available in the Job Opening list with the correct industry type")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_industry_type() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectIndustryType();
}
@Then("the job opening should be available in the Job Opening list with the correct skills")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_skills() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectSkills();
}

@When("the recruiter clicks on save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clickSaveButton();
}
@When("the user enters qualification {string}")
public void the_user_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the user enters valid primary skills")
public void the_user_enters_valid_primary_skills() {
createJobOpeningPage.enterValidPrimarySkills();
}
@When("i enter qualification {string}")
public void i_enter_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("i select a location {string}")
public void i_select_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the user clicks on save")
public void the_user_clicks_on_save() {
createJobOpeningPage.clickSaveButton();
}
@When("i clickElement on the job opening option in the side navigation")
public void i_click_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickJobOpeningOption();
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("the recruiter enters minimum experience {string}")
public void the_recruiter_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("the recruiter selects a vendor {string}")
public void the_recruiter_selects_a_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@When("the user selects a location")
public void the_user_selects_a_location() {
createJobOpeningPage.selectLocation();
}
@When("the recruiter selects the job role {string}")
public void the_recruiter_selects_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the recruiter enters the tags {string}")
public void the_recruiter_enters_the_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@When("the recruiter selects a location {string}")
public void the_recruiter_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the user enters valid secondary skills")
public void the_user_enters_valid_secondary_skills() {
createJobOpeningPage.enterValidSecondarySkills();
}
@When("i enter maximum experience {string}")
public void i_enter_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@When("the recruiter leaves maximum experience blank")
public void the_recruiter_leaves_maximum_experience_blank() {
createJobOpeningPage.leaveMaximumExperienceBlank();
}
@When("i select a job role {string}")
public void i_select_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("i clickElement on save")
public void i_click_on_save() {
createJobOpeningPage.clickSaveButton();
}
@When("the user enters minimum experience")
public void the_user_enters_minimum_experience() {
createJobOpeningPage.enterMinimumExperience();
}
@When("the recruiter enters the minimum experience {string}")
public void the_recruiter_enters_the_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("the recruiter enters the maximum experience {string}")
public void the_recruiter_enters_the_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@When("the user enters maximum experience")
public void the_user_enters_maximum_experience() {
createJobOpeningPage.enterMaximumExperience();
}
@When("the recruiter leaves responsibilities blank")
public void the_recruiter_leaves_responsibilities_blank() {
createJobOpeningPage.leaveResponsibilitiesBlank();
}
@When("the user enters a valid industry type {string}")
public void the_user_enters_a_valid_industry_type(String industryType) {
createJobOpeningPage.enterValidIndustryType(industryType);
}
@When("the recruiter selects a valid work mode {string}")
public void the_recruiter_selects_a_valid_work_mode(String workMode) {
createJobOpeningPage.selectValidWorkMode(workMode);
}
}