package io.vertx.ext.consul;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.ProxyIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.serviceproxy.ProxyHelper;

import java.util.List;

@ProxyGen
@VertxGen
public interface ConsulService extends ConsulClient {

  /**
   * Create a proxy to a service that is deployed somewhere on the event bus
   *
   * @param vertx   the Vert.x instance
   * @param address the address the service is listening on on the event bus
   * @return the service
   */
  static ConsulService createEventBusProxy(Vertx vertx, String address) {
    return ProxyHelper.createProxy(ConsulService.class, vertx, address);
  }

  @Override
  @Fluent
  ConsulService agentInfo(Handler<AsyncResult<JsonObject>> resultHandler);

  @Override
  @Fluent
  ConsulService coordinateNodes(Handler<AsyncResult<List<Coordinate>>> resultHandler);

  @Override
  @Fluent
  ConsulService coordinateDatacenters(Handler<AsyncResult<List<DcCoordinates>>> resultHandler);

  @Override
  @Fluent
  ConsulService getValue(String key, Handler<AsyncResult<KeyValue>> resultHandler);

  @Override
  @Fluent
  ConsulService getValueWithOptions(String key, BlockingQueryOptions options, Handler<AsyncResult<KeyValue>> resultHandler);

  @Override
  @Fluent
  ConsulService deleteValue(String key, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService getValues(String keyPrefix, Handler<AsyncResult<List<KeyValue>>> resultHandler);

  @Override
  @Fluent
  ConsulService getValuesWithOptions(String keyPrefix, BlockingQueryOptions options, Handler<AsyncResult<List<KeyValue>>> resultHandler);

  @Override
  @Fluent
  ConsulService deleteValues(String keyPrefix, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService putValue(String key, String value, Handler<AsyncResult<Boolean>> resultHandler);

  @Override
  @Fluent
  ConsulService putValueWithOptions(String key, String value, KeyValueOptions options, Handler<AsyncResult<Boolean>> resultHandler);

  @Override
  @Fluent
  ConsulService createAclToken(AclToken token, Handler<AsyncResult<String>> idHandler);

  @Override
  @Fluent
  ConsulService updateAclToken(AclToken token, Handler<AsyncResult<String>> idHandler);

  @Override
  @Fluent
  ConsulService cloneAclToken(String id, Handler<AsyncResult<String>> idHandler);

  @Override
  @Fluent
  ConsulService listAclTokens(Handler<AsyncResult<List<AclToken>>> resultHandler);

  @Override
  @Fluent
  ConsulService infoAclToken(String id, Handler<AsyncResult<AclToken>> tokenHandler);

  @Override
  @Fluent
  ConsulService destroyAclToken(String id, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService fireEvent(String name, Handler<AsyncResult<Event>> resultHandler);

  @Override
  @Fluent
  ConsulService fireEventWithOptions(String name, EventOptions options, Handler<AsyncResult<Event>> resultHandler);

  @Override
  @Fluent
  ConsulService listEvents(Handler<AsyncResult<List<Event>>> resultHandler);

  @Override
  @Fluent
  ConsulService registerService(ServiceOptions serviceOptions, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService maintenanceService(MaintenanceOptions maintenanceOptions, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService deregisterService(String id, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogServiceNodes(String service, Handler<AsyncResult<ServiceList>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogServiceNodesWithOptions(String service, ServiceQueryOptions options, Handler<AsyncResult<ServiceList>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogDatacenters(Handler<AsyncResult<List<String>>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogNodes(Handler<AsyncResult<NodeList>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogNodesWithOptions(NodeQueryOptions options, Handler<AsyncResult<NodeList>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogServices(Handler<AsyncResult<ServiceList>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogServicesWithOptions(BlockingQueryOptions options, Handler<AsyncResult<ServiceList>> resultHandler);

  @Override
  @Fluent
  ConsulService localServices(Handler<AsyncResult<List<Service>>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogNodeServices(String node, Handler<AsyncResult<ServiceList>> resultHandler);

  @Override
  @Fluent
  ConsulService catalogNodeServicesWithOptions(String node, BlockingQueryOptions options, Handler<AsyncResult<ServiceList>> resultHandler);

  @Override
  @Fluent
  ConsulService localChecks(Handler<AsyncResult<List<Check>>> resultHandler);

  @Override
  @Fluent
  ConsulService registerCheck(CheckOptions checkOptions, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService deregisterCheck(String checkId, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService passCheck(String checkId, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService passCheckWithNote(String checkId, String note, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService warnCheck(String checkId, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService warnCheckWithNote(String checkId, String note, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService failCheck(String checkId, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService failCheckWithNote(String checkId, String note, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService updateCheck(String checkId, CheckStatus status, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService updateCheckWithNote(String checkId, CheckStatus status, String note, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @Fluent
  ConsulService leaderStatus(Handler<AsyncResult<String>> resultHandler);

  @Override
  @Fluent
  ConsulService peersStatus(Handler<AsyncResult<List<String>>> resultHandler);

  @Override
  @Fluent
  ConsulService createSession(Handler<AsyncResult<String>> idHandler);

  @Override
  @Fluent
  ConsulService createSessionWithOptions(SessionOptions options, Handler<AsyncResult<String>> idHandler);

  @Override
  @Fluent
  ConsulService infoSession(String id, Handler<AsyncResult<Session>> resultHandler);

  @Override
  @Fluent
  ConsulService infoSessionWithOptions(String id, BlockingQueryOptions options, Handler<AsyncResult<Session>> resultHandler);

  @Override
  @Fluent
  ConsulService renewSession(String id, Handler<AsyncResult<Session>> resultHandler);

  @Override
  @Fluent
  ConsulService listSessions(Handler<AsyncResult<SessionList>> resultHandler);

  @Override
  @Fluent
  ConsulService listSessionsWithOptions(BlockingQueryOptions options, Handler<AsyncResult<SessionList>> resultHandler);

  @Override
  @Fluent
  ConsulService listNodeSessions(String nodeId, Handler<AsyncResult<SessionList>> resultHandler);

  @Override
  @Fluent
  ConsulService listNodeSessionsWithOptions(String nodeId, BlockingQueryOptions options, Handler<AsyncResult<SessionList>> resultHandler);

  @Override
  @Fluent
  ConsulService destroySession(String id, Handler<AsyncResult<Void>> resultHandler);

  @Override
  @ProxyIgnore
  void close();
}