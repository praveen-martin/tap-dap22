
Feature: OpenCreateNewJobOpeningFor @feature_user_login

  Background:
    Given the recruiter is on the Job Opening screen

  Scenario Outline: Create New Job Opening Form is Displayed @tc_navigate_to_job_opening
    When the recruiter clicks the Add Job Opening button
    Then the Create New Job Opening form is displayed
    And the form contains fields for job title, description, requirements, and other relevant information
    And the form displays Save and Cancel buttons

  Examples:
    | action                       |
    | Click on the Add Job Opening button |

  @tc_save_button_enabled
  Scenario Outline: Save Button is Enabled When All Required Fields Are Filled
    When the user fills in the job title field with <job_title>
    And the user fills in the job description field with <job_description>
    And the user fills in the job requirements field with <job_requirements>
    Then the Save button should be enabled
    And the Cancel button should remain enabled

    Examples:
      | job_title            | job_description                                                        | job_requirements                                               |
      | Software Engineer     | Responsible for developing and maintaining software applications.     | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  @tc_cancel_job_opening
  Scenario Outline: User Cancels Creating a Job Opening
    When the user clicks on the Cancel button
    Then the Create New Job Opening form should be closed
    And the user should be returned to the Job Opening screen

  Examples:
    | action               |
    | Click on the Cancel button |

  Scenario Outline: Display Validation Errors for Empty Required Fields
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

  Scenario Outline: Display Validation Messages and Retain Data After Validation Error
    When the user enters <job_title> in the job title field
    And the user leaves the job description field empty
    And the user enters <job_requirements> in the job requirements field
    And the user clicks the Save button
    Then validation messages should be displayed for the empty job description field
    And the job title field should retain the value <job_title>
    And the job requirements field should retain the value <job_requirements>

  Examples:
    | job_title                | job_requirements                                                                                     |
    | Software Engineer        | Bachelor's degree in Computer Science, 3 years of experience in software development, proficiency in Java and Python |

  Scenario Outline: Create Job Opening with Special Characters in Title
    When the user enters the job title <job_title>
    And the user enters the job description <job_description>
    And the user enters the requirements <requirements>
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the special characters in the title

    Examples:
      | job_title                     | job_description | requirements |
      | Senior Developer @ XYZ       | a * 100         | a * 100      |

  Scenario Outline: Create Job Opening with Numeric Requirements
    When the user enters <job_requirements> in the job requirements field
    And the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with numeric values in the requirements

    Examples:
      | job_requirements | job_title          | job_description                                           |
      | 5                | Software Engineer   | Responsible for developing and maintaining software applications. |

  @tc_save_job_opening_successfully
  Scenario Outline: Create Job Opening with Multiple Requirements
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the job opening should be created successfully
    And the job requirements should include "<requirements>"

    Examples:
      | job_title          | job_description                                             | requirements                                   |
      | Software Engineer   | Responsible for developing and maintaining software applications. | 5+ years experience; Proficient in Java; Team player |

  @tc_successful_job_creation
  Scenario Outline: Create Job Opening with Optional Fields Left Empty
    When the user fills in the job title with <job_title>
    And the user fills in the description with <description>
    And the user leaves the salary field empty
    And the user leaves the location field empty
    And the user clicks the Save button
    Then the form should save successfully
    And the job opening should be created with the optional fields left empty

  Examples:
    | job_title          | description                                   |
    | Software Engineer   | Develop and maintain software applications.   |

  Scenario Outline: Create Job Opening with Special Characters in Description
    When the user enters "<job_description>" in the job description field
    And the user enters "<job_title>" in the job title field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with special characters in the description

    Examples:
      | job_description                                           | job_title         | job_requirements                          |
      | Looking for a developer with experience in C# & .NET   | Software Developer | Must have experience in C#, .NET, and SQL. |

  Scenario Outline: Create Job Opening with Leading and Trailing Whitespace
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the job title "<expected_job_title>"

    Examples:
      | job_title            | job_description         | job_requirements         | expected_job_title |
      |  Senior Developer    | Job description a * 100 | Job requirements a * 100 | Senior Developer    |

  Scenario Outline: Create Job Opening with Valid HTML Tags in Description @tc_fill_job_description
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the job requirements field
    And the user clicks the Save button
    Then the job opening should be created successfully
    And the job description should display the HTML tags correctly

    Examples:
      | job_title          | job_description                 | requirements |
      | Software Developer  | <b>Looking for a developer</b> | a * 100      |

  Scenario Outline: Successfully Create New Job Opening with Valid Email in Description
    When the user enters "<job_description>" in the job description field
    And the user enters "<job_title>" in the job title field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the email format included in the description

    Examples:
      | job_description                     | job_title        | requirements                                      |
      | Contact us at hr@example.com       | Software Engineer | Experience with automation testing and CI/CD tools. |

  Scenario Outline: Save Button Disabled When Job Title is Empty
    When the user leaves the job title field empty
    And the user fills in the job description field with <job_description>
    And the user fills in the job requirements field with <job_requirements>
    Then the Save button should be disabled
    And the Cancel button should remain enabled

    Examples:
      | job_description                                                                                     | job_requirements                                                        |
      | A valid job description that provides a clear overview of the job responsibilities and expectations. | A list of valid job requirements that are necessary for the position.  |

  Scenario Outline: Display Validation Error for Short Job Title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then an error message indicating the job title is too short should be displayed
    And the Save button should remain disabled

    Examples:
      | job_title | job_description                                               | job_requirements                     |
      | A         | This is a valid job description that meets the requirements. | These are the valid job requirements. |

  @tc_open_create_new_job_form
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks the Add Job Opening button
    Then the Create New Job Opening form should be displayed
    And the form should contain fields for job title, description, requirements, and other relevant information
    And the form should display Save and Cancel buttons

  Examples:
    | action                       |
    | Click on the Add Job Opening button |

  @tc_enable_save_button_with_valid_input
  Scenario Outline: Save Button is Enabled with All Required Fields Filled
    When the user fills in the job title field with <job_title>
    And the user fills in the job description field with <job_description>
    And the user fills in the job requirements field with <job_requirements>
    Then the Save button should be enabled
    And the Cancel button should remain enabled

    Examples:
      | job_title              | job_description                                                        | job_requirements                                               |
      | Software Engineer      | Responsible for developing and maintaining software applications.     | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  @tc_cancel_job_opening_form
  Scenario Outline: User Cancels Create New Job Opening Form
    When the user clicks the Cancel button
    Then the Create New Job Opening form should be closed
    And the user should be returned to the Job Opening screen

  Examples:
    | action               |
    | Click on the Cancel button in the Create New Job Opening form |

  @tc_empty_job_title
  Scenario Outline: Display Validation Error for Empty Job Title
    When the user leaves the job title field empty
    And the user leaves the job description field empty
    And the user leaves the job requirements field empty
    And the user clicks the Save button
    Then validation messages are displayed for the empty job title field
    And validation messages are displayed for the empty job description field
    And validation messages are displayed for the empty job requirements field
    And the Save button remains disabled

  Examples:
    | job_title | job_description | job_requirements |
    |           |                  |                   |

  Scenario Outline: Validate Job Form Retains Data After Validation Errors
    When the user fills in the job title field with <job_title>
    And the user leaves the job description field empty
    And the user fills in the job requirements field with <job_requirements>
    And the user clicks the Save button
    Then validation messages are displayed for the empty job description field
    And the job title field retains the value <job_title>
    And the job requirements field retains the value <job_requirements>

    Examples:
      | job_title              | job_requirements                                                                                     |
      | Software Engineer      | Bachelor's degree in Computer Science, 3 years of experience in software development, proficiency in Java and Python |

  Scenario Outline: Create Job Opening with Special Characters in Title
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the title "<job_title>"

    Examples:
      | job_title                | job_description | requirements |
      | Senior Developer @ XYZ   | a * 100         | a * 100      |

  Scenario Outline: Create Job Opening with Numeric Values in Requirements
    When the user enters <job_requirements> in the job requirements field
    And the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with numeric values in the requirements

  Examples:
    | job_requirements | job_title          | job_description                                           |
    | 5                | Software Engineer   | Responsible for developing and maintaining software applications. |

  @tc_multiple_job_requirements
  Scenario Outline: Create Job Opening with Multiple Requirements
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all job requirements listed

  Examples:
    | job_title          | job_description                                             | requirements                                      |
    | Software Engineer   | Responsible for developing and maintaining software applications. | 5+ years experience; Proficient in Java; Team player |

  @tc_successful_job_creation
  Scenario Outline: Save Job Opening with Optional Fields Left Empty
    When the user fills in the job title with <job_title>
    And the user fills in the description with <description>
    And the user leaves the salary field empty
    And the user leaves the location field empty
    And the user clicks the Save button
    Then the form should save successfully
    And the job opening should be created with the optional fields left empty

    Examples:
      | job_title          | description                                      |
      | Software Engineer   | Develop and maintain software applications.      |

  Scenario Outline: Create Job Opening with Special Characters in Description
    When the user enters <job_description> in the job description field
    And the user enters <job_title> in the job title field
    And the user enters <job_requirements> in the job requirements field
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with special characters in the description

    Examples:
      | job_description                                         | job_title         | job_requirements                          |
      | Looking for a developer with experience in C# & .NET | Software Developer | Must have experience in C#, .NET, and SQL. |

  @tc_successful_job_creation
  Scenario Outline: Create Job Opening with Leading and Trailing Whitespace in Title
    When the user enters the job title "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the job title "<expected_job_title>"

    Examples:
      | job_title            | job_description         | job_requirements         | expected_job_title |
      |  Senior Developer    | Job description a * 100 | Job requirements a * 100 | Senior Developer    |

  Scenario Outline: Create Job Opening with Valid HTML Tags in Description
    When the user enters "<job_title>" in the job title field
    And the user enters "<requirements>" in the requirements field
    And the user enters "<job_description>" in the job description field
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the job description rendered correctly

    Examples:
      | job_title          | requirements | job_description              |
      | Software Developer  | a * 100      | <b>Looking for a developer</b> |

  Scenario Outline: Create Job Opening with Valid Email Format in Description
    When the user enters "<job_title>" in the job title
    And the user enters "<requirements>" in the requirements
    And the user enters "<job_description>" in the job description
    And the user clicks the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the email format included in the description

    Examples:
      | job_title          | requirements                                      | job_description                     |
      | Software Engineer   | Experience with automation testing and CI/CD tools. | Contact us at hr@example.com       |

  Scenario Outline: Save Button Disabled When Job Title Field is Empty
    When the user leaves the job title field empty
    And the user fills in the job description field with <job_description>
    And the user fills in the job requirements field with <job_requirements>
    Then the Save button should be disabled
    And the Cancel button should remain enabled

    Examples:
      | job_description                                                                                       | job_requirements                                                        |
      | A valid job description that provides a clear overview of the job responsibilities and expectations. | A list of valid job requirements that are necessary for the position.  |

  Scenario Outline: Display Validation Error for Job Title Too Short
    When the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<job_requirements>" in the job requirements field
    And the user clicks the Save button
    Then an error message should be displayed indicating the job title is too short
    And the Save button remains disabled

    Examples:
      | job_title | job_description                                               | job_requirements                     |
      | A         | This is a valid job description that meets the requirements. | These are the valid job requirements. |

  Scenario Outline: Display Error for Exceeding Job Description Length
    When the user enters a job description of <job_description>
    And the user enters <job_title> in the job title field
    And the user enters <requirements> in the requirements field
    And the user clicks the Save button
    Then the user should see an error message indicating the job description exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_description | job_title         | requirements                                                                                     |
      | a * 100         | Software Engineer  | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development, proficiency in Java and Python. |

  Scenario Outline: Display Error Message for Duplicate Job Title
    When the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    And the user enters <requirements> in the requirements field
    And the user clicks the Save button
    Then an error message should be displayed indicating the job title already exists
    And the Save button should remain disabled

    Examples:
      | job_title          | job_description                                   | requirements                                               |
      | Software Engineer   | Develop and maintain software applications.      | Bachelor's degree in Computer Science or related field, 3 years of experience. |

  @tc_error_message_displayed
  Scenario Outline: Display Error for Invalid Characters in Job Title
    When the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    And the user enters <requirements> in the requirements field
    And the user clicks the Save button
    Then the user should see an error message indicating invalid characters in the job title
    And the Save button should remain disabled

    Examples:
      | job_title       | job_description          | requirements            |
      | Developer #1    | Job description a * 100  | Requirements a * 100     |

  Scenario Outline: Display Error Message for Exceeded Job Title Length
    When the user enters <job_title> in the job title field
    And the user enters <job_description> in the job description field
    And the user enters <requirements> in the requirements field
    And the user clicks the Save button
    Then an error message should be displayed indicating the job title exceeds the character limit
    And the Save button should remain disabled

    Examples:
      | job_title                                                        | job_description                                                                 | requirements                                                                 |
      | This is a very long job title that exceeds the limit            | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  Scenario Outline: Display Error When Job Requirements Exceed Character Limit
    When the user enters job requirements "<job_requirements>"
    And the user enters job title "<job_title>"
    And the user enters job description "<job_description>"
    And the user clicks the Save button
    Then an error message should be displayed indicating the job requirements exceed the character limit
    And the Save button should remain disabled

    Examples:
      | job_requirements                                                                 | job_title          | job_description                                                                                     |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Software Engineer   | We are looking for a skilled software engineer with experience in developing applications. |

  @tc_job_opening_creation_success
  Scenario Outline: Create Job Opening with Maximum Character Limits
    When the user enters a job title "<job_title>"
    And the user enters a job description "<job_description>"
    And the user enters job requirements "<job_requirements>"
    And the user clicks the Save button
    Then the job opening should be created successfully without any validation errors
    And the job opening should have all fields populated to their maximum limits

    Examples:
      | job_title                                                                 |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
      | job_description                                                            |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
      | job_requirements                                                           |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @tc_validate_no_input
  Scenario Outline: Display Validation Errors for Empty Fields
    When the user leaves all fields empty
    And the user clicks the Save button
    Then validation messages should be displayed for all required fields
    And the Save button should remain disabled

  Examples:
    | input_data |
    |            |

