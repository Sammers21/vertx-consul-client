/*
 * Copyright (c) 2016 The original author or authors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *      The Eclipse Public License is available at
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *      The Apache License v2.0 is available at
 *      http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.consul;

import io.vertx.ext.consul.suite.AclTokens;
import io.vertx.ext.consul.suite.AgentInfo;
import io.vertx.ext.consul.suite.BrokenClient;
import io.vertx.ext.consul.suite.BrokenConsul;
import io.vertx.ext.consul.suite.Catalog;
import io.vertx.ext.consul.suite.Checks;
import io.vertx.ext.consul.suite.Coordinates;
import io.vertx.ext.consul.suite.Events;
import io.vertx.ext.consul.suite.KVStore;
import io.vertx.ext.consul.suite.PreparedQuery;
import io.vertx.ext.consul.suite.SecureClient;
import io.vertx.ext.consul.suite.Services;
import io.vertx.ext.consul.suite.Sessions;
import io.vertx.ext.consul.suite.Status;
import io.vertx.ext.consul.suite.Transactions;
import io.vertx.ext.consul.suite.Watches;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author <a href="mailto:ruslan.sennov@gmail.com">Ruslan Sennov</a>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  BrokenConsul.class,
  BrokenClient.class,
  AgentInfo.class,
  AclTokens.class,
  Catalog.class,
  Checks.class,
  Coordinates.class,
  Events.class,
  KVStore.class,
  Services.class,
  Sessions.class,
  Status.class,
  SecureClient.class,
  Transactions.class,
  Watches.class,
  PreparedQuery.class
})
public class ConsulClientTest {
}
