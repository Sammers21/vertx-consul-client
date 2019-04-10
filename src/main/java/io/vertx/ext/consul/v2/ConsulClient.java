package io.vertx.ext.consul.v2;


public interface ConsulClient {

  KV kv();

  ACL acl();

  Agent agent();

  Catalog catalog();

  Connect connect();

  Coordinate coordinate();

  Event event();

  Health health();

  Operator operator();

  Query query();

  Session session();

  Snapshot snapshot();

  Status status();

  TXN txn();

}
