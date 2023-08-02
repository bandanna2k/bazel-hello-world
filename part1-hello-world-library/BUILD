
# Java Library
# - Contains compiled sources only, no dependencies
# - To query what to build `bazel query //:*`
# - To build `bazel build //:hello-world`, output is `bazel-bin/libhello-world.jar`
# - To run `java -cp bazel-bin/libhello-world.jar helloworld.Main`

java_library(
        name = "hello-world",
        deps = [],
        srcs = glob(["src/**"]),
)
