/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.validation.exception;

/**
 * Exception to notify that one single notification has failed
 */
public class ValidationException extends Exception
{

    private static final long serialVersionUID = -6736205148881613778L;

    public ValidationException(String message)
    {
        super(message);
    }
}
