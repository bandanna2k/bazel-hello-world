def build_module(
    name,
    visibility = ["//visibility:public"],
    main_deps = []
):
    native.java_library(
            name = name,
            deps = main_deps,
            srcs = native.glob(["src/**"]),
            resources = native.glob(["resources/**"]),
            visibility = visibility,
    )

def build_binary(
    name,
    main_class,
    visibility = ["//visibility:public"],
    main_deps = [],
):
    native.java_binary(
            name = name,
            deps = main_deps,
            srcs = native.glob(["src/**"]),
            main_class = main_class,
            visibility = visibility,
    )

def test_module(
    name,
    visibility = ["//visibility:public"],
    test_deps = []
):
    native.java_test(
        name = name,
        srcs = native.glob(["src/**", "test/**"]),
        resources = native.glob(["resources/**"]),
        runtime_deps = test_deps,
    )
