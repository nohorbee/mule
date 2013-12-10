/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.validation;

import org.mule.api.MuleEvent;

public interface Validator
{

    public boolean isValid(MuleEvent event);

    public String getErrorMessage(MuleEvent event);
}
