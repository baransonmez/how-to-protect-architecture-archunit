package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import dev.barans.howtoprotectarchitecturearchunit.common.RestInboundRequest;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class NamingTest {

    @ArchTest
    static final ArchRule ports_should_have_simple_name_ending_PORT =
            classes().that().resideInAPackage("..ports..")
                    .should().beInterfaces()
                    .andShould().haveSimpleNameEndingWith("Port")
                    .because("The decision was taken in this way to make it easier to see the input and output points of the hexagon.");

    @ArchTest
    static final ArchRule requests_should_implement_rest_inbound_request_interface_and_have_simple_name_ending_REQUEST =
            classes().that().resideInAPackage("..request..")
                    .should().implement(RestInboundRequest.class)
                    .andShould().haveSimpleNameEndingWith("Request")
                    .because("The decision was taken in this way to make it easier to identify rest inbound requests");

}
