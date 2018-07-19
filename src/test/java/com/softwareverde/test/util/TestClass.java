package com.softwareverde.test.util;

public class TestClass {
    private final String _className = this.getClass().getSimpleName();
    private String _lastInvocationValue = null;


    private void _testMethod() {
        _lastInvocationValue = _className + "::_testMethod executed.";
    }

    private void _testMethodWithParam(final String string) {
        _lastInvocationValue = _className + "::_testMethodWithParam("+ string +") executed.";
    }

    private String _testFunctionString() {
        _lastInvocationValue = _className + "::_testFunctionString executed.";
        return _lastInvocationValue;
    }

    private String _testFunctionStringWithParam(final String string) {
        _lastInvocationValue = _className + "::_testFunctionStringWithParam("+ string +") executed.";
        return _lastInvocationValue;
    }

    public String getLastInvocationValue() {
        return _lastInvocationValue;
    }
}
