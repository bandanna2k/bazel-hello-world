# Bazel Hello World

My tutorial on getting using bazel working. 

- Build a jar file
  - Command `bazel build //hello-world:hello-world-lib`
  - Output `bazel-bin/hello-world/libhello-world-lib.jar`

- Build a executable jar file
  - Command `bazel build bazel-bin/hello-world/hello-world_deploy.jar`
  - Output `bazel-bin/hello-world/hello-world_deploy.jar`
    (this contains the main method)
  - To run `java -jar bazel-bin/hello-world/hello-world_deploy.jar`
  - Notes: Uses 3rd party library

### Todo Checklist

- Java
  - Remove uber jar  
  - Vertx web server
  - Vertx web server hosting a UI framework
  - Unit tests
 
- Other
  - C build (optional)
  - C++ build (optional)

- Closed
  - Move bazel out directories somewhere else (not that nicely done, `bazel --output_user_root=<path>` )




