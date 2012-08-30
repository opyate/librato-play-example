# Librato Play! 2.0 example

Showing how a [Metrics](http://metrics.codahale.com/)-metered [Play! 2.0 Scala app](http://www.playframework.org/documentation/2.0.3/ScalaTodoList) can send its
measurements to [Librato](http://librato.com) for collection, storage and visualization.

# Running the example

Run the following command from the command line, substituting your values where necessary:

    LIBRATO_APIKEY="<your key>" LIBRATO_USERNAME="<your username>" ./sbt

Once in the sbt console, type ```run``` and head on over to [http://localhost:9000 or type ```run <portnumber>``` and head on over to http://localhost:<portnumber>.

# Issues

I'm currently working with Librto support to sort out the following issue:

[https://github.com/librato/metrics-librato/issues/2](https://github.com/librato/metrics-librato/issues/2)

The error I'm getting is:

    [error] c.l.m.LibratoBatch - Received an error from Librato API. Code : %d, Message: %s
