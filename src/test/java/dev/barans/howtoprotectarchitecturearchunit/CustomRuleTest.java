package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import dev.barans.howtoprotectarchitecturearchunit.common.HaveASerialVersionUIDField;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

import java.io.Serializable;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class CustomRuleTest {

    @ArchTest
    static ArchRule serializable_classes_should_have_valid_serialVersionUID_field =
            classes().that().areAssignableTo(Serializable.class)
                    .and().areNotEnums()
                    .and().areNotInterfaces()
                    .should(new HaveASerialVersionUIDField())
                    .because("ResponseEntity should be used to ensure that we have a standard on the API and " +
                            "return each response in the format we specify.");

}
