def build_module(
    name,
    visibility = ["//visibility:public"],
    main_deps = []
):
    print('Starting build')

    native.java_library(
            name = name,
            deps = main_deps,
            srcs = native.glob(["src/*"]),
            visibility = visibility,

    )
