# Scala Auxiliary Constructor Bug

This repository demonstrates a potential issue in Scala related to auxiliary constructors.  Auxiliary constructors can be a source of subtle bugs if not carefully designed and chained to the primary constructor.

The provided `bug.scala` file shows a simple example, but more complex scenarios can lead to significantly harder-to-debug problems.  The `bugSolution.scala` file shows how to properly handle auxiliary constructors to avoid unexpected behavior. 