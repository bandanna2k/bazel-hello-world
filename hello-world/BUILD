load("//build:bazel_functions.bzl", "build_module", "test_module", "build_binary")

build_module(
    name = "hello-world-lib",
    main_deps = [
        "//libs:slf4j",
    ],
)

test_module(
    name = "hello-world-test",
    test_deps = [
        ":hello-world-lib",
        "//libs:junit",
    ],
)

build_binary(
    name = "hello-world",
    main_class = "helloworld.MainTest",
    main_deps = [
        ":hello-world-lib",
        "//libs:slf4j",
    ],
)
