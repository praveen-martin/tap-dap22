
@feature_open_create_new_job_opening
Feature: OpenCreateNewJobOpeningFor

Background: 
  Given the user is on the Job Opening screen

@add_job_opening
Scenario Outline: Open Create New Job Opening Form
  When I locate the Add Job Opening button
  And I click on the Add Job Opening button
  Then the Create New Job Opening form is displayed
  And the form contains fields for job title, description, requirements, and other relevant information
  And the form displays Save and Cancel buttons

Examples:
  |   |
  |   |

  @valid_job_opening
  Scenario Outline: Open Create New Job Opening Form
    When I fill in the job title field with "<job_title>"
    And I fill in the job description field with "<job_description>"
    And I fill in the job requirements field with "<job_requirements>"
    And I ensure all required fields are filled
    Then the Save button is enabled
    And the Cancel button remains enabled

    Examples:
      | job_title               | job_description                                                 | job_requirements                                  |
      | Software Engineer       | Responsible for developing and maintaining software applications. | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  @cancel_button_functionality
  Scenario Outline: Open Create New Job Opening Form
    When I click on the Cancel button in the Create New Job Opening form
    Then the Create New Job Opening form is closed
    And the user is returned to the Job Opening screen

    Examples:
      |   |
      |   |

@validation_empty_fields
Scenario Outline: Open Create New Job Opening Form
  Given the job title field is empty
  And the job description field is empty
  And the job requirements field is empty
  When the user clicks the Save button
  Then validation messages are displayed for the empty job title field
  And validation messages are displayed for the empty job description field
  And validation messages are displayed for the empty job requirements field
  And the Save button remains disabled

  Examples:
    | job_title | job_description | job_requirements |
    |           |                  |                   |

  @validation_error_display
  Scenario Outline: Open Create New Job Opening Form
    Given I fill in the job title field with "<job_title>"
    And I leave the job description field empty
    And I fill in the job requirements field with "<job_requirements>"
    When I click the Save button
    Then validation messages should be displayed for the empty job description field
    And the job title field retains the entered value
    And the job requirements field retains the entered value

    Examples:
      | job_title          | job_requirements                                                                  |
      | Software Engineer   | Bachelor's degree in Computer Science, 3+ years of experience in software development, proficiency in Java and Python |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job title "<job_title>"
  And the user fills in the job description "<job_description>"
  And the user fills in the requirements "<requirements>"
  When the user clicks the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with the special characters in the title

  Examples:
    | job_title                   | job_description | requirements  |
    | Senior Developer @ XYZ     | a * 100         | a * 100       |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<requirements>" in the job requirements field
    And I enter "<job_title>" in the job title field
    And I enter "<job_description>" in the job description field
    And I click the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with numeric values in the requirements

    Examples:
      | requirements                     | job_title         | job_description                                      |
      | 5+ years of experience           | Software Engineer  | Responsible for developing and maintaining software applications. |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  When I enter "<requirements>" in the requirements field
  And I fill in the job title with "<job_title>"
  And I fill in the job description with "<job_description>"
  And I click the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with all job requirements listed

  Examples:
    | requirements                                          | job_title          | job_description                                           |
    | 5+ years experience; Proficient in Java; Team player | Software Engineer   | Responsible for developing and maintaining software applications. |

@optional-fields-empty
Scenario Outline: Open Create New Job Opening Form
  Given the user is on the Create New Job Opening form
  When I fill in the job title with "<job_title>"
  And I fill in the description with "<description>"
  And I leave the salary field empty
  And I leave the location field empty
  And I click the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with the optional fields left empty

  Examples:
    | job_title         | description                                    |
    | Software Engineer  | Develop and maintain software applications.   |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  When I enter "<job_description>" in the job description field
  And I enter "<job_title>" in the job title field
  And I enter "<job_requirements>" in the job requirements field
  And I click the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with special characters in the description

  Examples:
    | job_description                                         | job_title          | job_requirements                              |
    | Looking for a developer with experience in C# & .NET  | Software Developer  | Must have experience in C#, .NET, and SQL.   |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters the job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the job requirements "<job_requirements>"
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the job title trimmed of whitespace

    Examples:
      | job_title          | job_description            | job_requirements         |
      |  Senior Developer  | Job description a * 100    | Job requirements a * 100  |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user is on the Create New Job Opening Form
    When I enter "<job_description>"
    And I enter "<job_title>"
    And I enter "<requirements>"
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the HTML tags rendered correctly

    Examples:
      | job_description                  | job_title          | requirements |
      | <b>Looking for a developer</b>  | Software Developer  | a * 100      |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user is on the Create New Job Opening Form
    When I enter "<job_description>"
    And I enter "<job_title>"
    And I enter "<requirements>"
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the email format included in the description

    Examples:
      | job_description                     | job_title         | requirements                                       |
      | Contact us at hr@example.com       | Software Engineer  | Experience with automation testing and CI/CD tools. |

