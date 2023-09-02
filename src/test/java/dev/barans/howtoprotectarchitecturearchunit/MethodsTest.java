package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class MethodsTest {

    @ArchTest
    static ArchRule all_public_methods_in_the_controller_layer_should_return_API_response_wrappers_and_be_annotated_with_PRE_AUTH =
            methods()
                    .that().areDeclaredInClassesThat().resideInAPackage("..input..")
                    .and().areDeclaredInClassesThat().haveSimpleNameEndingWith("Controller")
                    .and().arePublic()
                    .should().beAnnotatedWith(PreAuthorize.class)
                    .andShould().haveRawReturnType(ResponseEntity.class)
                    .because("ResponseEntity should be used to ensure that we have a standard on the API and " +
                            "return each response in the format we specify.");

}
