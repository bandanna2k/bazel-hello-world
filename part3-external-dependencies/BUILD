
# Executable Java Uber Jar
# - Contains compiled sources, dependencies, and manifest
# - To query what to build `bazel query //:*`
# - To build `bazel build //:hello-world-uber_deploy.jar`
# - To run `java -jar bazel-bin/hello-world-uber_deploy.jar`
java_binary(
        name = "hello-world-uber",
        deps = [
            "//libs:slf4j",
        ],
        srcs = glob(["src/**"]),
        main_class = "helloworld.Main",
        visibility = ["//visibility:public"],
)