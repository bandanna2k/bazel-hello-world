# Introduction to Bazel

## The Bazel Challenge

Can I write Bazel to perform all of the following?

1. Build a Java library
2. Build an executable Java jar file
3. Build a jar file with an external dependency (external jar file)
4. Run unit tests
5. Build a vertx server
6. Build and run a vertx server in a container
7. Build a vertx server running some Vue javascript (TODO)
8. Build a vertx server running some Vue javascript which is debuggable (TODO)
 
___

### Example 1, Java Library 

- To build Java library jar `bazel build //:hello-world`
- To run Executable Jar `java -cp bazel-bin/hello-world-uber_deploy.jar helloworld.Main`

### Example 2, Executable Java jar

- To build Executable Uber Jar `bazel build //:hello-world-uber_deploy.jar` <- Note: Weird bazel thing about _deploy.jar
- To run Executable Uber Jar `java -jar java -jar bazel-bin/hello-world-uber_deploy.jar`

### Example 3, Build a Jar with an external dependency

- Same as example 2

### Example 4, Run Unit Tests

Note: Uses **takari cpsuite** dependency to run ALL tests
- To query what to build `bazel query //:*`
- To test `bazel test //:test-hello-world`
- Force re-test `bazel test //:test-hello-world --cache_test_results=no`
- Test with more detail `bazel test //:test-hello-world --test_summary=detailed`

### Example 5, Build a vertx server

Contains Simple Vertx HTTP server listening on 4444

- To query what to build `bazel query //:*`
- To build `bazel build //:hello-world-uber_deploy.jar`
- To run `java -jar bazel-bin/hello-world-uber_deploy.jar &`
- To use `curl http://localhost:4444/index.html`

### Example 6, Build and run a vertx server in a container (image build with OCI bazel rules)

- To build image `bazel build //:hello-world-tarball`
- To push to local `docker load < bazel-bin/hello-world-tarball/tarball.tar`
- To run `docker run -d --rm -p 4444:4444 hello-world-java-bazel`
- To use `curl -vvv http://localhost:4444/index.html`