/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/**
* Generated file

* Generated from: yang module name: threadpool-impl-fixed  yang module local name: threadpool-fixed
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sun Dec 01 17:13:32 CET 2013
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.threadpool.impl.fixed;

import org.opendaylight.controller.config.api.JmxAttributeValidationException;
import org.opendaylight.controller.config.threadpool.util.FixedThreadPoolWrapper;

/**
*
*/
public final class FixedThreadPoolModule extends org.opendaylight.controller.config.yang.threadpool.impl.fixed.AbstractFixedThreadPoolModule
{

    public FixedThreadPoolModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public FixedThreadPoolModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, FixedThreadPoolModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate(){
        super.validate();

        JmxAttributeValidationException.checkNotNull(getMaxThreadCount(), maxThreadCountJmxAttribute);
        JmxAttributeValidationException.checkCondition(getMaxThreadCount() > 0, "must be greater than zero",
                maxThreadCountJmxAttribute);
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        return new FixedThreadPoolWrapper(getMaxThreadCount(), getThreadFactoryDependency());
    }
}
