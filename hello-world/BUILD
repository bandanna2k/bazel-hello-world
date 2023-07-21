load("//build:bazel_functions.bzl", "build_module", "build_binary")

build_module(
    name = "hello-world-lib",
    main_deps = [
        "//libs:slf4j",
    ],
)

build_binary(
    name = "hello-world",
    main_class = "helloworld.Main",
    main_deps = [
        ":hello-world-lib",
        "//libs:slf4j",
    ],
)
