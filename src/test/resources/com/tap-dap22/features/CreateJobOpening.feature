
@feature_create_job_opening
Feature: CreateJobOpening

Background: 
  Given the user is on the Dashboard

@navigate_to_job_opening
Scenario Outline: Create Job Opening
  When I click on the "Job Opening" option in the side navigation
  Then the Job Opening screen should be displayed
  And the "Add Job Opening" button should be visible

  Examples:
    |   |

  @open_create_job_opening
  Scenario Outline: Create Job Opening
    When the user clicks on the Add Job Opening button
    Then the Create New Job Opening form should be opened
    And the Save and Cancel buttons should be displayed

    Examples:
      | action                |
      | Add Job Opening       |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the user selects a Job Role "<job_role>"
  And the user selects a Location "<location>"
  And the user enters Minimum Experience "<min_experience>"
  And the user enters Maximum Experience "<max_experience>"
  And the user enters Qualification "<qualification>"
  And the user enters Short Job Description "<short_description>"
  And the user enters Responsibilities "<responsibilities>"
  And the user clicks on "Save"
  Then the job opening should be saved successfully
  Then the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location   | min_experience | max_experience | qualification       | short_description                      | responsibilities                                       |
    | Software Engineer | New York   | 2              | 5              | Bachelor's Degree    | This is a short job description.      | 1. Develop software solutions. 2. Collaborate with team members. |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<minimum_experience>"
    And the recruiter leaves Maximum Experience blank
    And the recruiter enters Qualification "<qualification>"
    And the recruiter leaves Responsibilities blank
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role         | location   | minimum_experience | qualification       |
      | Software Engineer | New York   | 3                  | Bachelor's Degree    |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the job role "<job_role>"
    And the recruiter selects the location "<location>"
    And the recruiter enters the minimum experience "<min_experience>"
    And the recruiter enters the maximum experience "<max_experience>"
    And the recruiter enters the qualification "<qualification>"
    And the recruiter enters the tags "<tags>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct tags

    Examples:
      | job_role         | location    | min_experience | max_experience | qualification       | tags                     |
      | Software Engineer | New York    | 2              | 5              | Bachelor's Degree     | Java, Python, SQL       |

  @job-opening-creation
  Scenario Outline: Create Job Opening with Valid Vendor
    When the recruiter selects a Job Role "<jobRole>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<minExperience>"
    And the recruiter enters Maximum Experience "<maxExperience>"
    And the recruiter enters Qualification "<qualification>"
    And the recruiter selects a Vendor "<vendor>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct vendor

    Examples:
      | jobRole          | location    | minExperience | maxExperience | qualification      | vendor    |
      | Software Engineer | New York    | 2             | 5             | Bachelor's Degree   | Vendor A  |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<min_experience>"
    And the recruiter enters Maximum Experience "<max_experience>"
    And the recruiter enters Qualification "<qualification>"
    And the recruiter selects a valid Work Mode "<work_mode>"
    When the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct work mode

    Examples:
      | job_role          | location   | min_experience | max_experience | qualification     | work_mode |
      | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree   | Remote    |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Valid Department
    When I select a Job Role "<job_role>"
    And I select a Location "<location>"
    And I enter Minimum Experience "<min_experience>"
    And I enter Maximum Experience "<max_experience>"
    And I enter Qualification "<qualification>"
    And I enter a valid Department "<department>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct department

    Examples:
      | job_role         | location  | min_experience | max_experience | qualification       | department    |
      | Software Engineer | New York  | 2              | 5              | Bachelor's Degree    | Engineering    |

@valid-job-opening
Scenario Outline: Create Job Opening with Valid Industry Type
  Given the user selects a Job Role "<job_role>"
  And the user selects a Location "<location>"
  And the user enters Minimum Experience "<min_experience>"
  And the user enters Maximum Experience "<max_experience>"
  And the user enters Qualification "<qualification>"
  And the user enters a valid Industry Type "<industry_type>"
  When the user clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct industry type

  Examples:
    | job_role          | location   | min_experience | max_experience | qualification      | industry_type         |
    | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree   | Information Technology  |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Valid Skills
    When the user selects a Job Role
    And the user selects a Location
    And the user enters Minimum Experience
    And the user enters Maximum Experience
    And the user enters Qualification
    And the user enters valid Primary Skills
    And the user enters valid Secondary Skills
    And the user clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct skills

    Examples:
      | Job Role    | Location      | Min Experience | Max Experience | Qualification | Primary Skills | Secondary Skills |
      | Developer   | New York      | 2              | 5              | Bachelor       | Java, SQL      | Python, JavaScript |