@save_button_disabled
Scenario Outline: Open Create New Job Opening Form
  Given the job title field is empty
  When I fill in the job description field with "<job_description>"
  And I fill in the job requirements field with "<job_requirements>"
  Then the Save button should be disabled
  And the Cancel button should remain enabled

  Examples:
    | job_description                                                                                      | job_requirements                                                        |
    | A valid job description that provides a clear overview of the job responsibilities and expectations. | A list of valid job requirements that are necessary for the position. |

@invalid-job-title
Scenario Outline: Open Create New Job Opening Form
  Given I enter a job title "<job_title>"
  And I fill in the job description with "<job_description>"
  And I fill in the job requirements with "<job_requirements>"
  When I click the Save button
  Then an error message is displayed indicating the job title is too short
  And the Save button remains disabled

  Examples:
    | job_title | job_description                                            | job_requirements                         |
    | A         | This is a valid job description that meets the requirements. | These are the valid job requirements.    |

  @invalid-job-description
  Scenario Outline: Open Create New Job Opening Form
    When I enter a job description that exceeds the maximum character limit
    And I enter the job title "<job_title>"
    And I enter the requirements "<requirements>"
    And I click the Save button
    Then an error message is displayed indicating the job description exceeds the character limit
    And the Save button remains disabled

    Examples:
      | job_title         | requirements                                                                                                        |
      | Software Engineer  | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development, proficiency in Java and Python. |

  @duplicate_job_title
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the requirements "<requirements>"
    When the user clicks the Save button
    Then an error message is displayed indicating the job title already exists
    And the Save button remains disabled

    Examples:
      | job_title            | job_description                                     | requirements                                              |
      | Software Engineer    | Develop and maintain software applications.         | Bachelor's degree in Computer Science or related field, 3+ years of experience. |

  @invalid-job-title
  Scenario Outline: Open Create New Job Opening Form
    Given I enter "<job_title>" in the job title field
    And I enter "<job_description>" in the job description field
    And I enter "<requirements>" in the requirements field
    When I click the Save button
    Then an error message is displayed indicating invalid characters in the job title
    And the Save button remains disabled

    Examples:
      | job_title      | job_description         | requirements         |
      | Developer #1   | Job description valid   | Requirements valid    |

  @error_message_for_exceeding_job_title
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the job requirements "<requirements>"
    And the user clicks the Save button
    Then an error message is displayed indicating the job title exceeds the character limit
    And the Save button remains disabled

    Examples:
      | job_title                                              | job_description | requirements |
      | This is a very long job title that exceeds the limit | a * 100         | a * 100      |

  @exceeding_character_limit
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters job requirements that exceed the maximum character limit
    And the user fills in the job title with "<job_title>"
    And the user fills in the job description with "<job_description>"
    When the user clicks the Save button
    Then an error message should be displayed indicating the job requirements exceed the character limit
    And the Save button should remain disabled

    Examples:
      | job_title          | job_description                                                                                                      |
      | Software Engineer   | We are looking for a skilled software engineer with experience in developing applications.                          |

@max-character-limits
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job title that meets the maximum character limit
  And the user enters a job description that meets the maximum character limit
  And the user enters job requirements that meet the maximum character limit
  When the user clicks the Save button
  Then the form should save successfully without any validation errors
  And the job opening should be created with all fields populated to their maximum limits

  Examples:
    | job_title                                                                                                                                                                                                 |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 |

