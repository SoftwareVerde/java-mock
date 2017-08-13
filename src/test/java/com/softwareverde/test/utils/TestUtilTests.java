package com.softwareverde.test.utils;

import org.junit.Assert;
import org.junit.Test;

public class TestUtilTests {

    @Test
    public void should_get_existing_private_property() {
        // Setup
        final TestClass testClass = new TestClass();
        final String expectedClassName = testClass.getClass().getSimpleName();

        // Action
        final String className = TestUtil.getValue(testClass, "_className");

        // Assert
        Assert.assertEquals(expectedClassName, className);
    }

    @Test
    public void should_get_existing_private_inherited_property() {
        // Setup
        final TestClass testClass = new TestChildClass();
        final String expectedClassName = testClass.getClass().getSimpleName();

        // Action
        final String className = TestUtil.getValue(testClass, "_className");

        // Assert
        Assert.assertEquals(expectedClassName, className);
    }

    @Test
    public void should_set_existing_private_property() {
        // Setup
        final TestClass testClass = new TestClass();
        final String expectedValue = "Expected Value";

        // Action
        TestUtil.setValue(testClass, "_lastInvocationValue", expectedValue);

        // Assert
        Assert.assertEquals(expectedValue, testClass.getLastInvocationValue());
    }

    @Test
    public void should_invoke_existing_private_function() {
        // Setup
        final TestClass testClass = new TestClass();
        final String expectedReturnValue = testClass.getClass().getSimpleName() + "::_testFunctionString executed.";

        // Action
        final String returnValue = TestUtil.invoke(testClass, "_testFunctionString");

        // Assert
        Assert.assertEquals(expectedReturnValue, returnValue);
    }

    @Test
    public void should_invoke_existing_private_inherited_function() {
        // Setup
        final TestClass testClass = new TestChildClass();
        final String expectedReturnValue = testClass.getClass().getSimpleName() + "::_testFunctionString executed.";

        // Action
        final String returnValue = TestUtil.invoke(testClass, "_testFunctionString");

        // Assert
        Assert.assertEquals(expectedReturnValue, returnValue);
    }

    @Test
    public void should_invoke_existing_private_method_with_param() {
        // Setup
        final String string = "string";
        final TestClass testClass = new TestClass();
        final String expectedLastInvocationValue = testClass.getClass().getSimpleName() + "::_testMethodWithParam("+ string +") executed.";

        // Action
        TestUtil.invoke(testClass, "_testMethodWithParam", string);

        // Assert
        Assert.assertEquals(expectedLastInvocationValue, testClass.getLastInvocationValue());
    }

    @Test
    public void should_invoke_existing_private_inherited_method_with_param() {
        // Setup
        final String string = "string";
        final TestClass testClass = new TestChildClass();
        final String expectedLastInvocationValue = testClass.getClass().getSimpleName() + "::_testMethodWithParam("+ string +") executed.";

        // Action
        TestUtil.invoke(testClass, "_testMethodWithParam", string);

        // Assert
        Assert.assertEquals(expectedLastInvocationValue, testClass.getLastInvocationValue());
    }

    @Test
    public void should_invoke_existing_private_function_with_param() {
        // Setup
        final String string = "string";
        final TestClass testClass = new TestClass();
        final String expectedReturnValue = testClass.getClass().getSimpleName() + "::_testFunctionStringWithParam("+ string +") executed.";

        // Action
        final String returnValue = TestUtil.invoke(testClass, "_testFunctionStringWithParam", string);

        // Assert
        Assert.assertEquals(expectedReturnValue, returnValue);
    }

    @Test
    public void should_invoke_existing_private_inherited_function_with_param() {
        // Setup
        final String string = "string";
        final TestClass testClass = new TestChildClass();
        final String expectedReturnValue = testClass.getClass().getSimpleName() + "::_testFunctionStringWithParam("+ string +") executed.";

        // Action
        final String returnValue = TestUtil.invoke(testClass, "_testFunctionStringWithParam", string);

        // Assert
        Assert.assertEquals(expectedReturnValue, returnValue);
    }
}
