/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.validation;

import org.mule.api.MuleEvent;
import org.mule.transport.NullPayload;

import org.junit.Test;

public class NullValidationTestCase extends AbstractValidationModuleTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "validation-null-test-config.xml";
    }

    @Test
    public void notNull() throws Exception
    {
        MuleEvent event = getTestEvent("");
        event.setFlowVariable("nullValue", NullPayload.getInstance());
        this.validate("null", event);
    }
}
