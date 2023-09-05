package dev.barans.howtoprotectarchitecturearchunit.common;


import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaField;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.core.domain.properties.HasModifiers;
import com.tngtech.archunit.core.domain.properties.HasType;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class HaveASerialVersionUIDField extends ArchCondition<JavaClass> {


    public HaveASerialVersionUIDField() {
        super("Have a serialVersionUID");
    }

    @Override
    public void check(JavaClass item, ConditionEvents events) {
        String errorMessage = item.getName() + " does not contain valid serialVersionUID field";
        JavaField field = item.getField("serialVersionUID");
        boolean isStatic = HasModifiers.Predicates.modifier(JavaModifier.STATIC).test(field);
        boolean isFinal = HasModifiers.Predicates.modifier(JavaModifier.FINAL).test(field);
        boolean isLong = HasType.Predicates.rawType("long").test(field);
        boolean hasValidSerialVersionUID = isStatic && isFinal && isLong;

        events.add(new SimpleConditionEvent(item, hasValidSerialVersionUID, errorMessage));
    }
}