@empty_fields
Scenario Outline: Open Create New Job Opening Form
  When the user leaves all fields empty
  And the user clicks the Save button
  Then validation messages are displayed for all required fields
  And the Save button remains disabled

  Examples:
    | <field> |
    |         |

@verify_add_job_opening_button
Scenario Outline: Open Create New Job Opening Form
  When the user locates the Add Job Opening button
  And the user clicks on the Add Job Opening button
  Then the Create New Job Opening form is displayed
  And the form contains fields for job title, description, requirements, and other relevant information
  And the form displays Save and Cancel buttons

Examples:
  | job_title | description | requirements | other_relevant_information |
  | Example Job Title | Example Description | Example Requirements | Example Other Information |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I fill in the job title field with <job_title>
    And I fill in the job description field with <job_description>
    And I fill in the job requirements field with <job_requirements>
    And I ensure all required fields are filled
    Then the Save button is enabled
    And the Cancel button remains enabled

    Examples:
      | job_title                | job_description                                                        | job_requirements                                                  |
      | Software Engineer        | Responsible for developing and maintaining software applications.     | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  @cancel_button_functionality
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Cancel button in the Create New Job Opening form
    Then the Create New Job Opening form is closed
    And the user is returned to the Job Opening screen

  Examples:
    | action                          |
    | Click on the Cancel button     |

  @validation_messages
  Scenario Outline: Open Create New Job Opening Form
    When I leave the job title field empty
    And I leave the job description field empty
    And I leave the job requirements field empty
    And I click the Save button
    Then validation messages are displayed for the empty job title field
    And validation messages are displayed for the empty job description field
    And validation messages are displayed for the empty job requirements field
    And the Save button remains disabled

  Examples:
    | job_title | job_description | job_requirements |
    |           |                  |                   |

  @validation-error-check
  Scenario Outline: Open Create New Job Opening Form
    When I fill in the job title field with <job_title>
    And I leave the job description field empty
    And I fill in the job requirements field with <job_requirements>
    And I click the Save button
    Then validation messages are displayed for the empty job description field
    And the job title field retains the entered value
    And the job requirements field retains the entered value

    Examples:
      | job_title            | job_requirements                                                                                     |
      | Software Engineer    | Bachelor's degree in Computer Science, 3 years of experience in software development, proficiency in Java and Python |

  @special-characters
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_title>" in the job title field
    And I fill in the job description with "<job_description>"
    And I fill in the requirements with "<requirements>"
    And I click the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with "<job_title>" in the title

    Examples:
      | job_title                | job_description | requirements |
      | Senior Developer @ XYZ   | a * 100         | a * 100      |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the admin fills in the job requirements field with <job_requirements>
    And the admin fills in the job title with <job_title>
    And the admin fills in the job description with <job_description>
    When the admin clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with numeric values in the requirements

    Examples:
      | job_requirements | job_title          | job_description                                           |
      | 5                | Software Engineer   | Responsible for developing and maintaining software applications. |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I enter <requirements> in the requirements field
    And I enter <job_title> in the job title field
    And I enter <job_description> in the job description field
    And I click the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all job requirements listed

    Examples:
      | requirements                                         | job_title       | job_description                                         |
      | 5+ years experience; Proficient in Java; Team player | Software Engineer | Responsible for developing and maintaining software applications. |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title with <job_title>
    And the user fills in the description with <description>
    And the user leaves the salary field empty
    And the user leaves the location field empty
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the optional fields left empty

    Examples:
      | job_title            | description                                      |
      | Software Engineer    | Develop and maintain software applications.     |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job description <job_description>
  And the user fills in the job title <job_title>
  And the user fills in the requirements <requirements>
  When the user clicks the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with special characters in the description

  Examples:
    | job_description                                         | job_title          | requirements                             |
    | Looking for a developer with experience in C# & .NET | Software Developer  | Must have experience in C#, .NET, and SQL. |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the job title trimmed of whitespace

    Examples:
      | job_title            | job_description         | job_requirements         |
      |  Senior Developer    | Job description a * 100 | Job requirements a * 100 |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job description with valid HTML tags <job_description>
  And the user fills in the job title <job_title>
  And the user fills in the requirements <requirements>
  When the user clicks the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with the HTML tags rendered correctly

  Examples:
    | job_description                     | job_title          | requirements |
    | <b>Looking for a developer</b>     | Software Developer  | a * 100      |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters the job description "<job_description>"
    And the user fills in the job title "<job_title>"
    And the user fills in the requirements "<requirements>"
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the email format included in the description

    Examples:
      | job_description                     | job_title         | requirements                                      |
      | Contact us at hr@example.com       | Software Engineer  | Experience with automation testing and CI/CD tools. |