@open_job_opening_form
Scenario Outline: Open Create New Job Opening Form
  When the user locates the Add Job Opening button
  And the user clicks on the Add Job Opening button
  Then the Create New Job Opening form is displayed
  And the form contains fields for job title, description, requirements, and other relevant information
  And the form displays Save and Cancel buttons

Examples:
  |   |
  |   |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title field with "<job_title>"
    And the user fills in the job description field with "<job_description>"
    And the user fills in the job requirements field with "<job_requirements>"
    When all required fields are filled
    Then the Save button is enabled
    And the Cancel button remains enabled

    Examples:
      | job_title               | job_description                                               | job_requirements                                   |
      | Software Engineer       | Responsible for developing and maintaining software applications. | Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  @cancel_job_opening
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Cancel button
    Then the Create New Job Opening form is closed
    And the user is returned to the Job Opening screen

    Examples:
      |   |
      |   |

  @empty_fields_validation
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
    Then validation messages are displayed for the empty job description field
    And the job title field retains the entered value
    And the job requirements field retains the entered value

    Examples:
      | job_title           | job_requirements                                                            |
      | Software Engineer    | Bachelor's degree in Computer Science, 3+ years of experience in software development, proficiency in Java and Python |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  When I enter the job title "<job_title>"
  And I enter the job description "<job_description>"
  And I enter the requirements "<requirements>"
  And I click the Save button
  Then the form should save successfully without any validation errors
  And the job opening should be created with the special characters in the title

  Examples:
    | job_title               | job_description | requirements  |
    | Senior Developer @ XYZ  | a * 100         | a * 100       |

  @valid-numeric-job-requirements
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters "<job_requirements>"
    And the user fills in the job title "<job_title>"
    And the user fills in the job description "<job_description>"
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with numeric values in the requirements

    Examples:
      | job_requirements            | job_title          | job_description                                         |
      | 5 years of experience       | Software Engineer   | Responsible for developing and maintaining software applications. |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_requirements>" in the job requirements field
    And I fill in the job title as "<job_title>"
    And I fill in the job description as "<job_description>"
    And I click the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with all job requirements listed

    Examples:
      | job_requirements                       | job_title          | job_description                                             |
      | 5+ years experience; Proficient in Java; Team player | Software Engineer | Responsible for developing and maintaining software applications. |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title with "<job_title>"
    And the user fills in the job description with "<description>"
    And the user leaves the salary field empty
    And the user leaves the location field empty
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the optional fields left empty

    Examples:
      | job_title          | description                                    |
      | Software Engineer   | Develop and maintain software applications.    |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  When I enter "<job_description>"
  And I enter "<job_title>"
  And I enter "<job_requirements>"
  And I click the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with special characters in the description

  Examples:
    | job_description                                        | job_title          | job_requirements                          |
    | Looking for a developer with experience in C# & .NET | Software Developer  | Must have experience in C#, .NET, and SQL. |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  Given the admin enters a job title with leading and trailing whitespace "<job_title>"
  And the admin enters the job description "<job_description>"
  And the admin enters the job requirements "<job_requirements>"
  When the admin clicks the Save button
  Then the form saves successfully without any validation errors

  Examples:
    | job_title           | job_description         | job_requirements         |
    | Senior Developer    | Job description a * 100 | Job requirements a * 100 |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job description "<job_description>"
    And the user enters the job title "<job_title>"
    And the user enters the requirements "<requirements>"
    When the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the HTML tags rendered correctly

    Examples:
      | job_description                | job_title           | requirements |
      | <b>Looking for a developer</b> | Software Developer   | a * 100      |

