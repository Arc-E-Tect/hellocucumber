# hellocucumber
Public repo with sample code on how to have cucumber-jvm used from Gradle with different sourceSets for TDD and BDD tests

The intention of this project is to have a simple skeleton project where the cucumber tests (feature and step-defs) are located in their own source-tree without the need to have a separate project.

The resulting file-tree should look like so:

    src/
        cucumberTest/
            java/
                /...
            resources/
                /...
        main/
            java/
                /...
            resources/
                /...
        test/
            /java
                /...
            resources/
                /...
                
