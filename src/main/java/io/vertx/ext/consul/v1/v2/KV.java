package io.vertx.ext.consul.v1.v2;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public interface KV {

  KV get(String key, Handler<AsyncResult<Key>> handler);

  KV put(String key, String value, Handler<AsyncResult<Void>> handler);

}
