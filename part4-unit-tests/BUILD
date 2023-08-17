# Unit Test Java
# - Uses takari cpsuite for annotations to run ALL tests
# - To query what to build `bazel query //:*`
# - To test `bazel test //:test-hello-world`
# - Force re-test `bazel test //:test-hello-world --cache_test_results=no`
# - Test with more detail `bazel test //:test-hello-world --test_summary=detailed`
# - Test 1 individual suite `bazel test //:test-hello-world --test_filter=helloworld.AnotherTest --test_summary=detailed --cache_test_results=no`

java_test(
    name = "test-hello-world",
    srcs = glob(["src/**", "test/**"]),
    deps = [
        "//libs:takari-cpsuite"
    ],
    test_class = "helloworld.AllTests",
)