@valid-email-format
Scenario Outline: Open Create New Job Opening Form
  Given the user enters "<job_description>"
  And the user fills in the job title "<job_title>"
  And the user fills in the requirements "<requirements>"
  When the user clicks the Save button
  Then the form saves successfully without any validation errors

  Examples:
    | job_description                      | job_title         | requirements                                         |
    | Contact us at hr@example.com        | Software Engineer  | Experience with automation testing and CI/CD tools. |

@validate_save_button_disabled
Scenario Outline: Open Create New Job Opening Form
  Given the job title field is empty
  When I fill in the job description field with "<job_description>"
  And I fill in the job requirements field with "<job_requirements>"
  Then the Save button should be disabled
  And the Cancel button remains enabled

  Examples:
    | job_description                                                                                       | job_requirements                                          |
    | A valid job description that provides a clear overview of the job responsibilities and expectations. | A list of valid job requirements that are necessary for the position. |

  @invalid_job_title
  Scenario Outline: Open Create New Job Opening Form with Invalid Job Title
    Given the user enters "<job_title>"
    And the user enters "<job_description>"
    And the user enters "<job_requirements>"
    When the user clicks the Save button
    Then an error message is displayed indicating the job title is too short
    And the Save button remains disabled

    Examples:
      | job_title | job_description                                            | job_requirements                        |
      | A         | This is a valid job description that meets the requirements. | These are the valid job requirements.  |

  @invalid-job_description
  Scenario Outline: Open Create New Job Opening Form
    Given I enter a job description that exceeds the maximum character limit
    When I enter "<job_title>"
    And I enter "<requirements>"
    And I click the Save button
    Then an error message is displayed indicating the job description exceeds the character limit
    And the Save button remains disabled

    Examples:
      | job_title          | requirements                                                                                                 |
      | Software Engineer   | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development, proficiency in Java and Python. |

