def build_binary(
    name,
    main_class,
    visibility = ["//visibility:public"],
    main_deps = [],
):
    native.java_binary(
            name = name,
            deps = main_deps,
            srcs = native.glob(["src/*"]),
            main_class = main_class,
            create_executable = True,
            visibility = visibility,
    )
