package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class FieldsTest {

    @ArchTest
    static ArchRule public_static_fields_must_be_final = fields().that()
            .arePublic()
            .and().areStatic()
            .should().beFinal()
            .because("we dont want to change public fields' state");
}
