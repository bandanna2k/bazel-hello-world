def build_module(
    name,
    visibility = ["//visibility:public"],
    main_deps = []):

    this_target = ":" + name

    print('Starting build')

    native.java_library(
            name,
            deps = main_deps,
            srcs = glob(["src/*"]),
            visibility = visibility,
    )