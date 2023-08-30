package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class NamingTest {

    @ArchTest
    static final ArchRule ports_should_should_have_simple_name_ending_PORT =
            classes().that().resideInAPackage("..ports..")
                    .should().beInterfaces()
                    .andShould().haveSimpleNameEndingWith("Port")
                    .because("The decision was taken in this way to make it easier to see the input and output points of the hexagon.");


}
