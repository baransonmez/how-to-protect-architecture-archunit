package dev.barans.howtoprotectarchitecturearchunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "dev.barans.howtoprotectarchitecturearchunit.hexagonal")
public class AnnotationTest {

    @ArchTest
    static ArchRule no_classes_should_depend_on_deprecated_functions = noClasses().should()
            .dependOnClassesThat()
            .areAnnotatedWith(Deprecated.class);

}
