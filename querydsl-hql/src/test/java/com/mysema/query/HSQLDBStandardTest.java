/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query;

import org.junit.runner.RunWith;

import com.mysema.testutil.HibernateConfig;
import com.mysema.testutil.HibernateTestRunner;



/**
 * @author tiwe
 *
 */
@RunWith(HibernateTestRunner.class)
@HibernateConfig("hsqldb.properties")
public class HSQLDBStandardTest extends AbstractHibernateTest{
    
    @Override
    protected Target getTarget() {
        return Target.HSQLDB;
    }
}
