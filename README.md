# clojure-static-initialization

A Clojure library demonstrating that Java static initialization code runs when AOT-compiling Clojure code that extends Java classes using `proxy` or
`gen-class`.

## Usage

```
$ lein clean
$ lein compile
```

Notice the line `Running static initializers!` in compiler output.
AOT-compiling either `clojure-static-initialization.gen-class-demo` or
`clojure-static-initialization.proxy-demo` will cause the static initialization
code to run; You can verify this by disabling AOT compilation for either of the
namespace in project.clj.

Switching to a patched version of Clojure using the patch in  [CLJ-1743](http://dev.clojure.org/jira/browse/CLJ-1743) causes the static initialization code not to be run.
