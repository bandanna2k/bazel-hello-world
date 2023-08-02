#load("@rules_pkg//pkg:tar.bzl", "pkg_tar")
#load("@rules_oci//oci:defs.bzl", "oci_image")

# Simple Vertx Server
# - Contains Simple Vertx HTTP server listening on 4444
# - To query what to build `bazel query //:*`
# - To build `bazel build //:hello-world-uber_deploy.jar`
# - To run `java -jar bazel-bin/hello-world-uber_deploy.jar &`
# - To use `curl http://localhost:4444/index.html`
java_binary(
    name = "hello-world-uber",
    deps = [
        "//libs:vertx",
    ],
    srcs = glob(["src/**"]),
    resources = glob(["webroot/**"]),
    main_class = "helloworld.Main",
    visibility = ["//visibility:public"],
)