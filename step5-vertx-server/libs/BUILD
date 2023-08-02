# PRIVATE
java_import(
    name = "jackson-json",
    jars = [
        "jackson-json/jackson-core-2.15.2.jar",
    ],
)
java_import(
    name = "netty",
    deps = [
        ":jackson-json",
    ],
    jars = [
        "netty/netty-buffer-4.1.95.Final.jar",
        "netty/netty-codec-4.1.95.Final.jar",
        "netty/netty-codec-http-4.1.95.Final.jar",
        "netty/netty-codec-http2-4.1.95.Final.jar",
        "netty/netty-common-4.1.95.Final.jar",
        "netty/netty-handler-4.1.95.Final.jar",
        "netty/netty-handler-proxy-4.1.95.Final.jar",
        "netty/netty-transport-4.1.95.Final.jar",
        "netty/netty-resolver-4.1.95.Final.jar",
        "netty/netty-resolver-dns-4.1.95.Final.jar",
    ],
)

# PUBLIC
java_import(
    name = "vertx",
    deps = [
        ":netty",
    ],
    jars = [
        "vertx/vertx-auth-common-4.4.4.jar",
        "vertx/vertx-core-4.4.4.jar",
        "vertx/vertx-web-4.4.4.jar",
        "vertx/vertx-web-common-4.4.4.jar",
    ],
    visibility = [ "//visibility:public" ],
)