@save_button_disabled
Scenario Outline: Open Create New Job Opening Form
  Given the job title field is <job_title>
  And the job description field is filled with <job_description>
  And the job requirements field is filled with <job_requirements>
  Then the Save button is disabled
  And the Cancel button remains enabled

  Examples:
    | job_title | job_description                                                                                       | job_requirements                                                        |
    |           | A valid job description that provides a clear overview of the job responsibilities and expectations. | A list of valid job requirements that are necessary for the position. |

@invalid-job-title
Scenario Outline: Open Create New Job Opening Form
  When I enter the job title "<job_title>"
  And I enter the job description "<job_description>"
  And I enter the job requirements "<job_requirements>"
  And I click the Save button
  Then an error message is displayed indicating the job title is too short
  And the Save button remains disabled

  Examples:
    | job_title | job_description                                                       | job_requirements                     |
    | A         | This is a valid job description that meets the requirements.        | These are the valid job requirements. |

@invalid-job-description
Scenario Outline: Open Create New Job Opening Form
  When I enter a job description that exceeds the maximum character limit
  And I fill in the job title with <job_title>
  And I fill in the job requirements with <job_requirements>
  And I click the Save button
  Then an error message should be displayed indicating the job description exceeds the character limit
  And the Save button should remain disabled

  Examples:
    | job_title          | job_requirements                                                                                     |
    | Software Engineer   | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development, proficiency in Java and Python. |

  @duplicate-job-title
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters the job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the requirements "<requirements>"
    When the user clicks the Save button
    Then an error message should be displayed indicating the job title already exists
    And the Save button remains disabled

    Examples:
      | job_title              | job_description                                      | requirements                                               |
      | Software Engineer      | Develop and maintain software applications.         | Bachelor's degree in Computer Science or related field, 3+ years of experience. |

  @invalid-job-title
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_title>" in the job title field
    And I enter "<job_description>" in the job description field
    And I enter "<requirements>" in the requirements field
    And I click the Save button
    Then an error message is displayed indicating invalid characters in the job title
    And the Save button remains disabled

    Examples:
      | job_title       | job_description          | requirements            |
      | Developer #1    | Job description a * 100  | Requirements a * 100     |

  @long-job-title
  Scenario Outline: Open Create New Job Opening Form
    When I enter a job title that exceeds the maximum character limit
    And I fill in the job description with valid data
    And I fill in the requirements with valid data
    And I click the Save button
    Then an error message should be displayed indicating the job title exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_title                                               | job_description | requirements |
      | This is a very long job title that exceeds the limit   | a * 100        | a * 100      |

  @exceeded_character_limit
  Scenario Outline: Open Create New Job Opening Form
    Given I enter job requirements "<job_requirements>"
    And I enter job title "<job_title>"
    And I enter job description "<job_description>"
    When I click the Save button
    Then an error message should be displayed indicating the job requirements exceed the character limit
    And the Save button should remain disabled

    Examples:
      | job_requirements                                                                                     | job_title          | job_description                                                                                      |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Software Engineer   | We are looking for a skilled software engineer with experience in developing applications.           |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job title that meets the maximum character limit
    And the user enters a job description that meets the maximum character limit
    And the user enters job requirements that meet the maximum character limit
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with all fields populated to their maximum limits

    Examples:
      | job_title         | job_description         | job_requirements      |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@empty-fields
Scenario Outline: Open Create New Job Opening Form
  When all fields are left empty
  And the admin clicks the Save button
  Then validation messages are displayed for all required fields
  And the Save button remains disabled

