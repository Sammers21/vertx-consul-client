package io.vertx.ext.consul.v2.acl.policy;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.consul.v2.acl.token.TokenInfo;

import java.util.List;

public interface Policies {

  Policies list(Handler<AsyncResult<List<TokenInfo>>> handler);
}
