package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class DependencyCheckTest {

    @ArchTest
    static final ArchRule domain_should_not_access_infra =
            noClasses().that().resideInAPackage("..domain..")
                    .should().dependOnClassesThat().resideInAPackage("..infra..")
                    .because("the domain layer should not depend on the infrastructure layer" +
                            " to maintain clean separation of concerns and enhance code testability and flexibility.");


}
