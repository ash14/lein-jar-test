# lein-jar-test

Project to reproduce an issue  

## Usage

1. Build the jar with `lein jar`
2. Run the jar with `java -cp ~/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar:target/lein-jar-test.jar lein_jar_test.core`
3. Check out the stack trace
```
Caused by: java.io.FileNotFoundException: Could not locate clojure/tools/reader/reader_types__init.class or clojure/tools/reader/reader_types.clj on classpath. Please check that namespaces with dashes use underscores in the Clojure file name.
```  

- Works without throwing when using clojurescript 1.9.946 
- taoensso/timbre is just used as an example, requiring `[clojure.tools.reader.edn]` directly also reproduces the issue.

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
