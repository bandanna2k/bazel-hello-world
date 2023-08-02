package helloworld;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.handler.TimeoutHandler;

public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    private void start()
    {
        final Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new AbstractVerticle() {
                    @Override
                    public void start(Promise<Void> startPromise) {
                        final Router router = Router.router(vertx);

                        router.route().handler(TimeoutHandler.create(5000));
                        router.get("/*").handler(StaticHandler.create("webroot"));

                        int port = 4444;
                        vertx.createHttpServer(new HttpServerOptions())
                                .requestHandler(router)
                                .listen(port)
                                .<Void>mapEmpty()
                                .onSuccess(server ->
                                        System.out.println("HTTP Server started on " + port))
                                .onComplete(startPromise);
                    }
                })
                .onFailure(System.out::println)
                .onSuccess(event -> System.out.println("Successful deployment."));
    }
}