Examples:
  | field1 | field2 | field3 |
  |        |        |        |

  @tc_open_create_job_opening
  Scenario Outline: Open Create New Job Opening Form
    When the user locates the Add Job Opening button
    And the user clicks the Add Job Opening button
    Then the Create New Job Opening form should be displayed
    And the form should contain fields for job title, description, requirements, and other relevant information
    And the form should display Save and Cancel buttons

    Examples:
      | header |
      | value  |

  @tc_save_button_enabled
  Scenario Outline: Verify Save Button Enabled with Valid Data
    Given the user fills in the job title field with "<job_title>"
    And the user fills in the job description field with "<job_description>"
    And the user fills in the job requirements field with "<job_requirements>"
    When the user ensures all required fields are filled
    Then the Save button should be enabled
    And the Cancel button should remain enabled

    Examples:
      | job_title           | job_description                                                            | job_requirements                                        |
      | Software Engineer    | Responsible for developing and maintaining software applications.         | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  Scenario Outline: Clicking Cancel button on Create New Job Opening form
    When the user clicks the Cancel button
    Then the Create New Job Opening form should be closed
    And the user should be returned to the Job Opening screen

  Examples:
    | action               |
    | Click on the Cancel button |

  @tc_empty_required_fields
  Scenario Outline: Validate required fields on save attempt
    When the user leaves the job title field empty
    And the user leaves the job description field empty
    And the user leaves the job requirements field empty
    And the user clicks the Save button
    Then validation messages should be displayed for the empty job title field
    And validation messages should be displayed for the empty job description field
    And validation messages should be displayed for the empty job requirements field
    And the Save button should remain disabled

    Examples:
      | job_title | job_description | job_requirements |
      |           |                  |                   |

  @tc_validation_error
  Scenario Outline: Open Create New Job Opening Form
    When the user enters "<job_title>" in the job title field
    And the user leaves the job description field empty
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then validation messages should be displayed for the empty job description field
    And the job title field should retain the entered value "<job_title>"
    And the job requirements field should retain the entered value "<job_requirements>"

    Examples:
      | job_title          | job_requirements                                                                           |
      | Software Engineer   | Bachelor's degree in Computer Science, 3+ years of experience in software development, proficiency in Java and Python |

  @tc_special_characters_in_title
  Scenario Outline: Verify Create New Job Opening Form Allows Special Characters in Job Title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the job title "<job_title>"

    Examples:
      | job_title                     | job_description | requirements |
      | Senior Developer @ XYZ       | a * 100         | a * 100      |

  @tc_numeric_job_requirements
  Scenario Outline: Create New Job Opening with Numeric Job Requirements
    Given the user enters "<requirements>" in the job requirements field
    And the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with numeric values in the requirements

    Examples:
      | requirements       | job_title          | job_description                                         |
      | 5 years of experience | Software Engineer | Responsible for developing and maintaining software applications. |

  @tc_create_job_opening
  Scenario Outline: Create New Job Opening with Multiple Job Requirements
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all job requirements listed

    Examples:
      | job_title        | job_description                                             | requirements                               |
      | Software Engineer | Responsible for developing and maintaining software applications. | 5+ years experience; Proficient in Java; Team player |

  @tc_save_with_empty_optional_fields
  Scenario Outline: Save Create New Job Opening with Empty Optional Fields
    When the user enters "<job_title>" in the job title field
    And the user enters "<description>" in the job description field
    And the user leaves the salary field empty
    And the user leaves the location field empty
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the optional fields left empty

    Examples:
      | job_title           | description                                     |
      | Software Engineer    | Develop and maintain software applications.     |

  @tc_special_characters_in_description
  Scenario Outline: Create New Job Opening with Special Characters in Description
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with special characters in the description

    Examples:
      | job_title           | job_description                                         | job_requirements                           |
      | Software Developer   | Looking for a developer with experience in C# & .NET | Must have experience in C#, .NET, and SQL. |

  @tc_leading_trailing_whitespace
  Scenario Outline: Open Create New Job Opening Form
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the job title trimmed of whitespace

    Examples:
      | job_title          | job_description                     | job_requirements                     |
      |  Senior Developer  | Job description a * 100            | Job requirements a * 100            |

  @tc_valid_html_tags
  Scenario Outline: Open Create New Job Opening Form with Valid HTML Tags
    When the user enters "<job_description>" in the job description field
    And the user enters "<job_title>" in the job title field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the HTML tags rendered correctly

    Examples:
      | job_description               | job_title          | requirements |
      | <b>Looking for a developer</b> | Software Developer | a * 100      |

  @tc_valid_email_format
  Scenario Outline: Create New Job Opening with Valid Email Format
    Given the user enters "<job_description>" in the job description field
    And the user enters "<job_title>" in the job title field
    And the user enters "<requirements>" in the requirements field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the email format included in the description

    Examples:
      | job_description                    | job_title          | requirements                                           |
      | Contact us at hr@example.com      | Software Engineer   | Experience with automation testing and CI/CD tools.   |

  @tc_save_button_disabled
  Scenario Outline: Validate Save Button State with Empty Required Fields
    When the user leaves the job title field empty
    And the user fills in the job description field with "<job_description>"
    And the user fills in the job requirements field with "<job_requirements>"
    Then the Save button should be disabled
    And the Cancel button should remain enabled

    Examples:
      | job_description                                                                                                               | job_requirements                                         |
      | A valid job description that provides a clear overview of the job responsibilities and expectations.                         | A list of valid job requirements that are necessary for the position. |

  @tc_invalid_job_title
  Scenario Outline: Validate error message for invalid job title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then an error message should be displayed indicating the job title is too short
    And the Save button should remain disabled

    Examples:
      | job_title | job_description                                                      | job_requirements                                    |
      | A         | This is a valid job description that meets the requirements.       | These are the valid job requirements.              |

  @tc_long_job_description
  Scenario Outline: Validate Error Message for Invalid Job Description
    Given the user enters a job description "<job_description>"
    And the user fills in the job title "<job_title>"
    And the user fills in the job requirements "<requirements>"
    When the user clicks the Save button
    Then the user should see an error message indicating the job description exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_description                                                                                     | job_title          | requirements                                                                                                 |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Software Engineer | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development, proficiency in Java and Python. |

  @tc_duplicate_job_title
  Scenario Outline: Display Error for Duplicate Job Title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then an error message should be displayed indicating the job title already exists
    And the Save button should remain disabled

    Examples:
      | job_title          | job_description                                   | requirements                                                          |
      | Software Engineer   | Develop and maintain software applications.      | Bachelor's degree in Computer Science or related field, 3+ years of experience. |

  @tc_invalid_job_title
  Scenario Outline: Validate Error Message for Invalid Job Title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the user should see an error message indicating invalid characters in the job title
    And the Save button should remain disabled

    Examples:
      | job_title      | job_description        | requirements            |
      | Developer #1   | Job description valid  | Requirements valid      |

  @tc_job_title_exceeds_limit
  Scenario Outline: Validate Error Message for Job Title Exceeding Character Limit
    Given the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    When the user clicks the Save button
    Then an error message should be displayed indicating the job title exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_title                                                | job_description                  | requirements                     |
      | This is a very long job title that exceeds the limit   | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @tc_job_requirements_exceed_limit
  Scenario Outline: Validate Error Message for Job Requirements Exceeding Character Limit
    Given the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    When the user clicks the Save button
    Then an error message should be displayed indicating the job requirements exceed the character limit
    And the Save button should remain disabled

    Examples:
      | job_title           | job_description                                                                       | job_requirements          |
      | Software Engineer    | We are looking for a skilled software engineer with experience in developing applications. | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @tc_maximum_character_limits
  Scenario Outline: Validate Maximum Character Limits for Job Opening Fields
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all fields populated to their maximum limits

    Examples:
      | job_title         | job_description    | job_requirements    |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @tc_empty_fields
  Scenario Outline: Validate empty fields in Create New Job Opening form
    When the user leaves all fields empty
    And the user clicks the Save button
    Then validation messages should be displayed for all required fields
    And the Save button should remain disabled

    Examples:
      | empty |
      |       |

  @tc_verify_create_new_job_opening_form
  Scenario Outline: Verify Create New Job Opening Form Opens
    When the user locates the Add Job Opening button
    And the user clicks on the Add Job Opening button
    Then the Create New Job Opening form should be displayed
    And the form should contain fields for job title, description, requirements, and other relevant information
    And the form should display Save and Cancel buttons

  Examples:
    | job_title | description | requirements | other_relevant_information |
    | Example Job Title | Example Description | Example Requirements | Example Other Information |

  @tc_valid_form_submission
  Scenario Outline: Verify Save Button Enabled with All Required Fields Filled
    Given the user fills in the job title field with <job_title>
    And the user fills in the job description field with <job_description>
    And the user fills in the job requirements field with <job_requirements>
    When the user ensures all required fields are filled
    Then the Save button should be enabled
    And the Cancel button should remain enabled

  Examples:
    | job_title            | job_description                                                        | job_requirements                                               |
    | Software Engineer    | Responsible for developing and maintaining software applications.     | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  Scenario Outline: Clicking the Cancel button
    When the user clicks the Cancel button in the Create New Job Opening form
    Then the Create New Job Opening form should be closed
    And the user should be returned to the Job Opening screen

  Examples:
    | action                     |
    | Click on the Cancel button |

  Scenario Outline: Validate empty required fields on form submission
    When the user leaves the job title field empty
    And the user leaves the job description field empty
    And the user leaves the job requirements field empty
    And the user clicks the Save button
    Then validation messages should be displayed for the empty job title field
    And validation messages should be displayed for the empty job description field
    And validation messages should be displayed for the empty job requirements field
    And the Save button should remain disabled

  Examples:
    | job_title | job_description | job_requirements |
    |           |                  |                   |

  @tc_validation_errors
  Scenario Outline: Verify retention of data after validation errors
    When the user fills in the job title field with <job_title>
    And the user leaves the job description field empty
    And the user fills in the job requirements field with <job_requirements>
    And the user clicks the Save button
    Then the validation messages should be displayed for the empty job description field
    And the job title field should retain the entered value <job_title>
    And the job requirements field should retain the entered value <job_requirements>

  Examples:
    | job_title            | job_requirements                                                                                     |
    | Software Engineer     | Bachelor's degree in Computer Science, 3 years of experience in software development, proficiency in Java and Python |

  @tc_special_characters_in_title
  Scenario Outline: Create New Job Opening with Special Characters in Title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the title "<job_title>"

  Examples:
    | job_title                | job_description | requirements |
    | Senior Developer @ XYZ   | a * 100         | a * 100      |

  Scenario Outline: Create Job Opening with Numeric Values in Requirements
    Given the user enters <job_requirements> in the job requirements field
    And the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with numeric values in the requirements

    Examples:
      | job_requirements | job_title          | job_description                                           |
      | 5                | Software Engineer   | Responsible for developing and maintaining software applications. |

  @tc_multiple_job_requirements
  Scenario Outline: Create New Job Opening with Multiple Requirements
    Given the user enters <requirements> in the job requirements field
    And the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all job requirements listed

  Examples:
    | requirements                                      | job_title        | job_description                                         |
    | 5+ years experience; Proficient in Java; Team player | Software Engineer | Responsible for developing and maintaining software applications. |

  @tc_save_with_optional_fields_empty
  Scenario Outline: Save Job Opening with Optional Fields Empty
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user leaves the salary field empty
    And the user leaves the location field empty
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the optional fields left empty

  Examples:
    | job_title          | job_description                                |
    | Software Engineer   | Develop and maintain software applications.    |

  @tc_special_characters_in_description
  Scenario Outline: Create Job Opening with Special Characters in Description
    Given the user enters <job_description> in the job description field
    And the user enters <job_title> in the job title field
    And the user enters <job_requirements> in the job requirements field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with special characters in the description

    Examples:
      | job_description                                           | job_title         | job_requirements                          |
      | Looking for a developer with experience in C# & .NET   | Software Developer | Must have experience in C#, .NET, and SQL. |

  @tc_leading_trailing_whitespace
  Scenario Outline: Create Job Opening With Leading and Trailing Whitespace
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the job title trimmed of whitespace

  Examples:
    | job_title            | job_description         | job_requirements         |
    |  Senior Developer    | Job description a * 100 | Job requirements a * 100 |

  @tc_valid_html_tags
  Scenario Outline: Create New Job Opening with Valid HTML Tags
    Given the user enters "<job_description>" in the job description field
    And the user enters "<job_title>" in the job title field
    And the user enters "<requirements>" in the requirements field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the HTML tags rendered correctly

  Examples:
    | job_description                     | job_title          | requirements |
    | <b>Looking for a developer</b>     | Software Developer  | a * 100      |

  Scenario Outline: Create New Job Opening with Valid Email Format @tc_valid_email_format
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_title>" in the job title field
    And the user enters "<requirements>" in the requirements field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the email format included in the description

  Examples:
    | job_description                        | job_title        | requirements                                      |
    | Contact us at hr@example.com          | Software Engineer | Experience with automation testing and CI/CD tools. |

  @tc_validate_save_button_disabled
  Scenario Outline: Save button is disabled when job title is empty
    Given the job title field is <job_title>
    And the user enters <job_description> in the job description field
    And the user enters <job_requirements> in the job requirements field
    Then the Save button should be disabled
    And the Cancel button should remain enabled

  Examples:
    | job_title | job_description                                                                 | job_requirements                                               |
    |           | A valid job description that provides a clear overview of the job responsibilities and expectations. | A list of valid job requirements that are necessary for the position. |

  Scenario Outline: Display error message for invalid job title @tc_invalid_job_title
    When the user enters <job_title> as the job title
    And the user fills in the job description with <job_description>
    And the user fills in the job requirements with <job_requirements>
    And the user clicks the Save button
    Then the user should see an error message indicating the job title is too short
    And the Save button should remain disabled

    Examples:
      | job_title | job_description                                                       | job_requirements                     |
      | A         | This is a valid job description that meets the requirements.        | These are the valid job requirements. |

  Scenario Outline: Validate Error Message for Invalid Job Description
    When the user enters a job description that exceeds the maximum character limit
    And the user enters <job_title> in the job title field
    And the user enters <requirements> in the requirements field
    And the user clicks the Save button
    Then an error message should be displayed indicating the job description exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_title          | requirements                                                                                     |
      | Software Engineer   | Bachelor's degree in Computer Science or related field, 3 years of experience in software development, proficiency in Java and Python. |

  Scenario Outline: Display Error Message for Duplicate Job Title
    When the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    And the user enters <requirements> in the requirements field
    And the user clicks the Save button
    Then the user should see an error message indicating the job title already exists
    And the Save button should remain disabled

    Examples:
      | job_title            | job_description                                   | requirements                                               |
      | Software Engineer    | Develop and maintain software applications.      | Bachelor's degree in Computer Science or related field, 3 years of experience. |

  Scenario Outline: Validate Error Message for Invalid Job Title Characters
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the user should see an error message indicating invalid characters in the job title
    And the Save button should remain disabled

    Examples:
      | job_title        | job_description          | requirements            |
      | Developer #1     | Job description a * 100  | Requirements a * 100     |

  Scenario Outline: Validate error message for job title exceeding character limit
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the user should see an error message indicating the job title exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_title                                                        | job_description                                                                 | requirements                                                                 |
      | This is a very long job title that exceeds the limit           | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @tc_exceed_character_limit
  Scenario Outline: Validate Error Message for Exceeding Job Requirements Character Limit
    Given the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    When the user clicks the Save button
    Then the user should see an error message indicating the job requirements exceed the character limit
    And the Save button should remain disabled

  Examples:
    | job_title            | job_description                                                                                     | job_requirements                                                                                      |
    | Software Engineer     | We are looking for a skilled software engineer with experience in developing applications. | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @tc_max_character_limits
  Scenario Outline: Validate Maximum Character Limits for Job Opening Fields
    Given the user enters a job title of <job_title> in the job title field
    And the user enters a job description of <job_description> in the job description field
    And the user enters job requirements of <job_requirements> in the job requirements field
    When the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all fields populated to their maximum limits

  Examples:
    | job_title                                                                                     | job_description                                                                                     | job_requirements                                                                                     |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  Scenario Outline: Validate Empty Input Fields
    When the user leaves all fields empty
    And the user clicks the Save button
    Then validation messages should be displayed for all required fields
    And the Save button should remain disabled

  Examples:
    | field1 | field2 | field3 |
    |        |        |        |
