package io.gridgo.core.test;

import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

import io.gridgo.core.support.subscription.impl.Condition;
import io.gridgo.framework.support.Message;

public class MiscTest {

    @Test
    public void testCondition() {
        Assert.assertTrue(Condition.of(true).satisfiedBy(null));
        Assert.assertTrue(Condition.of(() -> true).satisfiedBy(null));
        Assert.assertTrue(Condition.of((Predicate<Message>) msg -> true).satisfiedBy(null));
        Assert.assertTrue(Condition.of("1 + 1 == 2").satisfiedBy(null));
    }
}