@duplicate-job-title
Scenario Outline: Open Create New Job Opening Form
  Given the user enters "<job_title>"
  And the user fills in the job description with "<job_description>"
  And the user fills in the requirements with "<requirements>"
  When the user clicks the Save button
  Then an error message is displayed indicating the job title already exists
  And the Save button remains disabled

  Examples:
    | job_title          | job_description                           | requirements                                                |
    | Software Engineer   | Develop and maintain software applications. | Bachelor's degree in Computer Science or related field, 3+ years of experience. |

  @invalid-job-title
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the requirements "<requirements>"
    When the user clicks the Save button
    Then an error message should be displayed indicating invalid characters in the job title
    And the Save button remains disabled

    Examples:
      | job_title     | job_description         | requirements            |
      | Developer #1  | Job description a * 100 | Requirements a * 100    |

@invalid-job_title_length
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job title "<job_title>"
  And the user enters a job description "<job_description>"
  And the user enters the job requirements "<requirements>"
  When the user clicks the Save button
  Then an error message is displayed indicating the job title exceeds the character limit
  And the Save button remains disabled

  Examples:
    | job_title                                                 | job_description           | requirements            |
    | This is a very long job title that exceeds the limit    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @invalid-job_requirements
  Scenario Outline: Open Create New Job Opening Form
    Given I enter job requirements "<job_requirements>"
    And I enter job title "<job_title>"
    And I enter job description "<job_description>"
    When I click the Save button
    Then an error message is displayed indicating the job requirements exceed the character limit
    And the Save button remains disabled

    Examples:
      | job_requirements                                                                                            | job_title          | job_description                                                                                  |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Software Engineer   | We are looking for a skilled software engineer with experience in developing applications.      |

@validate_character_limits
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job title of "<job_title>"
  And the user enters a job description of "<job_description>"
  And the user enters job requirements of "<job_requirements>"
  When the user clicks the Save button
  Then the form should save successfully without any validation errors
  And the job opening should be created with all fields populated to their maximum limits

  Examples:
    | job_title                            | job_description                       | job_requirements                       |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @empty-fields-validation
  Scenario Outline: Open Create New Job Opening Form with No Input
    Given the user has left all fields empty
    When the user clicks the Save button
    Then validation messages are displayed for all required fields
    And the Save button remains disabled

    Examples:
      | field1 | field2 |
      |        |        |
